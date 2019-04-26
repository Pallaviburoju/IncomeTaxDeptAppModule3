package com.emp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.emp.dao.TDSDao;
import com.emp.model.TDSMaster;

@Component
@Service("tdsService")
@Transactional
public class TDSServiceImpl implements TDSService{

	@Autowired
	TDSDao tdsDao;
	
	@Override
	public TDSMaster getById(int id) {
		// TODO Auto-generated method stub
		return tdsDao.getById(id);
	}

}
