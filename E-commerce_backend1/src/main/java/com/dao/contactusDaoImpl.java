package com.dao;

import java.util.List;



import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.contactus;

@Repository
public class contactusDaoImpl implements contactusDao {
	@Autowired
	private SessionFactory sessionFactory;
	public  contactusDaoImpl(){
		System.out.println("contactDaoImpl object is created");
	}
	@Transactional
	public void saveContact(contactus contactus) {
Session session=sessionFactory.getCurrentSession();
		
		
		
		session.save(contactus);
		
		
		
	}
	
}