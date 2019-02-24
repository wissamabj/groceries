package com.test.groceries.groceries_project.bean.products;

/**
 * 
 * @author aboujaow
 *
 */
public class Product {

	private Integer id;
	private String name;
	private Double price;
	private ProductGroup group;

	public Product(Integer id, String name, Double price, ProductGroup group) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.group = group;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public ProductGroup getGroup() {
		return group;
	}

	public void setGroup(ProductGroup group) {
		this.group = group;
	}

	public Integer getId() {
		return id;
	}
}
