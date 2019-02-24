package com.test.groceries.groceries_project.factory;

import com.test.groceries.groceries_project.bean.products.Product;
import com.test.groceries.groceries_project.bean.transaction.TransactionDetails;

/**
 * 
 * @author aboujaow
 *
 */
public class TransactionDetailsFactory {

	public static TransactionDetails createTransaction(Product product, Integer quantity) {
		return new TransactionDetails(product, quantity);
	}
}
