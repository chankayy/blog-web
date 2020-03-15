package top.franxx.blog.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ComReplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ComReplyExample() {
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

        public Criteria andReplyIdIsNull() {
            addCriterion("reply_id is null");
            return (Criteria) this;
        }

        public Criteria andReplyIdIsNotNull() {
            addCriterion("reply_id is not null");
            return (Criteria) this;
        }

        public Criteria andReplyIdEqualTo(Long value) {
            addCriterion("reply_id =", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdNotEqualTo(Long value) {
            addCriterion("reply_id <>", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdGreaterThan(Long value) {
            addCriterion("reply_id >", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("reply_id >=", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdLessThan(Long value) {
            addCriterion("reply_id <", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdLessThanOrEqualTo(Long value) {
            addCriterion("reply_id <=", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdIn(List<Long> values) {
            addCriterion("reply_id in", values, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdNotIn(List<Long> values) {
            addCriterion("reply_id not in", values, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdBetween(Long value1, Long value2) {
            addCriterion("reply_id between", value1, value2, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdNotBetween(Long value1, Long value2) {
            addCriterion("reply_id not between", value1, value2, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyComIdIsNull() {
            addCriterion("reply_com_id is null");
            return (Criteria) this;
        }

        public Criteria andReplyComIdIsNotNull() {
            addCriterion("reply_com_id is not null");
            return (Criteria) this;
        }

        public Criteria andReplyComIdEqualTo(Long value) {
            addCriterion("reply_com_id =", value, "replyComId");
            return (Criteria) this;
        }

        public Criteria andReplyComIdNotEqualTo(Long value) {
            addCriterion("reply_com_id <>", value, "replyComId");
            return (Criteria) this;
        }

        public Criteria andReplyComIdGreaterThan(Long value) {
            addCriterion("reply_com_id >", value, "replyComId");
            return (Criteria) this;
        }

        public Criteria andReplyComIdGreaterThanOrEqualTo(Long value) {
            addCriterion("reply_com_id >=", value, "replyComId");
            return (Criteria) this;
        }

        public Criteria andReplyComIdLessThan(Long value) {
            addCriterion("reply_com_id <", value, "replyComId");
            return (Criteria) this;
        }

        public Criteria andReplyComIdLessThanOrEqualTo(Long value) {
            addCriterion("reply_com_id <=", value, "replyComId");
            return (Criteria) this;
        }

        public Criteria andReplyComIdIn(List<Long> values) {
            addCriterion("reply_com_id in", values, "replyComId");
            return (Criteria) this;
        }

        public Criteria andReplyComIdNotIn(List<Long> values) {
            addCriterion("reply_com_id not in", values, "replyComId");
            return (Criteria) this;
        }

        public Criteria andReplyComIdBetween(Long value1, Long value2) {
            addCriterion("reply_com_id between", value1, value2, "replyComId");
            return (Criteria) this;
        }

        public Criteria andReplyComIdNotBetween(Long value1, Long value2) {
            addCriterion("reply_com_id not between", value1, value2, "replyComId");
            return (Criteria) this;
        }

        public Criteria andReplyNameIsNull() {
            addCriterion("reply_name is null");
            return (Criteria) this;
        }

        public Criteria andReplyNameIsNotNull() {
            addCriterion("reply_name is not null");
            return (Criteria) this;
        }

        public Criteria andReplyNameEqualTo(String value) {
            addCriterion("reply_name =", value, "replyName");
            return (Criteria) this;
        }

        public Criteria andReplyNameNotEqualTo(String value) {
            addCriterion("reply_name <>", value, "replyName");
            return (Criteria) this;
        }

        public Criteria andReplyNameGreaterThan(String value) {
            addCriterion("reply_name >", value, "replyName");
            return (Criteria) this;
        }

        public Criteria andReplyNameGreaterThanOrEqualTo(String value) {
            addCriterion("reply_name >=", value, "replyName");
            return (Criteria) this;
        }

        public Criteria andReplyNameLessThan(String value) {
            addCriterion("reply_name <", value, "replyName");
            return (Criteria) this;
        }

        public Criteria andReplyNameLessThanOrEqualTo(String value) {
            addCriterion("reply_name <=", value, "replyName");
            return (Criteria) this;
        }

        public Criteria andReplyNameLike(String value) {
            addCriterion("reply_name like", value, "replyName");
            return (Criteria) this;
        }

        public Criteria andReplyNameNotLike(String value) {
            addCriterion("reply_name not like", value, "replyName");
            return (Criteria) this;
        }

        public Criteria andReplyNameIn(List<String> values) {
            addCriterion("reply_name in", values, "replyName");
            return (Criteria) this;
        }

        public Criteria andReplyNameNotIn(List<String> values) {
            addCriterion("reply_name not in", values, "replyName");
            return (Criteria) this;
        }

        public Criteria andReplyNameBetween(String value1, String value2) {
            addCriterion("reply_name between", value1, value2, "replyName");
            return (Criteria) this;
        }

        public Criteria andReplyNameNotBetween(String value1, String value2) {
            addCriterion("reply_name not between", value1, value2, "replyName");
            return (Criteria) this;
        }

        public Criteria andReplyTimeIsNull() {
            addCriterion("reply_time is null");
            return (Criteria) this;
        }

        public Criteria andReplyTimeIsNotNull() {
            addCriterion("reply_time is not null");
            return (Criteria) this;
        }

        public Criteria andReplyTimeEqualTo(Date value) {
            addCriterion("reply_time =", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeNotEqualTo(Date value) {
            addCriterion("reply_time <>", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeGreaterThan(Date value) {
            addCriterion("reply_time >", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("reply_time >=", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeLessThan(Date value) {
            addCriterion("reply_time <", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeLessThanOrEqualTo(Date value) {
            addCriterion("reply_time <=", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeIn(List<Date> values) {
            addCriterion("reply_time in", values, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeNotIn(List<Date> values) {
            addCriterion("reply_time not in", values, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeBetween(Date value1, Date value2) {
            addCriterion("reply_time between", value1, value2, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeNotBetween(Date value1, Date value2) {
            addCriterion("reply_time not between", value1, value2, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyImgIsNull() {
            addCriterion("reply_img is null");
            return (Criteria) this;
        }

        public Criteria andReplyImgIsNotNull() {
            addCriterion("reply_img is not null");
            return (Criteria) this;
        }

        public Criteria andReplyImgEqualTo(String value) {
            addCriterion("reply_img =", value, "replyImg");
            return (Criteria) this;
        }

        public Criteria andReplyImgNotEqualTo(String value) {
            addCriterion("reply_img <>", value, "replyImg");
            return (Criteria) this;
        }

        public Criteria andReplyImgGreaterThan(String value) {
            addCriterion("reply_img >", value, "replyImg");
            return (Criteria) this;
        }

        public Criteria andReplyImgGreaterThanOrEqualTo(String value) {
            addCriterion("reply_img >=", value, "replyImg");
            return (Criteria) this;
        }

        public Criteria andReplyImgLessThan(String value) {
            addCriterion("reply_img <", value, "replyImg");
            return (Criteria) this;
        }

        public Criteria andReplyImgLessThanOrEqualTo(String value) {
            addCriterion("reply_img <=", value, "replyImg");
            return (Criteria) this;
        }

        public Criteria andReplyImgLike(String value) {
            addCriterion("reply_img like", value, "replyImg");
            return (Criteria) this;
        }

        public Criteria andReplyImgNotLike(String value) {
            addCriterion("reply_img not like", value, "replyImg");
            return (Criteria) this;
        }

        public Criteria andReplyImgIn(List<String> values) {
            addCriterion("reply_img in", values, "replyImg");
            return (Criteria) this;
        }

        public Criteria andReplyImgNotIn(List<String> values) {
            addCriterion("reply_img not in", values, "replyImg");
            return (Criteria) this;
        }

        public Criteria andReplyImgBetween(String value1, String value2) {
            addCriterion("reply_img between", value1, value2, "replyImg");
            return (Criteria) this;
        }

        public Criteria andReplyImgNotBetween(String value1, String value2) {
            addCriterion("reply_img not between", value1, value2, "replyImg");
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