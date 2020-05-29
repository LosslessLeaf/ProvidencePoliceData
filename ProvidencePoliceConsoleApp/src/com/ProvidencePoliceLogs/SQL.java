package com.ProvidencePoliceLogs;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class SQL {

	// JDBC Driver Name & Database URL
	static final String JDBC_DRIVER = "com.microsoft.sqlserver";
	static final String JDBC_DB_URL = "jdbc:sqlserver://localhost;databaseName=ProvidencePoliceLogs;integratedSecurity=true";
	// JDBC Database Credentials
	static final String JDBC_USER = "";
	static final String JDBC_PASS = "";

	public static void InsertCaseLog(CaseLog caseLog) {
		try {
			Connection connObj = DriverManager.getConnection(JDBC_DB_URL, JDBC_USER, JDBC_PASS);
			
			String insertStatement = "INSERT INTO tblCaseLog (CaseNumber, CaseLocation, ReportedDate, CaseMonth, " +
									"CaseYear, OffenseDesc, StatuteCode, StatuteDesc, Counts, ReportingOfficer) VALUES " +
									"('";
			StringBuffer strbuf = new StringBuffer(insertStatement);
			
			Field[] fields = caseLog.getClass().getDeclaredFields();
			
			for (Field caseObject : fields) {
			    strbuf.append(caseObject);
			    strbuf.append("', '");
			}
			strbuf.substring(0, strbuf.length()-5);
			strbuf.append(")");
			
			System.out.println(strbuf);
			
			PreparedStatement prepStatement = connObj.prepareStatement(insertStatement);
//			prepStatement.execute();

		} catch (Exception sqlException) {
			sqlException.printStackTrace();
		}
	}
}