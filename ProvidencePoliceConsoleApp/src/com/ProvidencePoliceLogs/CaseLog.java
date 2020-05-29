package com.ProvidencePoliceLogs;

public class CaseLog {
	private String caseNumber;
	private String location;
	private String reportedDate;
	private String caseMonth;
	private String caseYear;
	private String offenseDesc;
	private String statuteCode;
	private String statuteDesc;
	private Integer counts;
	private String reportingOfficer;

	public String getCaseNumber() {
		return caseNumber;
	}

	public void setCaseNumber(String caseNumber) {
		this.location = caseNumber;
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

	public String getStatueDesc() {
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
