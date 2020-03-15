package top.franxx.blog.pojo;

import java.util.ArrayList;
import java.util.List;

public class ClzExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClzExample() {
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

        public Criteria andClzIdIsNull() {
            addCriterion("clz_id is null");
            return (Criteria) this;
        }

        public Criteria andClzIdIsNotNull() {
            addCriterion("clz_id is not null");
            return (Criteria) this;
        }

        public Criteria andClzIdEqualTo(Long value) {
            addCriterion("clz_id =", value, "clzId");
            return (Criteria) this;
        }

        public Criteria andClzIdNotEqualTo(Long value) {
            addCriterion("clz_id <>", value, "clzId");
            return (Criteria) this;
        }

        public Criteria andClzIdGreaterThan(Long value) {
            addCriterion("clz_id >", value, "clzId");
            return (Criteria) this;
        }

        public Criteria andClzIdGreaterThanOrEqualTo(Long value) {
            addCriterion("clz_id >=", value, "clzId");
            return (Criteria) this;
        }

        public Criteria andClzIdLessThan(Long value) {
            addCriterion("clz_id <", value, "clzId");
            return (Criteria) this;
        }

        public Criteria andClzIdLessThanOrEqualTo(Long value) {
            addCriterion("clz_id <=", value, "clzId");
            return (Criteria) this;
        }

        public Criteria andClzIdIn(List<Long> values) {
            addCriterion("clz_id in", values, "clzId");
            return (Criteria) this;
        }

        public Criteria andClzIdNotIn(List<Long> values) {
            addCriterion("clz_id not in", values, "clzId");
            return (Criteria) this;
        }

        public Criteria andClzIdBetween(Long value1, Long value2) {
            addCriterion("clz_id between", value1, value2, "clzId");
            return (Criteria) this;
        }

        public Criteria andClzIdNotBetween(Long value1, Long value2) {
            addCriterion("clz_id not between", value1, value2, "clzId");
            return (Criteria) this;
        }

        public Criteria andClzNameIsNull() {
            addCriterion("clz_name is null");
            return (Criteria) this;
        }

        public Criteria andClzNameIsNotNull() {
            addCriterion("clz_name is not null");
            return (Criteria) this;
        }

        public Criteria andClzNameEqualTo(String value) {
            addCriterion("clz_name =", value, "clzName");
            return (Criteria) this;
        }

        public Criteria andClzNameNotEqualTo(String value) {
            addCriterion("clz_name <>", value, "clzName");
            return (Criteria) this;
        }

        public Criteria andClzNameGreaterThan(String value) {
            addCriterion("clz_name >", value, "clzName");
            return (Criteria) this;
        }

        public Criteria andClzNameGreaterThanOrEqualTo(String value) {
            addCriterion("clz_name >=", value, "clzName");
            return (Criteria) this;
        }

        public Criteria andClzNameLessThan(String value) {
            addCriterion("clz_name <", value, "clzName");
            return (Criteria) this;
        }

        public Criteria andClzNameLessThanOrEqualTo(String value) {
            addCriterion("clz_name <=", value, "clzName");
            return (Criteria) this;
        }

        public Criteria andClzNameLike(String value) {
            addCriterion("clz_name like", value, "clzName");
            return (Criteria) this;
        }

        public Criteria andClzNameNotLike(String value) {
            addCriterion("clz_name not like", value, "clzName");
            return (Criteria) this;
        }

        public Criteria andClzNameIn(List<String> values) {
            addCriterion("clz_name in", values, "clzName");
            return (Criteria) this;
        }

        public Criteria andClzNameNotIn(List<String> values) {
            addCriterion("clz_name not in", values, "clzName");
            return (Criteria) this;
        }

        public Criteria andClzNameBetween(String value1, String value2) {
            addCriterion("clz_name between", value1, value2, "clzName");
            return (Criteria) this;
        }

        public Criteria andClzNameNotBetween(String value1, String value2) {
            addCriterion("clz_name not between", value1, value2, "clzName");
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