package top.franxx.blog.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyWebAppConfigurer implements WebMvcConfigurer {
    @Override
    public void addViewControllers( ViewControllerRegistry registry ) {
        //设置默认页
        registry.addViewController( "/" ).setViewName( "forward:/home" );
        registry.setOrder( Ordered.HIGHEST_PRECEDENCE );
      //  addViewControllers( registry );
    }
    //2
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //设置资源文件(静态文件)目录
        registry.addResourceHandler("/static/**")
                .addResourceLocations("classpath:/static/");
    }
    //springboot 2.0以上的方式
    @Configuration
    public class WebMvcConfig implements WebMvcConfigurer {

        @Override
        public void addCorsMappings(CorsRegistry registry) {
            registry.addMapping("/**")
                    .allowedHeaders("Content-Type","X-Requested-With","accept,Origin","Access-Control-Request-Method","Access-Control-Request-Headers","token")
                    .allowedMethods("*")
                    .allowedOrigins("*")
                    .allowCredentials(true);
        }
    }
}
