package com.ProvidencePoliceLogs;

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
	
	
	public static Connection GetSQLConnection() {
		try {
			return DriverManager.getConnection(JDBC_DB_URL, JDBC_USER, JDBC_PASS);
		} catch (Exception sqlException) {
			sqlException.printStackTrace();
		}
		return null;
	}
	
	public static PreparedStatement CreateCaseLogInsertStatement(CaseLog caseLog) {
		try {
			String insertStatement = "INSERT INTO tblCaseLog (CaseNumber, CaseLocation, ReportedDate, CaseMonth, " +
					"CaseYear, OffenseDesc, StatuteCode, StatuteDesc, Counts, ReportingOfficer) VALUES (?,?,?,?,?,?,?,?,?,?)";

			Connection connection = GetSQLConnection();
			PreparedStatement prepStatement = connection.prepareStatement(insertStatement);
			
			prepStatement.setString(1, caseLog.getCaseNumber());
			prepStatement.setString(2, caseLog.getLocation());
			prepStatement.setString(3, caseLog.getReportedDate());
			prepStatement.setString(4, caseLog.getCaseMonth());
			prepStatement.setString(5, caseLog.getCaseYear());
			prepStatement.setString(6, caseLog.getOffenseDesc());
			prepStatement.setString(7, caseLog.getStatuteCode());
			prepStatement.setString(8, caseLog.getStatuteDesc());
			prepStatement.setString(9, caseLog.getCounts().toString());
			prepStatement.setString(10, caseLog.getReportingOfficer());
			
			prepStatement.execute();
			
			if (connection != null) 
				connection.close();
			
		} catch (Exception sqlException) {
			sqlException.printStackTrace();
		}
		return null;
	}
}