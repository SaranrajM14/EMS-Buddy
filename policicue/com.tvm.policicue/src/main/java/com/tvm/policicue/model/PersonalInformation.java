package com.tvm.policicue.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class PersonalInformation {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private long id;
	private String title;
	private String firstName;
	private String lastName;
	private String email;
	private long phoneNumber;
	private Date dob;
	private String gender;
	private String martialStatus;
	private String nomaineeName;
	private String relation;
	private int age;
	private String panNumber;
	private long aadharNumber;
	private String city;
	private long pinCode;
	private String registeredAddress;
	private String communicationAddress;
	private boolean query1;
	private boolean query2;
	private boolean query3;
	private boolean query4;
	private boolean query5;
	private boolean query6;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMartialStatus() {
		return martialStatus;
	}
	public void setMartialStatus(String martialStatus) {
		this.martialStatus = martialStatus;
	}
	public String getNomaineeName() {
		return nomaineeName;
	}
	public void setNomaineeName(String nomaineeName) {
		this.nomaineeName = nomaineeName;
	}
	public String getRelation() {
		return relation;
	}
	public void setRelation(String relation) {
		this.relation = relation;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	public long getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(long aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getPinCode() {
		return pinCode;
	}
	public void setPinCode(long pinCode) {
		this.pinCode = pinCode;
	}
	public String getRegisteredAddress() {
		return registeredAddress;
	}
	public void setRegisteredAddress(String registeredAddress) {
		this.registeredAddress = registeredAddress;
	}
	public String getCommunicationAddress() {
		return communicationAddress;
	}
	public void setCommunicationAddress(String communicationAddress) {
		this.communicationAddress = communicationAddress;
	}
	public boolean isQuery1() {
		return query1;
	}
	public void setQuery1(boolean query1) {
		this.query1 = query1;
	}
	public boolean isQuery2() {
		return query2;
	}
	public void setQuery2(boolean query2) {
		this.query2 = query2;
	}
	public boolean isQuery3() {
		return query3;
	}
	public void setQuery3(boolean query3) {
		this.query3 = query3;
	}
	public boolean isQuery4() {
		return query4;
	}
	public void setQuery4(boolean query4) {
		this.query4 = query4;
	}
	public boolean isQuery5() {
		return query5;
	}
	public void setQuery5(boolean query5) {
		this.query5 = query5;
	}
	public boolean isQuery() {
		return query6;
	}
	public void setQuery(boolean query6) {
		this.query6 = query6;
	}

}



