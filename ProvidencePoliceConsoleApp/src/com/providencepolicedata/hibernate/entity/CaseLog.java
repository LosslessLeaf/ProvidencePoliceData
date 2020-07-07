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
	@Column(name="casenumber_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int casenumber_id;
	
	@Column(name="casenumber")
	private String casenumber;
	
	@Column(name="location")
	private String location;
	
	@Column(name="reported_date")
	private String reported_date;
	
	private String month;
	
	private String year;
	
	@Column(name="offense_desc")
	private String offense_desc;
	
	@Column(name="statute_code")
	private String statute_code;
	
	@Column(name="statute_desc")
	private String statute_desc;
	
	@Column(name="counts")
	private int counts;
	
	@Column(name="reporting_officer")
	private String reporting_officer;
	
	
	public CaseLog() {
		
	}


	public CaseLog(String casenumber, String location, String reported_date, String month,
			String year, String offense_desc, String statute_code, String statute_desc, Integer counts,
			String reporting_officer) {
		this.casenumber = casenumber;
		this.location = location;
		this.reported_date = reported_date;
		this.offense_desc = offense_desc;
		this.statute_code = statute_code;
		this.statute_desc = statute_desc;
		this.counts = counts;
		this.reporting_officer = reporting_officer;
	}


	public Integer getCaseNumberID() {
		return casenumber_id;
	}


	public void setCaseID(Integer caseNumberID) {
		this.casenumber_id = caseNumberID;
	}


	public String getCaseNumber() {
		return casenumber;
	}


	public void setCaseNumber(String caseNumber) {
		this.casenumber = caseNumber;
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


	public void setReportedDate(String reportedDate) {
		this.reported_date = reportedDate;
	}
	
	public String getMonth() {
		return month;
	}
	
	public void setMonth(String month) {
		this.month = month;
	}
	
	public String getYear() {
		return year;
	}
	
	public void setYear(String year) {
		this.year = year;
	}

	public String getOffenseDesc() {
		return offense_desc;
	}


	public void setOffenseDesc(String offenseDesc) {
		this.offense_desc = offenseDesc;
	}


	public String getStatuteCode() {
		return statute_code;
	}


	public void setStatuteCode(String statuteCode) {
		this.statute_code = statuteCode;
	}


	public String getStatuteDesc() {
		return statute_desc;
	}


	public void setStatuteDesc(String statuteDesc) {
		this.statute_desc = statuteDesc;
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


	public void setReportingOfficer(String reportingOfficer) {
		this.reporting_officer = reportingOfficer;
	}

}
