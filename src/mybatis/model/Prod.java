package mybatis.model;

import java.util.Date;
import java.util.List;

public class Prod {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column prod.prod_id
	 * @mbggenerated  Mon May 18 20:23:20 CST 2015
	 */
	private Integer prodId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column prod.prod_number
	 * @mbggenerated  Mon May 18 20:23:20 CST 2015
	 */
	private String prodNumber;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column prod.cust_id
	 * @mbggenerated  Mon May 18 20:23:20 CST 2015
	 */
	private Integer custId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column prod.prod_holder
	 * @mbggenerated  Mon May 18 20:23:20 CST 2015
	 */
	private String prodHolder;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column prod.prod_date
	 * @mbggenerated  Mon May 18 20:23:20 CST 2015
	 */
	private Date prodDate;

	
	private Cust cust;
	public Cust getCust() {
		return cust;
	}

	public void setCust(Cust cust) {
		this.cust = cust;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column prod.prod_id
	 * @return  the value of prod.prod_id
	 * @mbggenerated  Mon May 18 20:23:20 CST 2015
	 */
	public Integer getProdId() {
		return prodId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column prod.prod_id
	 * @param prodId  the value for prod.prod_id
	 * @mbggenerated  Mon May 18 20:23:20 CST 2015
	 */
	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column prod.prod_number
	 * @return  the value of prod.prod_number
	 * @mbggenerated  Mon May 18 20:23:20 CST 2015
	 */
	public String getProdNumber() {
		return prodNumber;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column prod.prod_number
	 * @param prodNumber  the value for prod.prod_number
	 * @mbggenerated  Mon May 18 20:23:20 CST 2015
	 */
	public void setProdNumber(String prodNumber) {
		this.prodNumber = prodNumber;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column prod.cust_id
	 * @return  the value of prod.cust_id
	 * @mbggenerated  Mon May 18 20:23:20 CST 2015
	 */
	public Integer getCustId() {
		return custId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column prod.cust_id
	 * @param custId  the value for prod.cust_id
	 * @mbggenerated  Mon May 18 20:23:20 CST 2015
	 */
	public void setCustId(Integer custId) {
		this.custId = custId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column prod.prod_holder
	 * @return  the value of prod.prod_holder
	 * @mbggenerated  Mon May 18 20:23:20 CST 2015
	 */
	public String getProdHolder() {
		return prodHolder;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column prod.prod_holder
	 * @param prodHolder  the value for prod.prod_holder
	 * @mbggenerated  Mon May 18 20:23:20 CST 2015
	 */
	public void setProdHolder(String prodHolder) {
		this.prodHolder = prodHolder;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column prod.prod_date
	 * @return  the value of prod.prod_date
	 * @mbggenerated  Mon May 18 20:23:20 CST 2015
	 */
	public Date getProdDate() {
		return prodDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column prod.prod_date
	 * @param prodDate  the value for prod.prod_date
	 * @mbggenerated  Mon May 18 20:23:20 CST 2015
	 */
	public void setProdDate(Date prodDate) {
		this.prodDate = prodDate;
	}
	
	private List<Bill> billList;
	public List<Bill> getBillList() {
		return billList;
	}

	public void setBillList(List<Bill> billList) {
		this.billList = billList;
	}
}