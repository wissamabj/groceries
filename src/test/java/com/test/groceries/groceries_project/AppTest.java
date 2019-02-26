package com.test.groceries.groceries_project;

import java.util.List;

import com.test.groceries.groceries_project.bean.person.Affiliate;
import com.test.groceries.groceries_project.bean.person.Customer;
import com.test.groceries.groceries_project.bean.person.Employees;
import com.test.groceries.groceries_project.bean.person.Person;
import com.test.groceries.groceries_project.bean.products.Product;
import com.test.groceries.groceries_project.bean.transaction.Transaction;
import com.test.groceries.groceries_project.bean.transaction.TransactionDetails;
import com.test.groceries.groceries_project.factory.TransactionDetailsFactory;
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
	 * Random test
	 */
	public void testApp() {
		Transaction transaction1 = createTransaction1();
		Transaction transaction2 = createTransaction2();
		Transaction transaction3 = createTransaction3();
		Transaction transaction4 = createTransaction4();
		TransactionDetails transactionDetails = testTransactionDetails();
		Person person = testPerson();

		assertTrue(transaction1.getTotal() == 934.5);
		assertTrue(transaction2.getTotal() == 974.75);
		assertTrue(transaction3.getTotal() == 1020);
		assertTrue(transaction4.getTotal() == 763.5);
		assertNotNull(transactionDetails);
		assertNotNull(transactionDetails.getProduct());
		assertTrue(transactionDetails.getQuantity()>9);
		assertTrue(person.getFirstName().equals("fname"));
		assertTrue(person.getLastName().equals("lname"));
		assertTrue(person.getId().equals(1));
		assertTrue(person.getDiscount().equals(10));
	}
	
	public Person testPerson() {
		return new Person(1,"fname","lname") {
			
			@Override
			public Integer getDiscount() {
				return 10;
			}
		};
	}
	
	
	public TransactionDetails testTransactionDetails() {
		return TransactionDetailsFactory.createTransaction(productList.get(0), 10);
	}

	/**
     * This #Transaction is for a #{@link Person} of type #{@link Affiliate}.
     * This method will return the total of the transaction on the non groceries Items deducted by 10%.
     * An additional 45 discount will be made as the total amount of the Transaction exceeds 900
     * 
     * @return #Transaction
     */
	public Transaction createTransaction1() {
		return App.createTransaction1();
	}

	/**
     * This #Transaction is for a #{@link Person} of type #{@link Customer}.
     * This method will return the total of the transaction on the non groceries Items deducted by 5% as the user has been 
     * a customer for more than 2 years.
     * An additional 45 discount will be made as the total amount of the Transaction exceeds 900
     * 
     * @return #Transaction
     */
	public Transaction createTransaction2() {
		return App.createTransaction2();
	}

	/**
     * This #Transaction is for a #{@link Person} of type #{@link Customer}.
     * This method will not include any percentage deduction as the user has not been a customer for more than 2 years.
     * 50 discount will be made as the total amount of the Transaction exceeds 1000
     * 
     * @return #Transaction
     */
	public Transaction createTransaction3() {
		return App.createTransaction3();
	}

	/**
     * This #Transaction is for a #{@link Person} of type #{@link Employees}.
     * This method will return the total of the transaction on the non groceries Items deducted by 300%.
     * An additional 35 discount will be made as the total amount of the Transaction exceeds 700
     * 
     * @return #Transaction
     */
	public Transaction createTransaction4() {
		return App.createTransaction4();
	}
}
