package com.test.groceries.groceries_project.consumer;

import java.util.function.Consumer;

import com.test.groceries.groceries_project.bean.products.Product;;

public class ProductConsumer implements Consumer<Product>{

	@Override
	public void accept(Product t) {
		System.out.print(t.getId());
		System.out.print("\t");
		System.out.print(t.getName());
		System.out.print("\t");
		System.out.print(t.getGroup());
		System.out.println();
	}

}
