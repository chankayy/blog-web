package top.franxx.blog.pojo;

import java.util.ArrayList;
import java.util.List;

public class WebInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WebInfoExample() {
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

        public Criteria andWebNameIsNull() {
            addCriterion("web_name is null");
            return (Criteria) this;
        }

        public Criteria andWebNameIsNotNull() {
            addCriterion("web_name is not null");
            return (Criteria) this;
        }

        public Criteria andWebNameEqualTo(String value) {
            addCriterion("web_name =", value, "webName");
            return (Criteria) this;
        }

        public Criteria andWebNameNotEqualTo(String value) {
            addCriterion("web_name <>", value, "webName");
            return (Criteria) this;
        }

        public Criteria andWebNameGreaterThan(String value) {
            addCriterion("web_name >", value, "webName");
            return (Criteria) this;
        }

        public Criteria andWebNameGreaterThanOrEqualTo(String value) {
            addCriterion("web_name >=", value, "webName");
            return (Criteria) this;
        }

        public Criteria andWebNameLessThan(String value) {
            addCriterion("web_name <", value, "webName");
            return (Criteria) this;
        }

        public Criteria andWebNameLessThanOrEqualTo(String value) {
            addCriterion("web_name <=", value, "webName");
            return (Criteria) this;
        }

        public Criteria andWebNameLike(String value) {
            addCriterion("web_name like", value, "webName");
            return (Criteria) this;
        }

        public Criteria andWebNameNotLike(String value) {
            addCriterion("web_name not like", value, "webName");
            return (Criteria) this;
        }

        public Criteria andWebNameIn(List<String> values) {
            addCriterion("web_name in", values, "webName");
            return (Criteria) this;
        }

        public Criteria andWebNameNotIn(List<String> values) {
            addCriterion("web_name not in", values, "webName");
            return (Criteria) this;
        }

        public Criteria andWebNameBetween(String value1, String value2) {
            addCriterion("web_name between", value1, value2, "webName");
            return (Criteria) this;
        }

        public Criteria andWebNameNotBetween(String value1, String value2) {
            addCriterion("web_name not between", value1, value2, "webName");
            return (Criteria) this;
        }

        public Criteria andCopyrightIsNull() {
            addCriterion("copyright is null");
            return (Criteria) this;
        }

        public Criteria andCopyrightIsNotNull() {
            addCriterion("copyright is not null");
            return (Criteria) this;
        }

        public Criteria andCopyrightEqualTo(String value) {
            addCriterion("copyright =", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightNotEqualTo(String value) {
            addCriterion("copyright <>", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightGreaterThan(String value) {
            addCriterion("copyright >", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightGreaterThanOrEqualTo(String value) {
            addCriterion("copyright >=", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightLessThan(String value) {
            addCriterion("copyright <", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightLessThanOrEqualTo(String value) {
            addCriterion("copyright <=", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightLike(String value) {
            addCriterion("copyright like", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightNotLike(String value) {
            addCriterion("copyright not like", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightIn(List<String> values) {
            addCriterion("copyright in", values, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightNotIn(List<String> values) {
            addCriterion("copyright not in", values, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightBetween(String value1, String value2) {
            addCriterion("copyright between", value1, value2, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightNotBetween(String value1, String value2) {
            addCriterion("copyright not between", value1, value2, "copyright");
            return (Criteria) this;
        }

        public Criteria andPowerbyIsNull() {
            addCriterion("powerby is null");
            return (Criteria) this;
        }

        public Criteria andPowerbyIsNotNull() {
            addCriterion("powerby is not null");
            return (Criteria) this;
        }

        public Criteria andPowerbyEqualTo(String value) {
            addCriterion("powerby =", value, "powerby");
            return (Criteria) this;
        }

        public Criteria andPowerbyNotEqualTo(String value) {
            addCriterion("powerby <>", value, "powerby");
            return (Criteria) this;
        }

        public Criteria andPowerbyGreaterThan(String value) {
            addCriterion("powerby >", value, "powerby");
            return (Criteria) this;
        }

        public Criteria andPowerbyGreaterThanOrEqualTo(String value) {
            addCriterion("powerby >=", value, "powerby");
            return (Criteria) this;
        }

        public Criteria andPowerbyLessThan(String value) {
            addCriterion("powerby <", value, "powerby");
            return (Criteria) this;
        }

        public Criteria andPowerbyLessThanOrEqualTo(String value) {
            addCriterion("powerby <=", value, "powerby");
            return (Criteria) this;
        }

        public Criteria andPowerbyLike(String value) {
            addCriterion("powerby like", value, "powerby");
            return (Criteria) this;
        }

        public Criteria andPowerbyNotLike(String value) {
            addCriterion("powerby not like", value, "powerby");
            return (Criteria) this;
        }

        public Criteria andPowerbyIn(List<String> values) {
            addCriterion("powerby in", values, "powerby");
            return (Criteria) this;
        }

        public Criteria andPowerbyNotIn(List<String> values) {
            addCriterion("powerby not in", values, "powerby");
            return (Criteria) this;
        }

        public Criteria andPowerbyBetween(String value1, String value2) {
            addCriterion("powerby between", value1, value2, "powerby");
            return (Criteria) this;
        }

        public Criteria andPowerbyNotBetween(String value1, String value2) {
            addCriterion("powerby not between", value1, value2, "powerby");
            return (Criteria) this;
        }

        public Criteria andRecordIsNull() {
            addCriterion("record is null");
            return (Criteria) this;
        }

        public Criteria andRecordIsNotNull() {
            addCriterion("record is not null");
            return (Criteria) this;
        }

        public Criteria andRecordEqualTo(String value) {
            addCriterion("record =", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordNotEqualTo(String value) {
            addCriterion("record <>", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordGreaterThan(String value) {
            addCriterion("record >", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordGreaterThanOrEqualTo(String value) {
            addCriterion("record >=", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordLessThan(String value) {
            addCriterion("record <", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordLessThanOrEqualTo(String value) {
            addCriterion("record <=", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordLike(String value) {
            addCriterion("record like", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordNotLike(String value) {
            addCriterion("record not like", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordIn(List<String> values) {
            addCriterion("record in", values, "record");
            return (Criteria) this;
        }

        public Criteria andRecordNotIn(List<String> values) {
            addCriterion("record not in", values, "record");
            return (Criteria) this;
        }

        public Criteria andRecordBetween(String value1, String value2) {
            addCriterion("record between", value1, value2, "record");
            return (Criteria) this;
        }

        public Criteria andRecordNotBetween(String value1, String value2) {
            addCriterion("record not between", value1, value2, "record");
            return (Criteria) this;
        }

        public Criteria andDefaultImgIsNull() {
            addCriterion("default_img is null");
            return (Criteria) this;
        }

        public Criteria andDefaultImgIsNotNull() {
            addCriterion("default_img is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultImgEqualTo(String value) {
            addCriterion("default_img =", value, "defaultImg");
            return (Criteria) this;
        }

        public Criteria andDefaultImgNotEqualTo(String value) {
            addCriterion("default_img <>", value, "defaultImg");
            return (Criteria) this;
        }

        public Criteria andDefaultImgGreaterThan(String value) {
            addCriterion("default_img >", value, "defaultImg");
            return (Criteria) this;
        }

        public Criteria andDefaultImgGreaterThanOrEqualTo(String value) {
            addCriterion("default_img >=", value, "defaultImg");
            return (Criteria) this;
        }

        public Criteria andDefaultImgLessThan(String value) {
            addCriterion("default_img <", value, "defaultImg");
            return (Criteria) this;
        }

        public Criteria andDefaultImgLessThanOrEqualTo(String value) {
            addCriterion("default_img <=", value, "defaultImg");
            return (Criteria) this;
        }

        public Criteria andDefaultImgLike(String value) {
            addCriterion("default_img like", value, "defaultImg");
            return (Criteria) this;
        }

        public Criteria andDefaultImgNotLike(String value) {
            addCriterion("default_img not like", value, "defaultImg");
            return (Criteria) this;
        }

        public Criteria andDefaultImgIn(List<String> values) {
            addCriterion("default_img in", values, "defaultImg");
            return (Criteria) this;
        }

        public Criteria andDefaultImgNotIn(List<String> values) {
            addCriterion("default_img not in", values, "defaultImg");
            return (Criteria) this;
        }

        public Criteria andDefaultImgBetween(String value1, String value2) {
            addCriterion("default_img between", value1, value2, "defaultImg");
            return (Criteria) this;
        }

        public Criteria andDefaultImgNotBetween(String value1, String value2) {
            addCriterion("default_img not between", value1, value2, "defaultImg");
            return (Criteria) this;
        }

        public Criteria andWebImgIsNull() {
            addCriterion("web_img is null");
            return (Criteria) this;
        }

        public Criteria andWebImgIsNotNull() {
            addCriterion("web_img is not null");
            return (Criteria) this;
        }

        public Criteria andWebImgEqualTo(String value) {
            addCriterion("web_img =", value, "webImg");
            return (Criteria) this;
        }

        public Criteria andWebImgNotEqualTo(String value) {
            addCriterion("web_img <>", value, "webImg");
            return (Criteria) this;
        }

        public Criteria andWebImgGreaterThan(String value) {
            addCriterion("web_img >", value, "webImg");
            return (Criteria) this;
        }

        public Criteria andWebImgGreaterThanOrEqualTo(String value) {
            addCriterion("web_img >=", value, "webImg");
            return (Criteria) this;
        }

        public Criteria andWebImgLessThan(String value) {
            addCriterion("web_img <", value, "webImg");
            return (Criteria) this;
        }

        public Criteria andWebImgLessThanOrEqualTo(String value) {
            addCriterion("web_img <=", value, "webImg");
            return (Criteria) this;
        }

        public Criteria andWebImgLike(String value) {
            addCriterion("web_img like", value, "webImg");
            return (Criteria) this;
        }

        public Criteria andWebImgNotLike(String value) {
            addCriterion("web_img not like", value, "webImg");
            return (Criteria) this;
        }

        public Criteria andWebImgIn(List<String> values) {
            addCriterion("web_img in", values, "webImg");
            return (Criteria) this;
        }

        public Criteria andWebImgNotIn(List<String> values) {
            addCriterion("web_img not in", values, "webImg");
            return (Criteria) this;
        }

        public Criteria andWebImgBetween(String value1, String value2) {
            addCriterion("web_img between", value1, value2, "webImg");
            return (Criteria) this;
        }

        public Criteria andWebImgNotBetween(String value1, String value2) {
            addCriterion("web_img not between", value1, value2, "webImg");
            return (Criteria) this;
        }

        public Criteria andWebUrlIsNull() {
            addCriterion("web_url is null");
            return (Criteria) this;
        }

        public Criteria andWebUrlIsNotNull() {
            addCriterion("web_url is not null");
            return (Criteria) this;
        }

        public Criteria andWebUrlEqualTo(String value) {
            addCriterion("web_url =", value, "webUrl");
            return (Criteria) this;
        }

        public Criteria andWebUrlNotEqualTo(String value) {
            addCriterion("web_url <>", value, "webUrl");
            return (Criteria) this;
        }

        public Criteria andWebUrlGreaterThan(String value) {
            addCriterion("web_url >", value, "webUrl");
            return (Criteria) this;
        }

        public Criteria andWebUrlGreaterThanOrEqualTo(String value) {
            addCriterion("web_url >=", value, "webUrl");
            return (Criteria) this;
        }

        public Criteria andWebUrlLessThan(String value) {
            addCriterion("web_url <", value, "webUrl");
            return (Criteria) this;
        }

        public Criteria andWebUrlLessThanOrEqualTo(String value) {
            addCriterion("web_url <=", value, "webUrl");
            return (Criteria) this;
        }

        public Criteria andWebUrlLike(String value) {
            addCriterion("web_url like", value, "webUrl");
            return (Criteria) this;
        }

        public Criteria andWebUrlNotLike(String value) {
            addCriterion("web_url not like", value, "webUrl");
            return (Criteria) this;
        }

        public Criteria andWebUrlIn(List<String> values) {
            addCriterion("web_url in", values, "webUrl");
            return (Criteria) this;
        }

        public Criteria andWebUrlNotIn(List<String> values) {
            addCriterion("web_url not in", values, "webUrl");
            return (Criteria) this;
        }

        public Criteria andWebUrlBetween(String value1, String value2) {
            addCriterion("web_url between", value1, value2, "webUrl");
            return (Criteria) this;
        }

        public Criteria andWebUrlNotBetween(String value1, String value2) {
            addCriterion("web_url not between", value1, value2, "webUrl");
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