package com.test.groceries.groceries_project.bean.person;

/**
 * 
 * @author aboujaow
 *
 */
public abstract class Person {
	
	private Integer id;
	private String firstName;
	private String lastName;


	public Person(Integer id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Integer getId() {
		return id;
	}
	
	public abstract Integer getDiscount();

}
