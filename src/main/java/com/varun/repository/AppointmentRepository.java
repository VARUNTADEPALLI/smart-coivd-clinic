package com.varun.repository;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.varun.entity.AppointmentsData;
import com.varun.entity.DoctorsData;

public interface AppointmentRepository extends JpaRepository<AppointmentsData,String> {

	List<AppointmentsData> findById(Date id);

	List<AppointmentsData> findByDateofappointment(Date apptDate);






}
