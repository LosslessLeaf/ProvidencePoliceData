package com.providencepolicedata.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;

@Entity
@Table(name="tblCaseLog")
public class CaseLog {
	@Id
	@Column(name="case_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer caseID;
	
	@Column(name="case_number")
	private String caseNumber;
	
	@Column(name="case_location")
	private String location;
	
	@Column(name="reported_date")
	private String reportedDate;
	
	@Column(name="case_month")
	private String caseMonth;
	
	@Column(name="case_year")
	private String caseYear;
	
	@Column(name="offense_desc")
	private String offenseDesc;
	
	@Column(name="statute_code")
	private String statuteCode;
	
	@Column(name="statute_desc")
	private String statuteDesc;
	
	@Column(name="counts")
	private Integer counts;
	
	@Column(name="reporting_officer")
	private String reportingOfficer;
	
	
	public CaseLog() {
		
	}


	public CaseLog(String caseNumber, String location, String reportedDate, String caseMonth,
			String caseYear, String offenseDesc, String statuteCode, String statuteDesc, Integer counts,
			String reportingOfficer) {
		this.caseNumber = caseNumber;
		this.location = location;
		this.reportedDate = reportedDate;
		this.caseMonth = caseMonth;
		this.caseYear = caseYear;
		this.offenseDesc = offenseDesc;
		this.statuteCode = statuteCode;
		this.statuteDesc = statuteDesc;
		this.counts = counts;
		this.reportingOfficer = reportingOfficer;
	}


	public Integer getCaseID() {
		return caseID;
	}


	public void setCaseID(Integer caseID) {
		this.caseID = caseID;
	}


	public String getCaseNumber() {
		return caseNumber;
	}


	public void setCaseNumber(String caseNumber) {
		this.caseNumber = caseNumber;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getReportedDate() {
		return reportedDate;
	}


	public void setReportedDate(String reportedDate) {
		this.reportedDate = reportedDate;
	}


	public String getCaseMonth() {
		return caseMonth;
	}


	public void setCaseMonth(String caseMonth) {
		this.caseMonth = caseMonth;
	}


	public String getCaseYear() {
		return caseYear;
	}


	public void setCaseYear(String caseYear) {
		this.caseYear = caseYear;
	}


	public String getOffenseDesc() {
		return offenseDesc;
	}


	public void setOffenseDesc(String offenseDesc) {
		this.offenseDesc = offenseDesc;
	}


	public String getStatuteCode() {
		return statuteCode;
	}


	public void setStatuteCode(String statuteCode) {
		this.statuteCode = statuteCode;
	}


	public String getStatuteDesc() {
		return statuteDesc;
	}


	public void setStatuteDesc(String statuteDesc) {
		this.statuteDesc = statuteDesc;
	}


	public Integer getCounts() {
		return counts;
	}


	public void setCounts(Integer counts) {
		this.counts = counts;
	}


	public String getReportingOfficer() {
		return reportingOfficer;
	}


	public void setReportingOfficer(String reportingOfficer) {
		this.reportingOfficer = reportingOfficer;
	}

}
