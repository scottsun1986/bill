package mybatis.model;

import java.util.ArrayList;
import java.util.List;

public class BillExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table bill
	 * @mbggenerated  Mon May 18 20:23:20 CST 2015
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table bill
	 * @mbggenerated  Mon May 18 20:23:20 CST 2015
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table bill
	 * @mbggenerated  Mon May 18 20:23:20 CST 2015
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table bill
	 * @mbggenerated  Mon May 18 20:23:20 CST 2015
	 */
	public BillExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table bill
	 * @mbggenerated  Mon May 18 20:23:20 CST 2015
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table bill
	 * @mbggenerated  Mon May 18 20:23:20 CST 2015
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table bill
	 * @mbggenerated  Mon May 18 20:23:20 CST 2015
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table bill
	 * @mbggenerated  Mon May 18 20:23:20 CST 2015
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table bill
	 * @mbggenerated  Mon May 18 20:23:20 CST 2015
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table bill
	 * @mbggenerated  Mon May 18 20:23:20 CST 2015
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table bill
	 * @mbggenerated  Mon May 18 20:23:20 CST 2015
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table bill
	 * @mbggenerated  Mon May 18 20:23:20 CST 2015
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table bill
	 * @mbggenerated  Mon May 18 20:23:20 CST 2015
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table bill
	 * @mbggenerated  Mon May 18 20:23:20 CST 2015
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table bill
	 * @mbggenerated  Mon May 18 20:23:20 CST 2015
	 */
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

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andBillIdIsNull() {
			addCriterion("bill_id is null");
			return (Criteria) this;
		}

		public Criteria andBillIdIsNotNull() {
			addCriterion("bill_id is not null");
			return (Criteria) this;
		}

		public Criteria andBillIdEqualTo(Integer value) {
			addCriterion("bill_id =", value, "billId");
			return (Criteria) this;
		}

		public Criteria andBillIdNotEqualTo(Integer value) {
			addCriterion("bill_id <>", value, "billId");
			return (Criteria) this;
		}

		public Criteria andBillIdGreaterThan(Integer value) {
			addCriterion("bill_id >", value, "billId");
			return (Criteria) this;
		}

		public Criteria andBillIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("bill_id >=", value, "billId");
			return (Criteria) this;
		}

		public Criteria andBillIdLessThan(Integer value) {
			addCriterion("bill_id <", value, "billId");
			return (Criteria) this;
		}

		public Criteria andBillIdLessThanOrEqualTo(Integer value) {
			addCriterion("bill_id <=", value, "billId");
			return (Criteria) this;
		}

		public Criteria andBillIdIn(List<Integer> values) {
			addCriterion("bill_id in", values, "billId");
			return (Criteria) this;
		}

		public Criteria andBillIdNotIn(List<Integer> values) {
			addCriterion("bill_id not in", values, "billId");
			return (Criteria) this;
		}

		public Criteria andBillIdBetween(Integer value1, Integer value2) {
			addCriterion("bill_id between", value1, value2, "billId");
			return (Criteria) this;
		}

		public Criteria andBillIdNotBetween(Integer value1, Integer value2) {
			addCriterion("bill_id not between", value1, value2, "billId");
			return (Criteria) this;
		}

		public Criteria andProdIdIsNull() {
			addCriterion("prod_id is null");
			return (Criteria) this;
		}

		public Criteria andProdIdIsNotNull() {
			addCriterion("prod_id is not null");
			return (Criteria) this;
		}

		public Criteria andProdIdEqualTo(Integer value) {
			addCriterion("prod_id =", value, "prodId");
			return (Criteria) this;
		}

		public Criteria andProdIdNotEqualTo(Integer value) {
			addCriterion("prod_id <>", value, "prodId");
			return (Criteria) this;
		}

		public Criteria andProdIdGreaterThan(Integer value) {
			addCriterion("prod_id >", value, "prodId");
			return (Criteria) this;
		}

		public Criteria andProdIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("prod_id >=", value, "prodId");
			return (Criteria) this;
		}

		public Criteria andProdIdLessThan(Integer value) {
			addCriterion("prod_id <", value, "prodId");
			return (Criteria) this;
		}

		public Criteria andProdIdLessThanOrEqualTo(Integer value) {
			addCriterion("prod_id <=", value, "prodId");
			return (Criteria) this;
		}

		public Criteria andProdIdIn(List<Integer> values) {
			addCriterion("prod_id in", values, "prodId");
			return (Criteria) this;
		}

		public Criteria andProdIdNotIn(List<Integer> values) {
			addCriterion("prod_id not in", values, "prodId");
			return (Criteria) this;
		}

		public Criteria andProdIdBetween(Integer value1, Integer value2) {
			addCriterion("prod_id between", value1, value2, "prodId");
			return (Criteria) this;
		}

		public Criteria andProdIdNotBetween(Integer value1, Integer value2) {
			addCriterion("prod_id not between", value1, value2, "prodId");
			return (Criteria) this;
		}

		public Criteria andBillMonthIsNull() {
			addCriterion("bill_month is null");
			return (Criteria) this;
		}

		public Criteria andBillMonthIsNotNull() {
			addCriterion("bill_month is not null");
			return (Criteria) this;
		}

		public Criteria andBillMonthEqualTo(String value) {
			addCriterion("bill_month =", value, "billMonth");
			return (Criteria) this;
		}

		public Criteria andBillMonthNotEqualTo(String value) {
			addCriterion("bill_month <>", value, "billMonth");
			return (Criteria) this;
		}

		public Criteria andBillMonthGreaterThan(String value) {
			addCriterion("bill_month >", value, "billMonth");
			return (Criteria) this;
		}

		public Criteria andBillMonthGreaterThanOrEqualTo(String value) {
			addCriterion("bill_month >=", value, "billMonth");
			return (Criteria) this;
		}

		public Criteria andBillMonthLessThan(String value) {
			addCriterion("bill_month <", value, "billMonth");
			return (Criteria) this;
		}

		public Criteria andBillMonthLessThanOrEqualTo(String value) {
			addCriterion("bill_month <=", value, "billMonth");
			return (Criteria) this;
		}

		public Criteria andBillMonthLike(String value) {
			addCriterion("bill_month like", value, "billMonth");
			return (Criteria) this;
		}

		public Criteria andBillMonthNotLike(String value) {
			addCriterion("bill_month not like", value, "billMonth");
			return (Criteria) this;
		}

		public Criteria andBillMonthIn(List<String> values) {
			addCriterion("bill_month in", values, "billMonth");
			return (Criteria) this;
		}

		public Criteria andBillMonthNotIn(List<String> values) {
			addCriterion("bill_month not in", values, "billMonth");
			return (Criteria) this;
		}

		public Criteria andBillMonthBetween(String value1, String value2) {
			addCriterion("bill_month between", value1, value2, "billMonth");
			return (Criteria) this;
		}

		public Criteria andBillMonthNotBetween(String value1, String value2) {
			addCriterion("bill_month not between", value1, value2, "billMonth");
			return (Criteria) this;
		}

		public Criteria andBillAmountIsNull() {
			addCriterion("bill_amount is null");
			return (Criteria) this;
		}

		public Criteria andBillAmountIsNotNull() {
			addCriterion("bill_amount is not null");
			return (Criteria) this;
		}

		public Criteria andBillAmountEqualTo(Double value) {
			addCriterion("bill_amount =", value, "billAmount");
			return (Criteria) this;
		}

		public Criteria andBillAmountNotEqualTo(Double value) {
			addCriterion("bill_amount <>", value, "billAmount");
			return (Criteria) this;
		}

		public Criteria andBillAmountGreaterThan(Double value) {
			addCriterion("bill_amount >", value, "billAmount");
			return (Criteria) this;
		}

		public Criteria andBillAmountGreaterThanOrEqualTo(Double value) {
			addCriterion("bill_amount >=", value, "billAmount");
			return (Criteria) this;
		}

		public Criteria andBillAmountLessThan(Double value) {
			addCriterion("bill_amount <", value, "billAmount");
			return (Criteria) this;
		}

		public Criteria andBillAmountLessThanOrEqualTo(Double value) {
			addCriterion("bill_amount <=", value, "billAmount");
			return (Criteria) this;
		}

		public Criteria andBillAmountIn(List<Double> values) {
			addCriterion("bill_amount in", values, "billAmount");
			return (Criteria) this;
		}

		public Criteria andBillAmountNotIn(List<Double> values) {
			addCriterion("bill_amount not in", values, "billAmount");
			return (Criteria) this;
		}

		public Criteria andBillAmountBetween(Double value1, Double value2) {
			addCriterion("bill_amount between", value1, value2, "billAmount");
			return (Criteria) this;
		}

		public Criteria andBillAmountNotBetween(Double value1, Double value2) {
			addCriterion("bill_amount not between", value1, value2,
					"billAmount");
			return (Criteria) this;
		}

		public Criteria andBillOwnAmountIsNull() {
			addCriterion("bill_own_amount is null");
			return (Criteria) this;
		}

		public Criteria andBillOwnAmountIsNotNull() {
			addCriterion("bill_own_amount is not null");
			return (Criteria) this;
		}

		public Criteria andBillOwnAmountEqualTo(Double value) {
			addCriterion("bill_own_amount =", value, "billOwnAmount");
			return (Criteria) this;
		}

		public Criteria andBillOwnAmountNotEqualTo(Double value) {
			addCriterion("bill_own_amount <>", value, "billOwnAmount");
			return (Criteria) this;
		}

		public Criteria andBillOwnAmountGreaterThan(Double value) {
			addCriterion("bill_own_amount >", value, "billOwnAmount");
			return (Criteria) this;
		}

		public Criteria andBillOwnAmountGreaterThanOrEqualTo(Double value) {
			addCriterion("bill_own_amount >=", value, "billOwnAmount");
			return (Criteria) this;
		}

		public Criteria andBillOwnAmountLessThan(Double value) {
			addCriterion("bill_own_amount <", value, "billOwnAmount");
			return (Criteria) this;
		}

		public Criteria andBillOwnAmountLessThanOrEqualTo(Double value) {
			addCriterion("bill_own_amount <=", value, "billOwnAmount");
			return (Criteria) this;
		}

		public Criteria andBillOwnAmountIn(List<Double> values) {
			addCriterion("bill_own_amount in", values, "billOwnAmount");
			return (Criteria) this;
		}

		public Criteria andBillOwnAmountNotIn(List<Double> values) {
			addCriterion("bill_own_amount not in", values, "billOwnAmount");
			return (Criteria) this;
		}

		public Criteria andBillOwnAmountBetween(Double value1, Double value2) {
			addCriterion("bill_own_amount between", value1, value2,
					"billOwnAmount");
			return (Criteria) this;
		}

		public Criteria andBillOwnAmountNotBetween(Double value1, Double value2) {
			addCriterion("bill_own_amount not between", value1, value2,
					"billOwnAmount");
			return (Criteria) this;
		}

		public Criteria andBillPrepayAmountIsNull() {
			addCriterion("bill_prepay_amount is null");
			return (Criteria) this;
		}

		public Criteria andBillPrepayAmountIsNotNull() {
			addCriterion("bill_prepay_amount is not null");
			return (Criteria) this;
		}

		public Criteria andBillPrepayAmountEqualTo(Double value) {
			addCriterion("bill_prepay_amount =", value, "billPrepayAmount");
			return (Criteria) this;
		}

		public Criteria andBillPrepayAmountNotEqualTo(Double value) {
			addCriterion("bill_prepay_amount <>", value, "billPrepayAmount");
			return (Criteria) this;
		}

		public Criteria andBillPrepayAmountGreaterThan(Double value) {
			addCriterion("bill_prepay_amount >", value, "billPrepayAmount");
			return (Criteria) this;
		}

		public Criteria andBillPrepayAmountGreaterThanOrEqualTo(Double value) {
			addCriterion("bill_prepay_amount >=", value, "billPrepayAmount");
			return (Criteria) this;
		}

		public Criteria andBillPrepayAmountLessThan(Double value) {
			addCriterion("bill_prepay_amount <", value, "billPrepayAmount");
			return (Criteria) this;
		}

		public Criteria andBillPrepayAmountLessThanOrEqualTo(Double value) {
			addCriterion("bill_prepay_amount <=", value, "billPrepayAmount");
			return (Criteria) this;
		}

		public Criteria andBillPrepayAmountIn(List<Double> values) {
			addCriterion("bill_prepay_amount in", values, "billPrepayAmount");
			return (Criteria) this;
		}

		public Criteria andBillPrepayAmountNotIn(List<Double> values) {
			addCriterion("bill_prepay_amount not in", values,
					"billPrepayAmount");
			return (Criteria) this;
		}

		public Criteria andBillPrepayAmountBetween(Double value1, Double value2) {
			addCriterion("bill_prepay_amount between", value1, value2,
					"billPrepayAmount");
			return (Criteria) this;
		}

		public Criteria andBillPrepayAmountNotBetween(Double value1,
				Double value2) {
			addCriterion("bill_prepay_amount not between", value1, value2,
					"billPrepayAmount");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table bill
	 * @mbggenerated  Mon May 18 20:23:20 CST 2015
	 */
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

		protected Criterion(String condition, Object value, Object secondValue,
				String typeHandler) {
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

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table bill
     *
     * @mbggenerated do_not_delete_during_merge Mon May 18 19:22:03 CST 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}