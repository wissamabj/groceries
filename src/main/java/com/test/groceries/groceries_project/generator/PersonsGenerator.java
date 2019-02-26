package com.test.groceries.groceries_project.generator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.test.groceries.groceries_project.bean.person.Affiliate;
import com.test.groceries.groceries_project.bean.person.Customer;
import com.test.groceries.groceries_project.bean.person.Employees;
import com.test.groceries.groceries_project.bean.person.Person;
import com.test.groceries.groceries_project.factory.PersonFactory;
import com.test.groceries.groceries_project.utilities.DateUtil;

/**
 * 
 * @author aboujaow
 *
 */
public class PersonsGenerator {
	
	public static List<Person> generatePersons() {
		List<Person> personList = new ArrayList<Person>();
		Customer customer1 = (Customer)PersonFactory.createPerson(Customer.class, 1, "Cust1", "Cust1");
		try {
			customer1.setEntry(DateUtil.createDate("2009/09/30", "yyyy/MM/dd"));
		} catch (ParseException e) {
		}
		Customer customer2 = (Customer)PersonFactory.createPerson(Customer.class, 2, "Cust2", "Cust2");
		try {
			customer2.setEntry(DateUtil.createDate("2018/10/20", "yyyy/MM/dd") );
		} catch (ParseException e) {
		}
		personList.add(customer1);
		personList.add(customer2);
		personList.add(PersonFactory.createPerson(Affiliate.class, 3, "Aff1", "Aff1"));
		personList.add(PersonFactory.createPerson(Affiliate.class, 4, "Aff2", "Aff2"));
		personList.add(PersonFactory.createPerson(Employees.class, 5, "Emp1", "Emp1"));
		personList.add(PersonFactory.createPerson(Employees.class, 6, "Emp2", "Emp2"));
		
		return personList;

	}

}
