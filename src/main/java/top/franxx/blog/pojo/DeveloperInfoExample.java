package top.franxx.blog.pojo;

import java.util.ArrayList;
import java.util.List;

public class DeveloperInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeveloperInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andDevNicknameIsNull() {
            addCriterion("dev_nickname is null");
            return (Criteria) this;
        }

        public Criteria andDevNicknameIsNotNull() {
            addCriterion("dev_nickname is not null");
            return (Criteria) this;
        }

        public Criteria andDevNicknameEqualTo(String value) {
            addCriterion("dev_nickname =", value, "devNickname");
            return (Criteria) this;
        }

        public Criteria andDevNicknameNotEqualTo(String value) {
            addCriterion("dev_nickname <>", value, "devNickname");
            return (Criteria) this;
        }

        public Criteria andDevNicknameGreaterThan(String value) {
            addCriterion("dev_nickname >", value, "devNickname");
            return (Criteria) this;
        }

        public Criteria andDevNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("dev_nickname >=", value, "devNickname");
            return (Criteria) this;
        }

        public Criteria andDevNicknameLessThan(String value) {
            addCriterion("dev_nickname <", value, "devNickname");
            return (Criteria) this;
        }

        public Criteria andDevNicknameLessThanOrEqualTo(String value) {
            addCriterion("dev_nickname <=", value, "devNickname");
            return (Criteria) this;
        }

        public Criteria andDevNicknameLike(String value) {
            addCriterion("dev_nickname like", value, "devNickname");
            return (Criteria) this;
        }

        public Criteria andDevNicknameNotLike(String value) {
            addCriterion("dev_nickname not like", value, "devNickname");
            return (Criteria) this;
        }

        public Criteria andDevNicknameIn(List<String> values) {
            addCriterion("dev_nickname in", values, "devNickname");
            return (Criteria) this;
        }

        public Criteria andDevNicknameNotIn(List<String> values) {
            addCriterion("dev_nickname not in", values, "devNickname");
            return (Criteria) this;
        }

        public Criteria andDevNicknameBetween(String value1, String value2) {
            addCriterion("dev_nickname between", value1, value2, "devNickname");
            return (Criteria) this;
        }

        public Criteria andDevNicknameNotBetween(String value1, String value2) {
            addCriterion("dev_nickname not between", value1, value2, "devNickname");
            return (Criteria) this;
        }

        public Criteria andDevIntroIsNull() {
            addCriterion("dev_intro is null");
            return (Criteria) this;
        }

        public Criteria andDevIntroIsNotNull() {
            addCriterion("dev_intro is not null");
            return (Criteria) this;
        }

        public Criteria andDevIntroEqualTo(String value) {
            addCriterion("dev_intro =", value, "devIntro");
            return (Criteria) this;
        }

        public Criteria andDevIntroNotEqualTo(String value) {
            addCriterion("dev_intro <>", value, "devIntro");
            return (Criteria) this;
        }

        public Criteria andDevIntroGreaterThan(String value) {
            addCriterion("dev_intro >", value, "devIntro");
            return (Criteria) this;
        }

        public Criteria andDevIntroGreaterThanOrEqualTo(String value) {
            addCriterion("dev_intro >=", value, "devIntro");
            return (Criteria) this;
        }

        public Criteria andDevIntroLessThan(String value) {
            addCriterion("dev_intro <", value, "devIntro");
            return (Criteria) this;
        }

        public Criteria andDevIntroLessThanOrEqualTo(String value) {
            addCriterion("dev_intro <=", value, "devIntro");
            return (Criteria) this;
        }

        public Criteria andDevIntroLike(String value) {
            addCriterion("dev_intro like", value, "devIntro");
            return (Criteria) this;
        }

        public Criteria andDevIntroNotLike(String value) {
            addCriterion("dev_intro not like", value, "devIntro");
            return (Criteria) this;
        }

        public Criteria andDevIntroIn(List<String> values) {
            addCriterion("dev_intro in", values, "devIntro");
            return (Criteria) this;
        }

        public Criteria andDevIntroNotIn(List<String> values) {
            addCriterion("dev_intro not in", values, "devIntro");
            return (Criteria) this;
        }

        public Criteria andDevIntroBetween(String value1, String value2) {
            addCriterion("dev_intro between", value1, value2, "devIntro");
            return (Criteria) this;
        }

        public Criteria andDevIntroNotBetween(String value1, String value2) {
            addCriterion("dev_intro not between", value1, value2, "devIntro");
            return (Criteria) this;
        }

        public Criteria andDevLocationIsNull() {
            addCriterion("dev_location is null");
            return (Criteria) this;
        }

        public Criteria andDevLocationIsNotNull() {
            addCriterion("dev_location is not null");
            return (Criteria) this;
        }

        public Criteria andDevLocationEqualTo(String value) {
            addCriterion("dev_location =", value, "devLocation");
            return (Criteria) this;
        }

        public Criteria andDevLocationNotEqualTo(String value) {
            addCriterion("dev_location <>", value, "devLocation");
            return (Criteria) this;
        }

        public Criteria andDevLocationGreaterThan(String value) {
            addCriterion("dev_location >", value, "devLocation");
            return (Criteria) this;
        }

        public Criteria andDevLocationGreaterThanOrEqualTo(String value) {
            addCriterion("dev_location >=", value, "devLocation");
            return (Criteria) this;
        }

        public Criteria andDevLocationLessThan(String value) {
            addCriterion("dev_location <", value, "devLocation");
            return (Criteria) this;
        }

        public Criteria andDevLocationLessThanOrEqualTo(String value) {
            addCriterion("dev_location <=", value, "devLocation");
            return (Criteria) this;
        }

        public Criteria andDevLocationLike(String value) {
            addCriterion("dev_location like", value, "devLocation");
            return (Criteria) this;
        }

        public Criteria andDevLocationNotLike(String value) {
            addCriterion("dev_location not like", value, "devLocation");
            return (Criteria) this;
        }

        public Criteria andDevLocationIn(List<String> values) {
            addCriterion("dev_location in", values, "devLocation");
            return (Criteria) this;
        }

        public Criteria andDevLocationNotIn(List<String> values) {
            addCriterion("dev_location not in", values, "devLocation");
            return (Criteria) this;
        }

        public Criteria andDevLocationBetween(String value1, String value2) {
            addCriterion("dev_location between", value1, value2, "devLocation");
            return (Criteria) this;
        }

        public Criteria andDevLocationNotBetween(String value1, String value2) {
            addCriterion("dev_location not between", value1, value2, "devLocation");
            return (Criteria) this;
        }

        public Criteria andDevQqIsNull() {
            addCriterion("dev_qq is null");
            return (Criteria) this;
        }

        public Criteria andDevQqIsNotNull() {
            addCriterion("dev_qq is not null");
            return (Criteria) this;
        }

        public Criteria andDevQqEqualTo(String value) {
            addCriterion("dev_qq =", value, "devQq");
            return (Criteria) this;
        }

        public Criteria andDevQqNotEqualTo(String value) {
            addCriterion("dev_qq <>", value, "devQq");
            return (Criteria) this;
        }

        public Criteria andDevQqGreaterThan(String value) {
            addCriterion("dev_qq >", value, "devQq");
            return (Criteria) this;
        }

        public Criteria andDevQqGreaterThanOrEqualTo(String value) {
            addCriterion("dev_qq >=", value, "devQq");
            return (Criteria) this;
        }

        public Criteria andDevQqLessThan(String value) {
            addCriterion("dev_qq <", value, "devQq");
            return (Criteria) this;
        }

        public Criteria andDevQqLessThanOrEqualTo(String value) {
            addCriterion("dev_qq <=", value, "devQq");
            return (Criteria) this;
        }

        public Criteria andDevQqLike(String value) {
            addCriterion("dev_qq like", value, "devQq");
            return (Criteria) this;
        }

        public Criteria andDevQqNotLike(String value) {
            addCriterion("dev_qq not like", value, "devQq");
            return (Criteria) this;
        }

        public Criteria andDevQqIn(List<String> values) {
            addCriterion("dev_qq in", values, "devQq");
            return (Criteria) this;
        }

        public Criteria andDevQqNotIn(List<String> values) {
            addCriterion("dev_qq not in", values, "devQq");
            return (Criteria) this;
        }

        public Criteria andDevQqBetween(String value1, String value2) {
            addCriterion("dev_qq between", value1, value2, "devQq");
            return (Criteria) this;
        }

        public Criteria andDevQqNotBetween(String value1, String value2) {
            addCriterion("dev_qq not between", value1, value2, "devQq");
            return (Criteria) this;
        }

        public Criteria andDevEmailIsNull() {
            addCriterion("dev_email is null");
            return (Criteria) this;
        }

        public Criteria andDevEmailIsNotNull() {
            addCriterion("dev_email is not null");
            return (Criteria) this;
        }

        public Criteria andDevEmailEqualTo(String value) {
            addCriterion("dev_email =", value, "devEmail");
            return (Criteria) this;
        }

        public Criteria andDevEmailNotEqualTo(String value) {
            addCriterion("dev_email <>", value, "devEmail");
            return (Criteria) this;
        }

        public Criteria andDevEmailGreaterThan(String value) {
            addCriterion("dev_email >", value, "devEmail");
            return (Criteria) this;
        }

        public Criteria andDevEmailGreaterThanOrEqualTo(String value) {
            addCriterion("dev_email >=", value, "devEmail");
            return (Criteria) this;
        }

        public Criteria andDevEmailLessThan(String value) {
            addCriterion("dev_email <", value, "devEmail");
            return (Criteria) this;
        }

        public Criteria andDevEmailLessThanOrEqualTo(String value) {
            addCriterion("dev_email <=", value, "devEmail");
            return (Criteria) this;
        }

        public Criteria andDevEmailLike(String value) {
            addCriterion("dev_email like", value, "devEmail");
            return (Criteria) this;
        }

        public Criteria andDevEmailNotLike(String value) {
            addCriterion("dev_email not like", value, "devEmail");
            return (Criteria) this;
        }

        public Criteria andDevEmailIn(List<String> values) {
            addCriterion("dev_email in", values, "devEmail");
            return (Criteria) this;
        }

        public Criteria andDevEmailNotIn(List<String> values) {
            addCriterion("dev_email not in", values, "devEmail");
            return (Criteria) this;
        }

        public Criteria andDevEmailBetween(String value1, String value2) {
            addCriterion("dev_email between", value1, value2, "devEmail");
            return (Criteria) this;
        }

        public Criteria andDevEmailNotBetween(String value1, String value2) {
            addCriterion("dev_email not between", value1, value2, "devEmail");
            return (Criteria) this;
        }

        public Criteria andDevWeiboIsNull() {
            addCriterion("dev_weibo is null");
            return (Criteria) this;
        }

        public Criteria andDevWeiboIsNotNull() {
            addCriterion("dev_weibo is not null");
            return (Criteria) this;
        }

        public Criteria andDevWeiboEqualTo(String value) {
            addCriterion("dev_weibo =", value, "devWeibo");
            return (Criteria) this;
        }

        public Criteria andDevWeiboNotEqualTo(String value) {
            addCriterion("dev_weibo <>", value, "devWeibo");
            return (Criteria) this;
        }

        public Criteria andDevWeiboGreaterThan(String value) {
            addCriterion("dev_weibo >", value, "devWeibo");
            return (Criteria) this;
        }

        public Criteria andDevWeiboGreaterThanOrEqualTo(String value) {
            addCriterion("dev_weibo >=", value, "devWeibo");
            return (Criteria) this;
        }

        public Criteria andDevWeiboLessThan(String value) {
            addCriterion("dev_weibo <", value, "devWeibo");
            return (Criteria) this;
        }

        public Criteria andDevWeiboLessThanOrEqualTo(String value) {
            addCriterion("dev_weibo <=", value, "devWeibo");
            return (Criteria) this;
        }

        public Criteria andDevWeiboLike(String value) {
            addCriterion("dev_weibo like", value, "devWeibo");
            return (Criteria) this;
        }

        public Criteria andDevWeiboNotLike(String value) {
            addCriterion("dev_weibo not like", value, "devWeibo");
            return (Criteria) this;
        }

        public Criteria andDevWeiboIn(List<String> values) {
            addCriterion("dev_weibo in", values, "devWeibo");
            return (Criteria) this;
        }

        public Criteria andDevWeiboNotIn(List<String> values) {
            addCriterion("dev_weibo not in", values, "devWeibo");
            return (Criteria) this;
        }

        public Criteria andDevWeiboBetween(String value1, String value2) {
            addCriterion("dev_weibo between", value1, value2, "devWeibo");
            return (Criteria) this;
        }

        public Criteria andDevWeiboNotBetween(String value1, String value2) {
            addCriterion("dev_weibo not between", value1, value2, "devWeibo");
            return (Criteria) this;
        }

        public Criteria andDevGitIsNull() {
            addCriterion("dev_git is null");
            return (Criteria) this;
        }

        public Criteria andDevGitIsNotNull() {
            addCriterion("dev_git is not null");
            return (Criteria) this;
        }

        public Criteria andDevGitEqualTo(String value) {
            addCriterion("dev_git =", value, "devGit");
            return (Criteria) this;
        }

        public Criteria andDevGitNotEqualTo(String value) {
            addCriterion("dev_git <>", value, "devGit");
            return (Criteria) this;
        }

        public Criteria andDevGitGreaterThan(String value) {
            addCriterion("dev_git >", value, "devGit");
            return (Criteria) this;
        }

        public Criteria andDevGitGreaterThanOrEqualTo(String value) {
            addCriterion("dev_git >=", value, "devGit");
            return (Criteria) this;
        }

        public Criteria andDevGitLessThan(String value) {
            addCriterion("dev_git <", value, "devGit");
            return (Criteria) this;
        }

        public Criteria andDevGitLessThanOrEqualTo(String value) {
            addCriterion("dev_git <=", value, "devGit");
            return (Criteria) this;
        }

        public Criteria andDevGitLike(String value) {
            addCriterion("dev_git like", value, "devGit");
            return (Criteria) this;
        }

        public Criteria andDevGitNotLike(String value) {
            addCriterion("dev_git not like", value, "devGit");
            return (Criteria) this;
        }

        public Criteria andDevGitIn(List<String> values) {
            addCriterion("dev_git in", values, "devGit");
            return (Criteria) this;
        }

        public Criteria andDevGitNotIn(List<String> values) {
            addCriterion("dev_git not in", values, "devGit");
            return (Criteria) this;
        }

        public Criteria andDevGitBetween(String value1, String value2) {
            addCriterion("dev_git between", value1, value2, "devGit");
            return (Criteria) this;
        }

        public Criteria andDevGitNotBetween(String value1, String value2) {
            addCriterion("dev_git not between", value1, value2, "devGit");
            return (Criteria) this;
        }

        public Criteria andDevImgIsNull() {
            addCriterion("dev_img is null");
            return (Criteria) this;
        }

        public Criteria andDevImgIsNotNull() {
            addCriterion("dev_img is not null");
            return (Criteria) this;
        }

        public Criteria andDevImgEqualTo(String value) {
            addCriterion("dev_img =", value, "devImg");
            return (Criteria) this;
        }

        public Criteria andDevImgNotEqualTo(String value) {
            addCriterion("dev_img <>", value, "devImg");
            return (Criteria) this;
        }

        public Criteria andDevImgGreaterThan(String value) {
            addCriterion("dev_img >", value, "devImg");
            return (Criteria) this;
        }

        public Criteria andDevImgGreaterThanOrEqualTo(String value) {
            addCriterion("dev_img >=", value, "devImg");
            return (Criteria) this;
        }

        public Criteria andDevImgLessThan(String value) {
            addCriterion("dev_img <", value, "devImg");
            return (Criteria) this;
        }

        public Criteria andDevImgLessThanOrEqualTo(String value) {
            addCriterion("dev_img <=", value, "devImg");
            return (Criteria) this;
        }

        public Criteria andDevImgLike(String value) {
            addCriterion("dev_img like", value, "devImg");
            return (Criteria) this;
        }

        public Criteria andDevImgNotLike(String value) {
            addCriterion("dev_img not like", value, "devImg");
            return (Criteria) this;
        }

        public Criteria andDevImgIn(List<String> values) {
            addCriterion("dev_img in", values, "devImg");
            return (Criteria) this;
        }

        public Criteria andDevImgNotIn(List<String> values) {
            addCriterion("dev_img not in", values, "devImg");
            return (Criteria) this;
        }

        public Criteria andDevImgBetween(String value1, String value2) {
            addCriterion("dev_img between", value1, value2, "devImg");
            return (Criteria) this;
        }

        public Criteria andDevImgNotBetween(String value1, String value2) {
            addCriterion("dev_img not between", value1, value2, "devImg");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}