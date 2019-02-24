package com.test.groceries.groceries_project;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import com.test.groceries.groceries_project.bean.person.Person;
import com.test.groceries.groceries_project.bean.products.Product;
import com.test.groceries.groceries_project.bean.transaction.Transaction;
import com.test.groceries.groceries_project.bean.transaction.TransactionDetails;
import com.test.groceries.groceries_project.factory.TransactionDetailsFactory;
import com.test.groceries.groceries_project.factory.TransactionFactory;
import com.test.groceries.groceries_project.generator.PersonsGenerator;
import com.test.groceries.groceries_project.generator.ProductGenerator;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
	
	List<Person> personList;
    List<Product> productList;
    
    protected void setUp() {
    	personList = PersonsGenerator.generatePersons();
    	productList = ProductGenerator.generateProduct();
	}
    
	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public AppTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(AppTest.class);
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp() {
		Transaction transaction1 = createTransaction1();
		Transaction transaction2 = createTransaction2();
		Transaction transaction3 = createTransaction3();
		Transaction transaction4 = createTransaction4();
		
		assertTrue(transaction1.getTotal()==934.5);
		assertTrue(transaction2.getTotal()==974.75);
		assertTrue(transaction3.getTotal()==1020);
		assertTrue(transaction4.getTotal()==763.5);
	}
	
	 public Transaction createTransaction1() {
	    	Person p = personList.get(2);
	    	List<TransactionDetails> tdList = new ArrayList<TransactionDetails>();
	    	tdList.add(TransactionDetailsFactory.createTransaction(productList.get(0), 10));
	    	tdList.add(TransactionDetailsFactory.createTransaction(productList.get(1), 5));
	    	tdList.add(TransactionDetailsFactory.createTransaction(productList.get(2), 6));
	    	tdList.add(TransactionDetailsFactory.createTransaction(productList.get(3), 7));
	    	try {
				return TransactionFactory.createTransaction(p, tdList);
			} catch (ParseException e) {
				System.out.println("Cannot create transaction. "+e.getMessage());
			}
	    	return null;
	    }
	    
	    public Transaction createTransaction2() {
	    	Person p = personList.get(0);
	    	List<TransactionDetails> tdList = new ArrayList<TransactionDetails>();
	    	tdList.add(TransactionDetailsFactory.createTransaction(productList.get(0), 10));
	    	tdList.add(TransactionDetailsFactory.createTransaction(productList.get(1), 5));
	    	tdList.add(TransactionDetailsFactory.createTransaction(productList.get(2), 6));
	    	tdList.add(TransactionDetailsFactory.createTransaction(productList.get(3), 7));
	    	try {
				return TransactionFactory.createTransaction(p, tdList);
			} catch (ParseException e) {
				System.out.println("Cannot create transaction. "+e.getMessage());
			}
	    	return null;
	    }
	    
	    public Transaction createTransaction3() {
	    	Person p = personList.get(1);
	    	List<TransactionDetails> tdList = new ArrayList<TransactionDetails>();
	    	tdList.add(TransactionDetailsFactory.createTransaction(productList.get(0), 10));
	    	tdList.add(TransactionDetailsFactory.createTransaction(productList.get(1), 5));
	    	tdList.add(TransactionDetailsFactory.createTransaction(productList.get(2), 6));
	    	tdList.add(TransactionDetailsFactory.createTransaction(productList.get(3), 7));
	    	try {
				return TransactionFactory.createTransaction(p, tdList);
			} catch (ParseException e) {
				System.out.println("Cannot create transaction. "+e.getMessage());
			}
	    	return null;
	    }
	    
	    public Transaction createTransaction4() {
	    	Person p = personList.get(4);
	    	List<TransactionDetails> tdList = new ArrayList<TransactionDetails>();
	    	tdList.add(TransactionDetailsFactory.createTransaction(productList.get(0), 10));
	    	tdList.add(TransactionDetailsFactory.createTransaction(productList.get(1), 5));
	    	tdList.add(TransactionDetailsFactory.createTransaction(productList.get(2), 6));
	    	tdList.add(TransactionDetailsFactory.createTransaction(productList.get(3), 7));
	    	try {
				return TransactionFactory.createTransaction(p, tdList);
			} catch (ParseException e) {
				System.out.println("Cannot create transaction. "+e.getMessage());
			}
	    	return null;
	    }
}
