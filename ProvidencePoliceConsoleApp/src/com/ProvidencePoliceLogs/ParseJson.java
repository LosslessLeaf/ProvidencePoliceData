package com.ProvidencePoliceLogs;
import com.google.gson.Gson;
import kong.unirest.json.JSONArray;

public class ParseJson {
	// this will be unirest get request
	
	public static void ParseCaseJson() {
		
		final String json = "[{\"casenumber\":\"2020-00038172\",\"location\":\"65 MARCH ST\",\"reported_date\":\"2020-05-19T05:22:00.000\",\"month\":\"5\",\"year\":\"2020\",\"offense_desc\":\"Burglary\",\"statute_code\":\"11-8-2\",\"statute_desc\":\"B&E DWELLING HOUSE W/O CONSENT\",\"counts\":\"1\",\"reporting_officer\":\"RBallinger\"}\r\n"
				+ ",{\"casenumber\":\"2020-00038171\",\"location\":\"676 CRANSTON ST\",\"reported_date\":\"2020-05-19T05:10:00.000\",\"month\":\"5\",\"year\":\"2020\",\"offense_desc\":\"Larceny, Other\",\"statute_code\":\"11-41-1\",\"statute_desc\":\"LARCENY/O $1500 - ALL OTH LARCENY\",\"counts\":\"1\",\"reporting_officer\":\"HVentura\"}\r\n"
				+ ",{\"casenumber\":\"2020-00038171\",\"location\":\"676 CRANSTON ST\",\"reported_date\":\"2020-05-19T05:10:00.000\",\"month\":\"5\",\"year\":\"2020\",\"offense_desc\":\"Burglary\",\"statute_code\":\"11-8-5\",\"statute_desc\":\"B&E OTHER BUILDING W/CRIM INTENT\",\"counts\":\"1\",\"reporting_officer\":\"HVentura\"}\r\n"
				+ ",{\"casenumber\":\"2020-00038165\",\"location\":\"THURBERS AVE & PRAIRIE AVE\",\"reported_date\":\"2020-05-19T03:04:00.000\",\"month\":\"5\",\"year\":\"2020\",\"offense_desc\":\"Drug Offenses\",\"statute_code\":\"21-28-4.01-C1A\",\"statute_desc\":\"POSSESSION OF SCHEDULE I II III\",\"counts\":\"1\",\"reporting_officer\":\"BMcParlin\"}\r\n"
				+ ",{\"casenumber\":\"2020-00038153\",\"location\":\"25 WAVERLY ST\",\"reported_date\":\"2020-05-19T00:45:00.000\",\"month\":\"5\",\"year\":\"2020\",\"offense_desc\":\"Larceny, Other\",\"statute_code\":\"11-41-1\",\"statute_desc\":\"LARCENY/U $1500 - ALL OTH LARCENY\",\"counts\":\"2\",\"reporting_officer\":\"RFedo\"}\r\n"
				+ ",{\"casenumber\":\"2020-00038153\",\"location\":\"25 WAVERLY ST\",\"reported_date\":\"2020-05-19T00:45:00.000\",\"month\":\"5\",\"year\":\"2020\",\"offense_desc\":\"Burglary\",\"statute_code\":\"11-8-1.1\",\"statute_desc\":\"ATTEMPTED BREAKING AND ENTERING\",\"counts\":\"6\",\"reporting_officer\":\"RFedo\"}\r\n"
				+ ",{\"casenumber\":\"2020-00038153\",\"location\":\"25 WAVERLY ST\",\"reported_date\":\"2020-05-19T00:45:00.000\",\"month\":\"5\",\"year\":\"2020\",\"offense_desc\":\"RI Statute Violation\",\"statute_code\":\"11-1-6\",\"statute_desc\":\"CONSPIRACY - ALL OTH OFFENSE\",\"counts\":\"1\",\"reporting_officer\":\"RFedo\"}\r\n"
				+ ",{\"casenumber\":\"2020-00038147\",\"location\":\"171 CANTON ST\",\"reported_date\":\"2020-05-19T00:33:00.000\",\"month\":\"5\",\"year\":\"2020\",\"offense_desc\":\"Assault, Simple\",\"statute_code\":\"11-5-3\",\"statute_desc\":\"SIMPLE ASSAULT OR BATTERY\",\"counts\":\"1\",\"reporting_officer\":\"RJoseph\"}\r\n"
				+ ",{\"casenumber\":\"2020-00038097\",\"location\":\"195 LEXINGTON AVE\",\"reported_date\":\"2020-05-18T20:46:00.000\",\"month\":\"5\",\"year\":\"2020\",\"offense_desc\":\"Missing Persons\",\"statute_code\":\"Not Used\",\"statute_desc\":\"No violations\",\"counts\":\"0\",\"reporting_officer\":\"Central Station\"}]";
		
		JSONArray caseJson = new JSONArray(json);

		for (int i = 0; i < caseJson.length(); i++) {
			CaseLog currentCase = new Gson().fromJson(caseJson.getJSONObject(i).toString(), CaseLog.class);
			SQL.CreateCaseLogInsertStatement(currentCase);
		}
		
	}
}