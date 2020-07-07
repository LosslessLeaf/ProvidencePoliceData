package com.providencepolicedata.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;

@Entity
@Table(name="tblArrestLog")
public class ArrestLog {
	@Id
	@Column(name="arrest_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int arrest_id;
	
	@Column(name="casenumber")
	private String case_number;
	
	@Column(name="arrest_date")
	private String arrest_date;
	
	private int year;
	
	private int month;
	
	@Column(name="first_name")
	private String first_name;
	
	@Column(name="last_name")
	private String last_name;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="race")
	private String race;
	
	@Column(name="ethnicity")
	private String ethnicity;
	
	@Column(name="year_of_birth")
	private int year_of_birth;
	
	@Column(name="age")
	private int age;
	
	@Column(name="from_address")
	private String from_address;
	
	@Column(name="from_city")
	private String from_city;
	
	@Column(name="from_state")
	private String from_state;
	
	@Column(name="statute_type")
	private String statute_type;
	
	@Column(name="statute_code")
	private String statute_code;
	
	@Column(name="statute_desc")
	private String statute_desc;
	
	@Column(name="counts")
	private int counts;
	
	@Column(name="arresting_officers")
	private String arresting_officers;
	
	public ArrestLog() {
		
	}


	public ArrestLog(String arrest_date, int year, int month, String last_name,
			String first_name, String gender, String race, String ethnicity, int year_of_birth,
			int age, String from_address, String from_city, String from_state, String statute_type, 
			String statute_code, String statute_desc, int counts, String case_number, String arresting_officers) {
		this.case_number = case_number;
		this.arrest_date = arrest_date;
		this.year= year;
		this.month = month;
		this.first_name = first_name;
		this.gender = gender;
		this.race = race;
		this.ethnicity = ethnicity;
		this.year_of_birth = year_of_birth;
		this.age = age;
		this.from_address = from_address;
		this.from_city = from_city;
		this.from_state = from_state;
		this.statute_type = statute_type;
		this.statute_code = statute_code;
		this.statute_desc = statute_desc;
		this.counts = counts;
		this.arresting_officers = arresting_officers;
	}


	public int getArrestID() {
		return arrest_id;
	}


	public void setCaseNumber(String caseNumber) {
		this.case_number = caseNumber;
	}


	public String getCaseNumber() {
		return case_number;
	}


	public void setArrestDate(String arrestDate) {
		this.arrest_date = arrestDate;
	}


	public String getArrestDate() {
		return arrest_date;
	}


	public void setFirstName(String firstName) {
		this.first_name = firstName;
	}


	public String getFirstName() {
		return first_name;
	}


	public void setLastName(String lastName) {
		this.last_name = lastName;
	}
	
	public String getLastName() {
		return last_name;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setEthnicity(String ethnicity) {
		this.ethnicity = ethnicity;
	}
	
	public String getEthnicity() {
		return ethnicity;
	}
	
	public void setYearOfBirth(int yearOfBirth) {
		this.year_of_birth = yearOfBirth;
	}
	
	public int getYearOfBirth() {
		return year_of_birth;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setFromAddress(String fromAddress) {
		this.from_address = fromAddress;
	}
	
	public String getFromAddress() {
		return from_address;
	}
	
	public void setFromCity(String fromCity) {
		this.from_city = fromCity;
	}
	
	public String getFromCity() {
		return from_city;
	}
	
	public void setFromState(String fromState) {
		this.from_state = fromState;
	}
	
	public String getFromState() {
		return from_state;
	}
	
	public void setStatuteType(String statuteType) {
		this.statute_type = statuteType;
	}
	
	public String getStatuteType() {
		return statute_type;
	}
	
	public void setStatuteCode(String statuteCode) {
		this.statute_code = statuteCode;
	}
	
	public String getStatuteCode() {
		return statute_code;
	}
	
	public void setStatuteDesc(String statuteDesc) {
		this.statute_desc = statuteDesc;
	}
	
	public String getStatuteDesc() {
		return statute_desc;
	}
	
	public void setCounts(int counts) {
		this.counts = counts;
	}
	
	public int getCounts() {
		return counts;
	}
	
	public void setArrestingOfficers(String arrestingOfficers) {
		this.arresting_officers = arrestingOfficers;
	}
	
	public String getArrestingOfficers() {
		return arresting_officers;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public int getMonth() {
		return month;
	}
}
