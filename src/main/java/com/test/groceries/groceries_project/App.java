package com.test.groceries.groceries_project;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import com.test.groceries.groceries_project.bean.person.Person;
import com.test.groceries.groceries_project.bean.products.Product;
import com.test.groceries.groceries_project.bean.transaction.Transaction;
import com.test.groceries.groceries_project.bean.transaction.TransactionDetails;
import com.test.groceries.groceries_project.consumer.PersonConsumer;
import com.test.groceries.groceries_project.consumer.ProductConsumer;
import com.test.groceries.groceries_project.factory.TransactionDetailsFactory;
import com.test.groceries.groceries_project.factory.TransactionFactory;
import com.test.groceries.groceries_project.generator.PersonsGenerator;
import com.test.groceries.groceries_project.generator.ProductGenerator;

/**
 * 
 * @author aboujaow
 *
 */
public class App 
{
	
	static List<Person> personList = PersonsGenerator.generatePersons();
    static List<Product> productList = ProductGenerator.generateProduct();
    public static void main( String[] args )
    {
        System.out.println( "Welcome to our store!" );
       
        
        System.out.println(">>>Our customers");
        System.out.println("id\tFName\tLName\tType\t\tJoin Date");
        System.out.println("--\t-----\t-----\t----\t\t---------");
        personList.stream().forEach(new PersonConsumer());
        
        System.out.println(">>>Our products");
        System.out.println("id\tName\tGroup");
        System.out.println("--\t----\t-----");
        productList.stream().forEach(new ProductConsumer());
        
        System.out.println();
        System.out.println("Transaction 1 Information");
        createTransaction1().printTransactionInformation();
        
        System.out.println();
        System.out.println("Transaction 2 Information");
        createTransaction2().printTransactionInformation();
        
        System.out.println();
        System.out.println("Transaction 3 Information");
        createTransaction3().printTransactionInformation();
        
        System.out.println();
        System.out.println("Transaction 4 Information");
        createTransaction4().printTransactionInformation();
    }
    
    /**
     * This method will return an Object of type #Transaction
     * This #Transaction is for a #Person of type #Affiliate.
     * This method will return the total of the transaction on the non groceries deducted by 10%.
     * 
     * @return #Transaction
     */
    public static Transaction createTransaction1() {
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
    
    /**
     * This method will return an Object of type #Transaction.
     * This #Transaction is for a #Person of type #Customer.
     * This method will return the total of the transaction on the non groceries deducted by 5% as the user has been a customer for more than 2 years. 
     *  
     * @return #Transaction
     */
    public static Transaction createTransaction2() {
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
    
    /**
     * This method will return an Object of type #Transaction.
     * This #Transaction is for a #Person of type #Customer.
     * This method will return the total of the transaction without any percentage deduction as the user has been a customer for less than 2 years.
     *  
     * @return #Transaction
     */
    public static Transaction createTransaction3() {
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
    
    /**
     * This method will return an Object of type #Transaction.
     * This #Transaction is for a #Person of type #Employee.
     * This method will return the total of the transaction on the non groceries deducted by 30%.
     *  
     * @return #Transaction
     */
    public static Transaction createTransaction4() {
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
