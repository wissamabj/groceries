package com.test.groceries.groceries_project.bean.person;

/**
 * 
 * @author aboujaow
 *
 */
public class Affiliate extends Person {
	
	public Affiliate(Integer id, String firstName, String lastName) {
		super(id, firstName, lastName);
	}

	@Override
	public Integer getDiscount() {
		return 10;
	}
}
