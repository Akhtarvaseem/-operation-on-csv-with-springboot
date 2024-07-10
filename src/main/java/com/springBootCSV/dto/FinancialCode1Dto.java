package com.springBootCSV.dto;

import java.util.List;

import com.springBootCSV.Entity.FinancialCode2;



public class FinancialCode1Dto {

    private int t1_id;


	private String v_code;
	
 
	private List<FinancialCode2 >  ls;
	
	

	public FinancialCode1Dto() {
	
	}

	public FinancialCode1Dto(int t1_id, String v_code, List<FinancialCode2> ls) {
		super();
		this.t1_id = t1_id;
		this.v_code = v_code;
		this.ls = ls;
	}

	public int getT1_id() {
		return t1_id;
	}

	public void setT1_id(int t1_id) {
		this.t1_id = t1_id;
	}

	public String getV_code() {
		return v_code;
	}

	public void setV_code(String v_code) {
		this.v_code = v_code;
	}

	public List<FinancialCode2> getLs() {
		return ls;
	}

	public void setLs(List<FinancialCode2> ls) {
		this.ls = ls;
	}

	@Override
	public String toString() {
		return "Financial_code1 [t1_id=" + t1_id + ", v_code=" + v_code + ", ls=" + ls + "]";
	}

}
