package com.varun.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.varun.entity.DoctorsData;
import com.varun.entity.PatientData;

public interface IPatientRepository  extends JpaRepository<PatientData,String> {

}
