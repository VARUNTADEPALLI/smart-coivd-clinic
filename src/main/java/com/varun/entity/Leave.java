package com.varun.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="leavemanagement")

public class Leave {
	@Id
	@Column(name="id")
	String id;
	
	@Column(name="name")
	String name;
	
	@Column(name="hospital")
	String hospital;
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getHospital() {
		return hospital;
	}


	public void setHospital(String hospital) {
		this.hospital = hospital;
	}


	@Column(name="dateofleave")
	Date dateofleave;

	@Column(name="lastleavedate")
	Date lastleavedate;

	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public Date getLastleavedate() {
		return lastleavedate;
	}


	public void setLastleavedate(Date lastleavedate) {
		this.lastleavedate = lastleavedate;
	}


	public Date getDateofleave() {
		return dateofleave;
	}


	public void setDateofleave(Date dateofleave) {
		this.dateofleave = dateofleave;
	}
	
	
	
	

}
