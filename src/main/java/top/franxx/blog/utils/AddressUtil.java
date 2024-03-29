package top.franxx.blog.utils;

import com.github.pagehelper.util.StringUtil;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class AddressUtil {

    public static void main(String[] args) {
        String ip = "180.137.221.100";
        String address = "";
        try {
            address = AddressUtil.getAddresses(ip, "utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println(address);
    }
    public static String getAddresses(String ip,String encodingString)throws UnsupportedEncodingException {
        String content="ip="+ip;
        // 这里调用pconline的接口
        String urlStr = "http://ip.taobao.com/service/getIpInfo.php";
        // 从http://whois.pconline.com.cn取得IP所在的省市区信息
        String returnStr = getResult(urlStr, content, encodingString);
        if (returnStr != null) {
            // 处理返回的省市区信息
            System.out.println("IP====="+returnStr);
            String[] temp = returnStr.split(",");
            if(temp.length<3){
                return "0";                                        //无效IP，局域网测试
            }
            String region = (temp[4].split(":"))[1].replaceAll("\"", "");
            region = decodeUnicode(region);                        // 省
            System.out.println("region = "+region);
            String country = "";
            String area = "";
            String city = "";
            String county = "";
            String isp = "";
            System.out.println("temp的长度="+temp.length);
            for (int i = 0; i < temp.length; i++) {
                switch (i) {
                    //如果这里使用的是其他接口 可以看returnStr打印出来的信息然后根据具体的位置进行调整case n;
                    case 4:
                        region = (temp[i].split(":"))[1].replaceAll("\"", "");
                        region = decodeUnicode(region);            // 省份
                        break;
                    case 5:
                        city = (temp[i].split(":"))[1].replaceAll("\"", "");
                        city = decodeUnicode(city);                // 市区
                        break;
                    case 7:
                        isp = (temp[i].split(":"))[1].replaceAll("\"", "");
                        isp = decodeUnicode(isp);                 // ISP公司
                        break;
                }
            }
            StringBuffer address=new StringBuffer();
            if(StringUtil.isNotEmpty(region)){
                address.append(region);
            }
            if(StringUtil.isNotEmpty(city)){
                address.append(city+"市     ");
            }
            if(StringUtil.isNotEmpty(isp)){
                address.append(isp);
            }
            return address.toString();
        }
        return null;
    }

    /**
     * @param urlStr
     *   请求的地址
     * @param content
     *   请求的参数 格式为：name=xxx&pwd=xxx
     * @param encoding
     *   服务器端请求编码。如GBK,UTF-8等
     * @return
     */
    private static String getResult(String urlStr, String content, String encoding) {
        URL url = null;
        HttpURLConnection connection = null;
        try {
            url = new URL(urlStr);
            connection = (HttpURLConnection) url.openConnection();  // 新建连接实例
            connection.setConnectTimeout(2000);                     // 设置连接超时时间，单位毫秒
            connection.setReadTimeout(2000);                        // 设置读取数据超时时间，单位毫秒
            connection.setDoOutput(true);                           // 是否打开输出流 true|false
            connection.setDoInput(true);                            // 是否打开输入流true|false
            connection.setRequestMethod("POST");                    // 提交方法POST|GET
            connection.setUseCaches(false);                         // 是否缓存true|false
            connection.connect();                                   // 打开连接端口
            DataOutputStream out = new DataOutputStream(connection.getOutputStream());// 打开输出流往对端服务器写数据
            out.writeBytes(content);                                // 写数据,也就是提交你的表单 name=xxx&pwd=xxx
            out.flush();                                            // 刷新
            out.close();                                            // 关闭输出流
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream(), encoding));// 往对端写完数据对端服务器返回数据 ,以BufferedReader流来读取
            StringBuffer buffer = new StringBuffer();
            String line = "";
            while ((line = reader.readLine()) != null) {
                buffer.append(line);
            }
            reader.close();
            return buffer.toString();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                connection.disconnect();                            // 关闭连接
            }
        }
        return null;
    }
    /**
     * unicode 转换成 中文
     *
     * @author fanhui 2007-3-15
     * @param theString
     * @return
     */
    public static String decodeUnicode(String theString) {
        char aChar;
        int len = theString.length();
        StringBuffer outBuffer = new StringBuffer(len);
        for (int x = 0; x < len;) {
            aChar = theString.charAt(x++);
            if (aChar == '\\') {
                aChar = theString.charAt(x++);
                if (aChar == 'u') {
                    int value = 0;
                    for (int i = 0; i < 4; i++) {
                        aChar = theString.charAt(x++);
                        switch (aChar) {
                            case '0':
                            case '1':
                            case '2':
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                            case '8':
                            case '9':
                                value = (value << 4) + aChar - '0';
                                break;
                            case 'a':
                            case 'b':
                            case 'c':
                            case 'd':
                            case 'e':
                            case 'f':
                                value = (value << 4) + 10 + aChar - 'a';
                                break;
                            case 'A':
                            case 'B':
                            case 'C':
                            case 'D':
                            case 'E':
                            case 'F':
                                value = (value << 4) + 10 + aChar - 'A';
                                break;
                            default:
                                throw new IllegalArgumentException(
                                        "Malformed  encoding.");
                        }
                    }
                    outBuffer.append((char) value);
                } else {
                    if (aChar == 't') {
                        aChar = '\t';
                    } else if (aChar == 'r') {
                        aChar = '\r';
                    } else if (aChar == 'n') {
                        aChar = '\n';
                    } else if (aChar == 'f') {
                        aChar = '\f';
                    }
                    outBuffer.append(aChar);
                }
            } else {
                outBuffer.append(aChar);
            }
        }
        return outBuffer.toString();
    }
}
