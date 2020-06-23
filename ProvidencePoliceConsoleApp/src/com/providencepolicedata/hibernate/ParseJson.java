package com.providencepolicedata.hibernate;
import com.google.gson.Gson;
import com.providencepolicedata.hibernate.entity.CaseLog;

import kong.unirest.json.JSONArray;

public class ParseJson {
	// this will be unirest get request
	
	public static void ParseCaseJson() throws Exception {
		
		final String json = API.GetCaseLogData();
		
		JSONArray caseJson = new JSONArray(json);

		for (int i = 0; i < caseJson.length(); i++) {
			CaseLog currentCase = new Gson().fromJson(caseJson.getJSONObject(i).toString(), CaseLog.class);
			SQL.InsertCaseLog(currentCase);
		}
		
	}
}