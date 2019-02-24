package com.test.groceries.groceries_project.consumer;

import java.util.function.Consumer;

import com.test.groceries.groceries_project.bean.person.Customer;
import com.test.groceries.groceries_project.bean.person.Person;
import com.test.groceries.groceries_project.utilities.DateUtil;;

public class PersonConsumer implements Consumer<Person>{

	@Override
	public void accept(Person t) {
		System.out.print(t.getId());
		System.out.print("\t");
		System.out.print(t.getFirstName());
		System.out.print("\t");
		System.out.print(t.getLastName());
		System.out.print("\t");
		System.out.print(t.getClass().getSimpleName());
		
		if(t instanceof Customer) {
			System.out.print("\t");
			System.out.print(DateUtil.formatDateAsString(((Customer) t).getEntry(), DateUtil.DEFAULT_DATE_FORMAT));
		}
		
		System.out.println();
		
		
	}

}
