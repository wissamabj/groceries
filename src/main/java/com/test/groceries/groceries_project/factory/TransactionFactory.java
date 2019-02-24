package com.test.groceries.groceries_project.factory;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import com.test.groceries.groceries_project.bean.person.Customer;
import com.test.groceries.groceries_project.bean.person.Person;
import com.test.groceries.groceries_project.bean.products.ProductGroup;
import com.test.groceries.groceries_project.bean.transaction.Transaction;
import com.test.groceries.groceries_project.bean.transaction.TransactionDetails;
import com.test.groceries.groceries_project.utilities.DateUtil;

/**
 * 
 * @author aboujaow
 *
 */
public class TransactionFactory {

	public static final Long TWO_YEAR = 63072000000L;
	
	public static Transaction createTransaction(Person p, List<TransactionDetails> tdList) throws ParseException {
		return processTransaction(p, tdList);
	}
	
	private static Transaction processTransaction(Person p, List<TransactionDetails> tdList) throws ParseException {
		
		Integer transactionId = Transaction.generateNewTransactionId();
		Double transactionDiscount = 0D;
		Double transactionSubTotalPrice = 0D;
		Double transactionTotalPrice = 0D;
		
		Double groceriesProductAmount = 0D;
		Double nonGroceriesProductAmount = 0D;
		Double amountIncludingDiscountRate = 0D;
		Double discountOnHundred = 0D;
		
		
		Double discountRate = (100D-p.getDiscount())/100;
		
		for(TransactionDetails td:tdList) {
			Double productPrice = td.getProduct().getPrice();
			Integer quantity = td.getQuantity();
			Double totalPrice = productPrice*quantity;
			
			if(td.getProduct().getGroup().equals(ProductGroup.GROCERIES)) {
				groceriesProductAmount = groceriesProductAmount + totalPrice;
			} else {
				nonGroceriesProductAmount = nonGroceriesProductAmount + totalPrice;
			}
		}
		//Calculating the transaction subTotal ==> without discount
		transactionSubTotalPrice = groceriesProductAmount + nonGroceriesProductAmount;
		
		amountIncludingDiscountRate = nonGroceriesProductAmount*discountRate;
		
		//check if the Person is a customer and is not a customer from two years not discount to apply
		if(p instanceof Customer) {
			Date currentDate;
			currentDate = DateUtil.createDate(null, null);
			Long currentDateInMilli = currentDate.getTime();
			Long customerEntryDateInMilli = ((Customer) p).getEntry().getTime();
			if((currentDateInMilli-customerEntryDateInMilli)<TWO_YEAR) {
				amountIncludingDiscountRate = nonGroceriesProductAmount;
			}
		}
		
		//Apply discount on every one hundred dollar
		discountOnHundred = Math.floor(Math.floor(transactionSubTotalPrice-(nonGroceriesProductAmount-amountIncludingDiscountRate))/100)*5;
		
		transactionDiscount = discountOnHundred + (nonGroceriesProductAmount-amountIncludingDiscountRate);
		transactionTotalPrice = transactionSubTotalPrice - transactionDiscount;
		
		return new Transaction(p, transactionId, transactionDiscount, transactionSubTotalPrice, transactionTotalPrice, tdList);
	}
	
}
