package com.test.groceries.groceries_project.factory;

import com.test.groceries.groceries_project.bean.person.Affiliate;
import com.test.groceries.groceries_project.bean.person.Customer;
import com.test.groceries.groceries_project.bean.person.Employees;
import com.test.groceries.groceries_project.bean.person.Person;

public class PersonFactory {

	public static Person createPerson(Class<? extends Person> cls, Integer id, String firstName, String lastName) {
		if (cls.isAssignableFrom(Employees.class)) {
			return new Employees(id, firstName,lastName);
		} else if (cls.isAssignableFrom(Affiliate.class)) {
			return new Affiliate(id, firstName,lastName);
		} else if (cls.isAssignableFrom(Customer.class)) {
			return new Customer(id, firstName,lastName);
		}
		return null;
	}
}
