
package com.varun.entity; 

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="doctorsdata")
//@Table(name="doctorsdata")
public class DoctorsData
{
	@Id
	@Column(name="id")
	String id;
	
	
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