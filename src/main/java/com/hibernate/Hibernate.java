package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hibernate {

	public static SessionFactory factory;
	
	public static SessionFactory getsSessionFactory() {
		factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		return factory;
	}
	
}
