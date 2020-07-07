package com.providencepolicedata.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.providencepolicedata.hibernate.entity.CaseLog;

public class QueryCaseData {

	public static void main(String[] args) {
		// create session factory
		SessionFactory factory = new Configuration()
								 .configure("hibernate.cfg.xml")
								 .addAnnotatedClass(CaseLog.class)
								 .buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {
			session.beginTransaction();
			
			List<CaseLog> caseLogs = session.createQuery("from CaseLog").getResultList();
			
			displayCaseLogs(caseLogs);
			
			session.getTransaction().commit();
			
			
		}
		finally {
			factory.close();
		}
		
		
		
	}

	private static void displayCaseLogs(List<CaseLog> caseLogs) {
		for (CaseLog caseLog : caseLogs) {
			System.out.println(caseLog);
		}
	}
	
}
