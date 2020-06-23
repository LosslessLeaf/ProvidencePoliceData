package com.providencepolicedata.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.providencepolicedata.hibernate.entity.CaseLog;

public class Hibernate {

	public static void main(String[] args) {
		// create session factory
		SessionFactory factory = new Configuration()
								 .configure("hibernate.cfg.xml")
								 .addAnnotatedClass(CaseLog.class)
								 .buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {
			CaseLog caseLog = new CaseLog("2020-012301230", "ADMIRAL ST", "2020-06-21", "6", "2020", "Jaywalking", "31-18-3", "Jaywalking", 1, "M. Smith");
			
			session.beginTransaction();
			
			session.save(caseLog);
			
			session.getTransaction().commit();
			
			
		}
		finally {
			factory.close();
		}
		
		
		
	}
	
}
