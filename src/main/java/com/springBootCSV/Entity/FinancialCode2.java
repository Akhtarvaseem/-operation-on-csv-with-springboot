package com.springBootCSV.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Financial_code2")
public class FinancialCode2 {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int t2_id;
	
	private int year;
	@Column(name = "Industry_aggregation_NZSIOC")
	private String  i_aggregation;
	
	@Column(name = "Industry_code_NZSIOC")
	private String i_code;
	@Column(name = "Industry_name_NZSIOC")
	private String i_name;
	
	
	private String unit;
	
	@Column(name = "Variable_name")
	private String v_name;
	@Column(name = "Variable_category")
	private String v_category;
	
	private String value;
	
	@Column(name = "Industry_code_ANZSIC06")
	private String ind_code;
	
	//Many to one 
	
	
	 @ManyToOne
   @JoinColumn(name = "t1_id", referencedColumnName = "t1_id")
//	@JoinColumn(name = "t1_id")
    private FinancialCode1 fc1;

	public FinancialCode2() {
		
	}

	public FinancialCode2(int t2_id, int year, String i_aggregation, String i_code, String i_name, String unit,
			String v_name, String v_category, String value, String ind_code, FinancialCode1 fc1) {
		super();
		this.t2_id = t2_id;
		this.year = year;
		this.i_aggregation = i_aggregation;
		this.i_code = i_code;
		this.i_name = i_name;
		this.unit = unit;
		this.v_name = v_name;
		this.v_category = v_category;
		this.value = value;
		this.ind_code = ind_code;
		this.fc1 = fc1;
	}

	public int getT2_id() {
		return t2_id;
	}

	public void setT2_id(int t2_id) {
		this.t2_id = t2_id;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getI_aggregation() {
		return i_aggregation;
	}

	public void setI_aggregation(String i_aggregation) {
		this.i_aggregation = i_aggregation;
	}

	public String getI_code() {
		return i_code;
	}

	public void setI_code(String i_code) {
		this.i_code = i_code;
	}

	public String getI_name() {
		return i_name;
	}

	public void setI_name(String i_name) {
		this.i_name = i_name;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getV_name() {
		return v_name;
	}

	public void setV_name(String v_name) {
		this.v_name = v_name;
	}

	public String getV_category() {
		return v_category;
	}

	public void setV_category(String v_category) {
		this.v_category = v_category;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getInd_code() {
		return ind_code;
	}

	public void setInd_code(String ind_code) {
		this.ind_code = ind_code;
	}

	public FinancialCode1 getFc2() {
		return fc1;
	}

	public void setFc2(FinancialCode1 fc2) {
		this.fc1 = fc2;
	}

	@Override
	public String toString() {
		return "Financial_code2 [t2_id=" + t2_id + ", year=" + year + ", i_aggregation=" + i_aggregation + ", i_code="
				+ i_code + ", i_name=" + i_name + ", unit=" + unit + ", v_name=" + v_name + ", v_category=" + v_category
				+ ", value=" + value + ", ind_code=" + ind_code + ", fc1=" + fc1 + "]";
	}

	
	
	
}
