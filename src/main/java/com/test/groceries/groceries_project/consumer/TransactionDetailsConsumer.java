package com.test.groceries.groceries_project.consumer;

import java.util.function.Consumer;

import com.test.groceries.groceries_project.bean.transaction.TransactionDetails;

public class TransactionDetailsConsumer implements Consumer<TransactionDetails>{

	@Override
	public void accept(TransactionDetails t) {
		System.out.print(t.getProduct().getName());
		System.out.print("\t\t");
		System.out.print(t.getProduct().getGroup());
		System.out.print("\t\t");
		System.out.print(t.getProduct().getPrice());
		System.out.print("\t\t");
		System.out.print(t.getQuantity());
		System.out.println();
	}

}
