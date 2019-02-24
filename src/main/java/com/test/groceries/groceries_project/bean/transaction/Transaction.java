package com.test.groceries.groceries_project.bean.transaction;

import java.util.List;

import com.test.groceries.groceries_project.bean.person.Person;
import com.test.groceries.groceries_project.consumer.TransactionDetailsConsumer;

/**
 * 
 * @author aboujaow
 *
 */
public class Transaction {

	private static Integer count=0;
	private Integer id;
	private Person person;
	private Double discount;
	private Double subTotal;
	private Double total;
	private List<TransactionDetails> transactionDetails;

	public Transaction(Person person, Integer id, Double discount, Double subTotal, Double total,
			List<TransactionDetails> transactionDetails) {
		this.person = person;
		this.id = id;
		this.discount = discount;
		this.subTotal = subTotal;
		this.total = total;
		this.transactionDetails = transactionDetails;
	}
	
	public Integer getId() {
		return id;
	}

	public Double getDiscount() {
		return discount;
	}

	public Double getSubTotal() {
		return subTotal;
	}

	public Double getTotal() {
		return total;
	}

	public Person getPerson() {
		return person;
	}

	public List<TransactionDetails> getTransactionDetails() {
		return transactionDetails;
	}
	
	public static synchronized Integer generateNewTransactionId() {
		return ++count;
	}
	
	public void printTransactionInformation() {
		System.out.println("ID\t\tName\t\tType\t\t\tSubtotal\t\tDiscount\t\tTotal");
		System.out.println("--\t\t----\t\t----\t\t\t--------\t\t--------\t\t-----");
		System.out.println(String.format("%s\t\t%s\t\t%s\t\t%s\t\t\t%s\t\t\t%s", 
				id, person.getFirstName(), person.getClass().getSimpleName(), subTotal, discount, total));
		System.out.println("");
		
		System.out.println("Product\t\tGroup\t\t\tPrice\t\tQuantity");
		System.out.println("-------\t\t-----\t\t\t-----\t\t--------");
		transactionDetails.stream().forEach(new TransactionDetailsConsumer());
	}

}
