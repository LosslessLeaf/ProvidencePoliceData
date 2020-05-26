package com.ProvidencePoliceLogs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import kong.unirest.json.JSONObject;

public class SQL {

	// JDBC Driver Name & Database URL
	static final String JDBC_DRIVER = "com.microsoft.sqlserver";
	static final String JDBC_DB_URL = "jdbc:sqlserver://localhost;databaseName=ProvidencePoliceLogs;integratedSecurity=true";
	// JDBC Database Credentials
	static final String JDBC_USER = "";
	static final String JDBC_PASS = "";

	public static void InsertCaseLog(JSONObject caseLog) {
		try {
			Connection connObj = DriverManager.getConnection(JDBC_DB_URL, JDBC_USER, JDBC_PASS);
			Object caseNumber = caseLog.get("casenumber");
			Object location = caseLog.get("location");
			Object reportedDate = caseLog.get("reported_date");
			Object caseMonth = caseLog.get("month");
			Object caseYear = caseLog.get("year");
			Object offenseDesc = caseLog.get("offense_desc");
			Object statuteCode = caseLog.get("statute_code");
			Object statuteDesc = caseLog.get("statute_desc");
			Object counts = caseLog.get("counts");
			Object reportingOfficer = caseLog.get("reporting_officer");

			String insertStatement = "INSERT INTO tblCaseLog (CaseNumber, CaseLocation, ReportedDate, CaseMonth, " +
										"CaseYear, OffenseDesc, StatuteCode, StatuteDesc, Counts, ReportingOfficer) VALUES " +
										"('" + caseNumber + "', '"+ location + "', '" + 
										reportedDate + "', '" + caseMonth + "', '" + 
										caseYear + "', '" + offenseDesc + "', '" + 
										statuteCode + "', '" + statuteDesc + "', '" + 
										counts + "', '" + reportingOfficer + "')";
			
			PreparedStatement prepStatement = connObj.prepareStatement(insertStatement);
			prepStatement.execute();

		} catch (Exception sqlException) {
			sqlException.printStackTrace();
		}
	}
}