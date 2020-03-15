package top.franxx.blog.pojo;

import java.util.ArrayList;
import java.util.List;

public class TipsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TipsExample() {
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

        public Criteria andTipsIdIsNull() {
            addCriterion("tips_id is null");
            return (Criteria) this;
        }

        public Criteria andTipsIdIsNotNull() {
            addCriterion("tips_id is not null");
            return (Criteria) this;
        }

        public Criteria andTipsIdEqualTo(Integer value) {
            addCriterion("tips_id =", value, "tipsId");
            return (Criteria) this;
        }

        public Criteria andTipsIdNotEqualTo(Integer value) {
            addCriterion("tips_id <>", value, "tipsId");
            return (Criteria) this;
        }

        public Criteria andTipsIdGreaterThan(Integer value) {
            addCriterion("tips_id >", value, "tipsId");
            return (Criteria) this;
        }

        public Criteria andTipsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tips_id >=", value, "tipsId");
            return (Criteria) this;
        }

        public Criteria andTipsIdLessThan(Integer value) {
            addCriterion("tips_id <", value, "tipsId");
            return (Criteria) this;
        }

        public Criteria andTipsIdLessThanOrEqualTo(Integer value) {
            addCriterion("tips_id <=", value, "tipsId");
            return (Criteria) this;
        }

        public Criteria andTipsIdIn(List<Integer> values) {
            addCriterion("tips_id in", values, "tipsId");
            return (Criteria) this;
        }

        public Criteria andTipsIdNotIn(List<Integer> values) {
            addCriterion("tips_id not in", values, "tipsId");
            return (Criteria) this;
        }

        public Criteria andTipsIdBetween(Integer value1, Integer value2) {
            addCriterion("tips_id between", value1, value2, "tipsId");
            return (Criteria) this;
        }

        public Criteria andTipsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tips_id not between", value1, value2, "tipsId");
            return (Criteria) this;
        }

        public Criteria andTipContentIsNull() {
            addCriterion("tip_content is null");
            return (Criteria) this;
        }

        public Criteria andTipContentIsNotNull() {
            addCriterion("tip_content is not null");
            return (Criteria) this;
        }

        public Criteria andTipContentEqualTo(String value) {
            addCriterion("tip_content =", value, "tipContent");
            return (Criteria) this;
        }

        public Criteria andTipContentNotEqualTo(String value) {
            addCriterion("tip_content <>", value, "tipContent");
            return (Criteria) this;
        }

        public Criteria andTipContentGreaterThan(String value) {
            addCriterion("tip_content >", value, "tipContent");
            return (Criteria) this;
        }

        public Criteria andTipContentGreaterThanOrEqualTo(String value) {
            addCriterion("tip_content >=", value, "tipContent");
            return (Criteria) this;
        }

        public Criteria andTipContentLessThan(String value) {
            addCriterion("tip_content <", value, "tipContent");
            return (Criteria) this;
        }

        public Criteria andTipContentLessThanOrEqualTo(String value) {
            addCriterion("tip_content <=", value, "tipContent");
            return (Criteria) this;
        }

        public Criteria andTipContentLike(String value) {
            addCriterion("tip_content like", value, "tipContent");
            return (Criteria) this;
        }

        public Criteria andTipContentNotLike(String value) {
            addCriterion("tip_content not like", value, "tipContent");
            return (Criteria) this;
        }

        public Criteria andTipContentIn(List<String> values) {
            addCriterion("tip_content in", values, "tipContent");
            return (Criteria) this;
        }

        public Criteria andTipContentNotIn(List<String> values) {
            addCriterion("tip_content not in", values, "tipContent");
            return (Criteria) this;
        }

        public Criteria andTipContentBetween(String value1, String value2) {
            addCriterion("tip_content between", value1, value2, "tipContent");
            return (Criteria) this;
        }

        public Criteria andTipContentNotBetween(String value1, String value2) {
            addCriterion("tip_content not between", value1, value2, "tipContent");
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