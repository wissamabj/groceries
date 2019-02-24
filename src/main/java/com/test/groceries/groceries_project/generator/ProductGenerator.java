package com.test.groceries.groceries_project.generator;

import java.util.ArrayList;
import java.util.List;

import com.test.groceries.groceries_project.bean.products.Product;
import com.test.groceries.groceries_project.bean.products.ProductGroup;
import com.test.groceries.groceries_project.factory.ProductFactory;

public class ProductGenerator {

	public static List<Product> generateProduct() {
		List<Product> productList = new ArrayList<Product>();
		
		productList.add(ProductFactory.createProduct(1, "Oil", 15.5D, ProductGroup.PRODUCTS));
		productList.add(ProductFactory.createProduct(2, "Fish", 150D, ProductGroup.PRODUCTS));
		productList.add(ProductFactory.createProduct(3, "Apple", 10D, ProductGroup.GROCERIES));
		productList.add(ProductFactory.createProduct(4, "Carot", 15D, ProductGroup.GROCERIES));
		
		return productList;

	}

}
