package com.varun.repository;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.varun.entity.AppointmentsData;
import com.varun.entity.Leave;


@Repository
public class IClashDAOImpl implements IClashDAO{
	

	@Autowired
	private EntityManager entityManager;
	
	private Session getHibernateSession()
	{
		return entityManager.unwrap(Session.class);
	}


	@Override
	public String getDocNameById(Date dateofappointment) {
	
		AppointmentsData details = null;
		String docname="";
		try
		{
			
			Session session = getHibernateSession();
//			String query1 = "select l.id from leavemanagement l,patientappointmentdata a where l.id=a.doctorid";
//			Query<String> query2 = session.createQuery(query1);
//			 String details1 =  query2.uniqueResult();
			String query3 = "Select a from patientappointmentdata a,leavemanagement l where a.doctorid = l.id and '"+ dateofappointment +"' between l.dateofleave and l.lastleavedate";
			Query<AppointmentsData> query4 = session.createQuery(query3);		
			 details =  query4.uniqueResult();
			 docname = details.getName();
			
		

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return docname;

	}

}
