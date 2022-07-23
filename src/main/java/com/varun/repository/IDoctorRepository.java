package com.varun.repository;

import java.sql.Date;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.varun.entity.AppointmentsData;
import com.varun.entity.DoctorsData;


public interface IDoctorRepository extends JpaRepository<DoctorsData,String> {

	

}
