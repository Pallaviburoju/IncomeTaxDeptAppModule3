package com.emp.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.emp.model.TDSMaster;

@Component("tdsDao")
@Repository
@ComponentScan("com.emp")
public class TDSDaoImpl implements TDSDao{

	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	public TDSMaster getById(int id) {
		
		TDSMaster tdsMaster=entityManager.find(TDSMaster.class,id);
		
		return tdsMaster;
	}
	

}
