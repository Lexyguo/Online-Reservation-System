package com.ordering.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseComboDetail<M extends BaseComboDetail<M>> extends Model<M> implements IBean {

	public void setComboId(java.lang.Integer comboId) {
		set("combo_id", comboId);
	}

	public java.lang.Integer getComboId() {
		return get("combo_id");
	}

	public void setDishesId(java.lang.Integer dishesId) {
		set("dishes_id", dishesId);
	}

	public java.lang.Integer getDishesId() {
		return get("dishes_id");
	}

	public void setAmount(java.lang.Integer amount) {
		set("amount", amount);
	}

	public java.lang.Integer getAmount() {
		return get("amount");
	}

	public void setPrice(java.math.BigDecimal price) {
		set("price", price);
	}

	public java.math.BigDecimal getPrice() {
		return get("price");
	}

}
