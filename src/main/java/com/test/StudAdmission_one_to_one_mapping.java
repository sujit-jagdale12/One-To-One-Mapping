package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate.Hibernate;
import com.model.Admission;
import com.model.Student;

public class StudAdmission_one_to_one_mapping {

	public static void main(String[] args) {

		SessionFactory factory=Hibernate.getsSessionFactory();
		Session session=factory.openSession();
		
		Admission admission=new Admission("Computer engg", "Sinhgad", "10-06-2022");
		Student student=new Student("Pankaj", "birajdar", admission);
		
		session.beginTransaction();
		session.save(student);
		
		session.getTransaction().commit();
		session.close();
		factory.close();
	}

}
