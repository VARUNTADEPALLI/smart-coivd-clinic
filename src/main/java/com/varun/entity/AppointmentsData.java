package com.varun.entity; 

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="patientappointmentdata")
public class AppointmentsData {
	@Id
	@Column(name="id")
	String id;
	
	@Column(name="doctorid")
	String doctorid;
	
	public String getDoctorid() {
		return doctorid;
	}

	public void setDoctorid(String doctorid) {
		this.doctorid = doctorid;
	}

	@Column(name="name")
	String name;
	
	@Column(name="age")
	int age;
	
	@Column(name="education")
	String education;
	
	@Column(name="hospital")
	String hospital;
	
	@Column(name="specialization")
	String specialization;
	
	@Column(name="patientname")
	String patientname;
	
	@Column(name="dateofappointment")
	Date dateofappointment;
	
	
	public String getPatientname() {
		return patientname;
	}

	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}

	public Date getDateofappointment() {
		return dateofappointment;
	}

	public void setDateofappointment(Date dateofappointment) {
		this.dateofappointment = dateofappointment;
	}

	
	
	public String getId() {
		return id;
	}

	public String getHospital() {
		return hospital;
	}

	public void setHospital(String hospital) {
		this.hospital = hospital;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}


	
	
	

}

