package com.providencepolicedata.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.providencepolicedata.hibernate.entity.ArrestLog;
import com.providencepolicedata.hibernate.entity.CaseLog;

public class QueryArrestData {

	public static void main(String[] args) {
		// create session factory
		SessionFactory factory = new Configuration()
								 .configure("hibernate.cfg.xml")
								 .addAnnotatedClass(ArrestLog.class)
								 .buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {
			session.beginTransaction();
			
			List<ArrestLog> arrestLogs = session.createQuery("from ArrestLog").getResultList();
			
			displayArrestLogs(arrestLogs);
			
			session.getTransaction().commit();
			
			
		}
		finally {
			factory.close();
		}
		
		
		
	}

	private static void displayArrestLogs(List<ArrestLog> arrestLogs) {
		for (ArrestLog arrestLog : arrestLogs) {
			System.out.println(arrestLog);
		}
	}
	
}
