package com.ProvidencePoliceLogs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
	
	public static void InsertCaseLog(CaseLog caseLog) {
		try {
			Connection connection = GetSQLConnection();
			
			int caseNumberID = ReturnCaseNumberID(connection, caseLog.getCaseNumber());
			
			InsertCaseReportedDate(connection, caseNumberID, caseLog.getReportedDate());
			InsertCaseOffenseDesc(connection, caseNumberID, caseLog.getOffenseDesc());
			InsertCaseStatutes(connection, caseNumberID, caseLog.getStatuteCode(), caseLog.getStatuteDesc());
			InsertCaseCounts(connection, caseNumberID, caseLog.getCounts());
			InsertCaseReportingOfficer(connection, caseNumberID, caseLog.getReportingOfficer());
			InsertCaseLocation(connection, caseNumberID, caseLog.getLocation());			
			
			if (connection != null) 
				connection.close();
			
		} catch (Exception sqlException) {
			sqlException.printStackTrace();
		}
	}
	
	public static int ReturnCaseNumberID(Connection connection, String caseNumber) throws SQLException {
		
		final String queryCheck = "SELECT COUNT(*) from tblCaseNumbers WHERE CaseNumber = ?";
		final PreparedStatement ps = connection.prepareStatement(queryCheck);
		
		ps.setString(1, caseNumber);
		
		final ResultSet resultSet = ps.executeQuery();
		
		if (resultSet.next()) {
		    return resultSet.getInt("CaseNumberID");
		} else {
			String insertStatement = "INSERT INTO tblCaseNumbers (CaseNumber) VALUES (?)";
			PreparedStatement prepStatement = connection.prepareStatement(insertStatement, Statement.RETURN_GENERATED_KEYS);
			prepStatement.setString(1, caseNumber);
			prepStatement.executeUpdate();
			
			try (ResultSet generatedKeys = prepStatement.getGeneratedKeys()) {
				return generatedKeys.getInt(1);
			}
			
		}
	}
	
	public static void InsertCaseReportedDate(Connection connection, int caseNumberID, String reportedDate) throws SQLException {
		String insertStatement = "INSERT INTO tblCaseReportedDate (CaseNumberID, ReportedDate) VALUES (?, ?)";
		PreparedStatement prepStatement = connection.prepareStatement(insertStatement);
		prepStatement.setInt(1, caseNumberID);
		prepStatement.setString(2, reportedDate);
		prepStatement.execute();
	}
	
	public static void InsertCaseOffenseDesc(Connection connection, int caseNumberID, String offenseDesc) throws SQLException {
		String insertStatement = "INSERT INTO tblCaseOffenseDesc (CaseNumberID, OffenseDesc) VALUES (?, ?)";
		PreparedStatement prepStatement = connection.prepareStatement(insertStatement);
		prepStatement.setInt(1, caseNumberID);
		prepStatement.setString(2, offenseDesc);
		prepStatement.execute();
	}
	
	public static void InsertCaseStatutes(Connection connection, int caseNumberID, String statuteCode, String statuteDesc) throws SQLException{
		String insertStatement = "INSERT INTO tblCaseReportedDate (CaseNumberID, StatuteCode, StatuteDesc) VALUES (?, ?, ?)";
		PreparedStatement prepStatement = connection.prepareStatement(insertStatement);
		prepStatement.setInt(1, caseNumberID);
		prepStatement.setString(2, statuteCode);
		prepStatement.setString(3, statuteDesc);
		prepStatement.execute();
	}
	
	public static void InsertCaseCounts(Connection connection, int caseNumberID, int counts) throws SQLException {
		String insertStatement = "INSERT INTO tblCaseCounts (CaseNumberID, Counts) VALUES (?, ?)";
		PreparedStatement prepStatement = connection.prepareStatement(insertStatement);
		prepStatement.setInt(1, caseNumberID);
		prepStatement.setInt(2, counts);
		prepStatement.execute();
	}
	
	public static void InsertCaseReportingOfficer(Connection connection, int caseNumberID, String reportingOfficer) throws SQLException {
		String insertStatement = "INSERT INTO tblCaseReportingOfficers (CaseNumberID, ReportingOfficer) VALUES (?, ?)";
		PreparedStatement prepStatement = connection.prepareStatement(insertStatement);
		prepStatement.setInt(1, caseNumberID);
		prepStatement.setString(2, reportingOfficer);
		prepStatement.execute();
	}
	
	public static void InsertCaseLocation(Connection connection, int caseNumberID, String location) throws SQLException {
		String insertStatement = "INSERT INTO tblCaseLocation (CaseNumberID, Counts) VALUES (?, ?)";
		PreparedStatement prepStatement = connection.prepareStatement(insertStatement);
		prepStatement.setInt(1, caseNumberID);
		prepStatement.setString(2, location);
		prepStatement.execute();
	}
	
}