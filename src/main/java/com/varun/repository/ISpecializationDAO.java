package com.varun.repository;

import java.util.List;

import com.varun.entity.DoctorsData;

public interface ISpecializationDAO {

	List<String> getgetSpecializations(String hospitals);

	List<DoctorsData> getDocs(String hospitals,String specializations);

}
