package com.test.groceries.groceries_project.factory;

import com.test.groceries.groceries_project.bean.products.Product;
import com.test.groceries.groceries_project.bean.products.ProductGroup;

public class ProductFactory {

	public static Product createProduct(Integer id, String name, Double price, ProductGroup group) {
		return new Product(id, name, price, group);
	}
}
