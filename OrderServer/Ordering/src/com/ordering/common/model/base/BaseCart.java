package com.ordering.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseCart<M extends BaseCart<M>> extends Model<M> implements IBean {

	public void setUserId(java.lang.Integer userId) {
		set("user_id", userId);
	}

	public java.lang.Integer getUserId() {
		return get("user_id");
	}

	public void setDishesId(java.lang.Integer dishesId) {
		set("dishes_id", dishesId);
	}

	public java.lang.Integer getDishesId() {
		return get("dishes_id");
	}

	public void setNum(java.lang.Integer num) {
		set("num", num);
	}

	public java.lang.Integer getNum() {
		return get("num");
	}

	public void setTag(java.lang.String tag) {
		set("tag", tag);
	}

	public java.lang.String getTag() {
		return get("tag");
	}

}