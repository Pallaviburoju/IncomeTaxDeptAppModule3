package com.emp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tds_master")
public class TDSMaster {
	
	@Id
	private int id;
	private String deductorName;
	private String deductorPan;
	private int tdsDeposited;
	
	
	public TDSMaster(int id, String deductorName, String deductorPan, int tdsDeposited) {
		super();
		this.id = id;
		this.deductorName = deductorName;
		this.deductorPan = deductorPan;
		this.tdsDeposited = tdsDeposited;
	}
	
	public TDSMaster() {
		
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDeductorName() {
		return deductorName;
	}
	public void setDeductorName(String deductorName) {
		this.deductorName = deductorName;
	}
	public String getDeductorPan() {
		return deductorPan;
	}
	public void setDeductorPan(String deductorPan) {
		this.deductorPan = deductorPan;
	}
	public int getTdsDeposited() {
		return tdsDeposited;
	}
	public void setTdsDeposited(int tdsDeposited) {
		this.tdsDeposited = tdsDeposited;
	}
	
}
