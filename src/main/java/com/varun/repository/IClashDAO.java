package com.varun.repository;

import java.sql.Date;

import com.varun.entity.AppointmentsData;
import com.varun.entity.Leave;

public interface IClashDAO {

	String getDocNameById(Date dateofappointment);

}
