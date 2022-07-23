package com.varun.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="patientdata")
public class PatientData {
	@Id
	@Column(name="id")
	String id;
	
	
	@Column(name="name")
	String name;
	
	@Column(name="age")
	int age;
	
	@Column(name="email")
	String email;
	
	@Column(name="mobile")
	String mobile;
	
	@Column(name="illness")
	String illness;
	
	@Column(name="illnessduration")
	String illnessduration;
	
	@Column(name="medicalhistory")
	String medicalhistory;
	
	@Column(name="medicinesinuse")
	String medicinesinuse;
	
	public String getId() {
		return id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getIllness() {
		return illness;
	}

	public void setIllness(String illness) {
		this.illness = illness;
	}

	public String getIllnessduration() {
		return illnessduration;
	}

	public void setIllnessduration(String illnessduration) {
		this.illnessduration = illnessduration;
	}

	public String getMedicalhistory() {
		return medicalhistory;
	}

	public void setMedicalhistory(String medicalhistory) {
		this.medicalhistory = medicalhistory;
	}

	public String getMedicinesinuse() {
		return medicinesinuse;
	}

	public void setMedicinesinuse(String medicinesinuse) {
		this.medicinesinuse = medicinesinuse;
	}

	
	

}
