package com.varun.repository;

import java.sql.Date;
import java.util.List;

import com.varun.entity.AppointmentsData;

public interface IAppointmentDao {

	List<AppointmentsData> getAppointments(String name, Date apptDatename);

}
