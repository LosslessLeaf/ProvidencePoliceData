package com.providencepolicedata.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import kong.unirest.json.JSONArray;

import com.google.gson.Gson;
import com.providencepolicedata.hibernate.entity.ArrestLog;

public class UpdateArrestData {

	public static void main(String[] args) throws Exception {
		
		final String json = API.GetArrestLogData();

		JSONArray arrestJson = new JSONArray(json);
		
		for (int i = 0; i < arrestJson.length(); i++) {
			ArrestLog currentArrestLog = new Gson().fromJson(arrestJson.getJSONObject(i).toString(), ArrestLog.class);
			saveArrestData(currentArrestLog);
		}
	}

	private static void saveArrestData(ArrestLog arrestLog) {
		// create session factory
		SessionFactory factory = new Configuration()
								 .configure("hibernate.cfg.xml")
								 .addAnnotatedClass(ArrestLog.class)
								 .buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			
			session.save(arrestLog);
			
			session.getTransaction().commit();
			
		}
		finally {
			factory.close();
		}
	}
	
}
