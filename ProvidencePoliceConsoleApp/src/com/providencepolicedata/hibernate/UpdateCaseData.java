package com.providencepolicedata.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import kong.unirest.json.JSONArray;

import com.google.gson.Gson;
import com.providencepolicedata.hibernate.entity.CaseLog;

public class UpdateCaseData {

	public static void main(String[] args) throws Exception {
		
		final String json = API.GetCaseLogData();
		
//		System.out.println(json);

		JSONArray caseJson = new JSONArray(json);
		
		for (int i = 0; i < caseJson.length(); i++) {
			CaseLog currentCase = new Gson().fromJson(caseJson.getJSONObject(i).toString(), CaseLog.class);
			saveCaseData(currentCase);
		}
	}

	private static void saveCaseData(CaseLog caseLog) {
		// create session factory
		SessionFactory factory = new Configuration()
								 .configure("hibernate.cfg.xml")
								 .addAnnotatedClass(CaseLog.class)
								 .buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			
			session.save(caseLog);
			
			session.getTransaction().commit();
			
		}
		finally {
			factory.close();
		}
	}
	
}
