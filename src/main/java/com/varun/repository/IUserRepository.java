package com.varun.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.varun.entity.DoctorsData;
import com.varun.entity.Registraion;

public interface IUserRepository  extends JpaRepository<Registraion,String> {

}
