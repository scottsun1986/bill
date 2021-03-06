package mybatis.model;

public class BillConf {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column bill_conf.bill_item_id
	 * @mbggenerated  Mon May 18 20:23:20 CST 2015
	 */
	private Integer billItemId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column bill_conf.parent_bill_item_id
	 * @mbggenerated  Mon May 18 20:23:20 CST 2015
	 */
	private Integer parentBillItemId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column bill_conf.bill_item_name
	 * @mbggenerated  Mon May 18 20:23:20 CST 2015
	 */
	private String billItemName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column bill_conf.bill_item_dw
	 * @mbggenerated  Mon May 18 20:23:20 CST 2015
	 */
	private String billItemDw;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column bill_conf.bill_item_id
	 * @return  the value of bill_conf.bill_item_id
	 * @mbggenerated  Mon May 18 20:23:20 CST 2015
	 */
	public Integer getBillItemId() {
		return billItemId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column bill_conf.bill_item_id
	 * @param billItemId  the value for bill_conf.bill_item_id
	 * @mbggenerated  Mon May 18 20:23:20 CST 2015
	 */
	public void setBillItemId(Integer billItemId) {
		this.billItemId = billItemId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column bill_conf.parent_bill_item_id
	 * @return  the value of bill_conf.parent_bill_item_id
	 * @mbggenerated  Mon May 18 20:23:20 CST 2015
	 */
	public Integer getParentBillItemId() {
		return parentBillItemId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column bill_conf.parent_bill_item_id
	 * @param parentBillItemId  the value for bill_conf.parent_bill_item_id
	 * @mbggenerated  Mon May 18 20:23:20 CST 2015
	 */
	public void setParentBillItemId(Integer parentBillItemId) {
		this.parentBillItemId = parentBillItemId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column bill_conf.bill_item_name
	 * @return  the value of bill_conf.bill_item_name
	 * @mbggenerated  Mon May 18 20:23:20 CST 2015
	 */
	public String getBillItemName() {
		return billItemName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column bill_conf.bill_item_name
	 * @param billItemName  the value for bill_conf.bill_item_name
	 * @mbggenerated  Mon May 18 20:23:20 CST 2015
	 */
	public void setBillItemName(String billItemName) {
		this.billItemName = billItemName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column bill_conf.bill_item_dw
	 * @return  the value of bill_conf.bill_item_dw
	 * @mbggenerated  Mon May 18 20:23:20 CST 2015
	 */
	public String getBillItemDw() {
		return billItemDw;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column bill_conf.bill_item_dw
	 * @param billItemDw  the value for bill_conf.bill_item_dw
	 * @mbggenerated  Mon May 18 20:23:20 CST 2015
	 */
	public void setBillItemDw(String billItemDw) {
		this.billItemDw = billItemDw;
	}
}