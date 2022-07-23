package com.varun.repository;

import java.sql.Date;
import java.util.List;

import com.varun.entity.AppointmentsData;
import com.varun.entity.Leave;

public interface IReporterDAO {

	List<Leave> getDoctorDetails(Date apptDate);

}
