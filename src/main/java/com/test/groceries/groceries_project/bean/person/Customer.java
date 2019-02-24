package com.test.groceries.groceries_project.bean.person;

import java.util.Date;

/**
 * 
 * @author aboujaow
 *
 */
public class Customer extends Person {

	private Date entry;

	public Customer(Integer id, String firstName, String lastName) {
		super(id, firstName, lastName);
	}

	@Override
	public Integer getDiscount() {
		return 5;
	}
	
	public Date getEntry() {
		return entry;
	}

	public void setEntry(Date entry) {
		this.entry = entry;
	}
}
