package com.ordering.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseStock<M extends BaseStock<M>> extends Model<M> implements IBean {

	public void setStockId(java.lang.Integer stockId) {
		set("stock_id", stockId);
	}

	public java.lang.Integer getStockId() {
		return get("stock_id");
	}

	public void setStockName(java.lang.String stockName) {
		set("stock_name", stockName);
	}

	public java.lang.String getStockName() {
		return get("stock_name");
	}

	public void setCategory(java.lang.String category) {
		set("category", category);
	}

	public java.lang.String getCategory() {
		return get("category");
	}

	public void setCount(java.lang.Integer count) {
		set("count", count);
	}

	public java.lang.Integer getCount() {
		return get("count");
	}

	public void setDate(java.util.Date date) {
		set("date", date);
	}

	public java.util.Date getDate() {
		return get("date");
	}

	public void setState(java.lang.String state) {
		set("state", state);
	}

	public java.lang.String getState() {
		return get("state");
	}

}
