package com.ProvidencePoliceLogs;

public class CaseLog {
	private String casenumber;
	private String location;
	private String reported_date;
	private String month;
	private String year;
	private String offense_desc;
	private String statute_code;
	private String statute_desc;
	private Integer counts;
	private String reporting_officer;

	public String getCaseNumber() {
		return casenumber;
	}

	public void setCaseNumber(String casenumber) {
		this.casenumber = casenumber;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getReportedDate() {
		return reported_date;
	}

	public void setReportedDate(String reported_date) {
		this.reported_date = reported_date;
	}

	public String getCaseMonth() {
		return month;
	}

	public void setCaseMonth(String month) {
		this.month = month;
	}

	public String getCaseYear() {
		return year;
	}

	public void setCaseYear(String year) {
		this.year = year;
	}
	
	public String getOffenseDesc() {
		return offense_desc;
	}

	public void setOffenseDesc(String offense_desc) {
		this.offense_desc = offense_desc;
	}
	
	public String getStatuteCode() {
		return statute_code;
	}

	public void setStatuteCode(String statute_code) {
		this.statute_code = statute_code;
	}

	public String getStatuteDesc() {
		return statute_desc;
	}

	public void setStatuteDesc(String statute_desc) {
		this.statute_desc = statute_desc;
	}
	
	public Integer getCounts() {
		return counts;
	}

	public void setCounts(Integer counts) {
		this.counts = counts;
	}
	
	public String getReportingOfficer() {
		return reporting_officer;
	}

	public void setReportingOfficer(String reporting_officer) {
		this.reporting_officer = reporting_officer;
	}
}
