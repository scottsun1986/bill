package mybatis.model;

import java.util.List;

public class BillDetail {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column bill_detail.bill_detail_id
	 * @mbggenerated  Mon May 18 20:23:20 CST 2015
	 */
	private Integer billDetailId;
	
	private BillConf billConf;
	private List<BillDetail> subBillDetailList;
	public List<BillDetail> getSubBillDetailList() {
		return subBillDetailList;
	}

	public void setSubBillDetailList(List<BillDetail> subBillDetailList) {
		this.subBillDetailList = subBillDetailList;
	}

	public BillConf getBillConf() {
		return billConf;
	}

	public void setBillConf(BillConf billConf) {
		this.billConf = billConf;
	}

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column bill_detail.bill_id
	 * @mbggenerated  Mon May 18 20:23:20 CST 2015
	 */
	private Integer billId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column bill_detail. bill_item_id
	 * @mbggenerated  Mon May 18 20:23:20 CST 2015
	 */
	private Integer billItemId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column bill_detail.amount
	 * @mbggenerated  Mon May 18 20:23:20 CST 2015
	 */
	private Double amount;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column bill_detail.bill_detail_id
	 * @return  the value of bill_detail.bill_detail_id
	 * @mbggenerated  Mon May 18 20:23:20 CST 2015
	 */
	public Integer getBillDetailId() {
		return billDetailId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column bill_detail.bill_detail_id
	 * @param billDetailId  the value for bill_detail.bill_detail_id
	 * @mbggenerated  Mon May 18 20:23:20 CST 2015
	 */
	public void setBillDetailId(Integer billDetailId) {
		this.billDetailId = billDetailId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column bill_detail.bill_id
	 * @return  the value of bill_detail.bill_id
	 * @mbggenerated  Mon May 18 20:23:20 CST 2015
	 */
	public Integer getBillId() {
		return billId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column bill_detail.bill_id
	 * @param billId  the value for bill_detail.bill_id
	 * @mbggenerated  Mon May 18 20:23:20 CST 2015
	 */
	public void setBillId(Integer billId) {
		this.billId = billId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column bill_detail. bill_item_id
	 * @return  the value of bill_detail. bill_item_id
	 * @mbggenerated  Mon May 18 20:23:20 CST 2015
	 */
	public Integer getBillItemId() {
		return billItemId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column bill_detail. bill_item_id
	 * @param billItemId  the value for bill_detail. bill_item_id
	 * @mbggenerated  Mon May 18 20:23:20 CST 2015
	 */
	public void setBillItemId(Integer billItemId) {
		this.billItemId = billItemId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column bill_detail.amount
	 * @return  the value of bill_detail.amount
	 * @mbggenerated  Mon May 18 20:23:20 CST 2015
	 */
	public Double getAmount() {
		return amount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column bill_detail.amount
	 * @param amount  the value for bill_detail.amount
	 * @mbggenerated  Mon May 18 20:23:20 CST 2015
	 */
	public void setAmount(Double amount) {
		this.amount = amount;
	}
}