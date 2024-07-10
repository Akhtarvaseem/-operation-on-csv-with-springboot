package com.springBootCSV.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="financial_survey")
public class FinancialSurvey {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private int year;
	@Column(name = "Industry_aggregation_NZSIOC")
	private String  iAggregation;
	
	@Column(name = "Industry_code_NZSIOC")
	private String iCode;
	@Column(name = "Industry_name_NZSIOC")
	private String iName;
	
	private String unit;
	
	@Column(name = "Variable_code")
	private String vCode;
	
	@Column(name = "Variable_name")
	private String vName;
	@Column(name = "Variable_category")
	private String vCategory;
	
	private String value;
	
	@Column(name = "Industry_code_ANZSIC06")
	private String indCode;

	public FinancialSurvey() {
	
	}

	
	public FinancialSurvey(int id, int year, String iAggregation, String iCode, String iName, String unit, String vCode,
			String vName, String vCategory, String value, String indCode) {
		super();
		this.id = id;
		this.year = year;
		this.iAggregation = iAggregation;
		this.iCode = iCode;
		this.iName = iName;
		this.unit = unit;
		this.vCode = vCode;
		this.vName = vName;
		this.vCategory = vCategory;
		this.value = value;
		this.indCode = indCode;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}


	public String getiAggregation() {
		return iAggregation;
	}


	public void setiAggregation(String iAggregation) {
		this.iAggregation = iAggregation;
	}


	public String getiCode() {
		return iCode;
	}


	public void setiCode(String iCode) {
		this.iCode = iCode;
	}


	public String getiName() {
		return iName;
	}


	public void setiName(String iName) {
		this.iName = iName;
	}


	public String getUnit() {
		return unit;
	}


	public void setUnit(String unit) {
		this.unit = unit;
	}


	public String getvCode() {
		return vCode;
	}


	public void setvCode(String vCode) {
		this.vCode = vCode;
	}


	public String getvName() {
		return vName;
	}


	public void setvName(String vName) {
		this.vName = vName;
	}


	public String getvCategory() {
		return vCategory;
	}


	public void setvCategory(String vCategory) {
		this.vCategory = vCategory;
	}


	public String getValue() {
		return value;
	}


	public void setValue(String value) {
		this.value = value;
	}


	public String getIndCode() {
		return indCode;
	}


	public void setIndCode(String indCode) {
		this.indCode = indCode;
	}


	@Override
	public String toString() {
		return "FinancialSurvey [id=" + id + ", year=" + year + ", iAggregation=" + iAggregation + ", iCode=" + iCode
				+ ", iName=" + iName + ", unit=" + unit + ", vCode=" + vCode + ", vName=" + vName + ", vCategory="
				+ vCategory + ", value=" + value + ", indCode=" + indCode + "]";
	}


	
	
	
	
	
	

}
