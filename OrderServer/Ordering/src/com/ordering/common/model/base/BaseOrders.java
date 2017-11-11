package com.ordering.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseOrders<M extends BaseOrders<M>> extends Model<M> implements IBean {

	public void setOrderId(java.lang.Integer orderId) {
		set("order_id", orderId);
	}

	public java.lang.Integer getOrderId() {
		return get("order_id");
	}

	public void setUserId(java.lang.Integer userId) {
		set("user_id", userId);
	}

	public java.lang.Integer getUserId() {
		return get("user_id");
	}

	public void setOrdertime(java.util.Date ordertime) {
		set("ordertime", ordertime);
	}

	public java.util.Date getOrdertime() {
		return get("ordertime");
	}

	public void setAmount(java.lang.Integer amount) {
		set("amount", amount);
	}

	public java.lang.Integer getAmount() {
		return get("amount");
	}

	public void setTotal(java.lang.Double total) {
		set("total", total);
	}

	public java.lang.Double getTotal() {
		return get("total");
	}

	public void setPayerId(java.lang.Integer payerId) {
		set("payer_id", payerId);
	}

	public java.lang.Integer getPayerId() {
		return get("payer_id");
	}

	public void setRemark(java.lang.String remark) {
		set("remark", remark);
	}

	public java.lang.String getRemark() {
		return get("remark");
	}

}