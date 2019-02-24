package com.test.groceries.groceries_project.bean.transaction;

import com.test.groceries.groceries_project.bean.products.Product;

/**
 * 
 * @author aboujaow
 *
 */
public class TransactionDetails {

	private Product product;
	private Integer quantity;

	public TransactionDetails(Product product, Integer quantity) {
		this.product = product;
		this.quantity = quantity;
	}
	
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

}
