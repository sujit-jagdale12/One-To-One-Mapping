package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.Hibernate;
import com.model.Address;
import com.model.Employee;

public class AddEmp {

	public static void main(String[] args) {

		SessionFactory factory = Hibernate.getsSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Address address = new Address("Bharat colony Karve", "Pune", "Maharashtra", "India", 411052);
		Employee emp = new Employee();
		emp.setName("Sujit Jagdale");
		emp.setEmail("sujit@gmail.com");
		emp.setAddress(address);

		session.save(emp);
		transaction.commit();

		factory.close();
		System.out.println("Saved....");
	}

}
