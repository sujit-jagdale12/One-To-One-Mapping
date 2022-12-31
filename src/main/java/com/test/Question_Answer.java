package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate.Hibernate;
import com.model.Answer;
import com.model.Question;

public class Question_Answer {

	public static void main(String[] args) {

		SessionFactory factory = Hibernate.getsSessionFactory();
		Session session = factory.openSession();

		Question question = new Question();
		question.setQuestion("What is java?");

		Answer answer = new Answer();
		answer.setAnswer("Java is a programming language");
		question.setAnswer(answer);
		session.beginTransaction();
		session.save(question);

		session.getTransaction().commit();
		session.close();
		factory.close();
	}

}
