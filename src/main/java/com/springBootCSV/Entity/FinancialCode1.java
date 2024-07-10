package com.springBootCSV.Entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="financial_code1")
public class FinancialCode1 {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int t1_id;
	
	@Column(name = "Variable_code", unique = true)
	private String v_code;
	
   @OneToMany(mappedBy = "fc1",  cascade = CascadeType.ALL) 
//   @OneToMany(cascade = CascadeType.ALL) 
	private List<FinancialCode2 >  ls;

	public FinancialCode1() {
	
	}

	public FinancialCode1(int t1_id, String v_code, List<FinancialCode2> ls) {
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
