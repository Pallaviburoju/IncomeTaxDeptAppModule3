package com.emp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.emp.model.TDSMaster;
import com.emp.service.TDSService;
import com.emp.userException.NoUserFoundException;

@RestController
public class TDSController {

	@Autowired
	TDSService tdsService;

	@GetMapping("/getById/{id}")
	public TDSMaster getByPid(@PathVariable int id) {
		TDSMaster tdsMaster=tdsService.getById(id);
		if(tdsMaster==null) {
			throw new NoUserFoundException("ID not found wrong ID : "+id);
		}
		else
			return tdsMaster;
	}
}
