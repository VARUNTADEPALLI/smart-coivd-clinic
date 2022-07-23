package com.varun.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.varun.entity.DoctorsData;
import com.varun.entity.Leave;

public interface ILeaveRepository  extends JpaRepository<Leave,String>{

}
