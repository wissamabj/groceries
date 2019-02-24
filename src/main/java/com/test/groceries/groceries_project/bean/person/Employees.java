package com.test.groceries.groceries_project.bean.person;

/**
 * 
 * @author aboujaow
 *
 */
public class Employees extends Person {

	public Employees(Integer id, String firstName, String lastName) {
		super(id, firstName, lastName);
	}

	@Override
	public Integer getDiscount() {
		return 30;
	}
}
