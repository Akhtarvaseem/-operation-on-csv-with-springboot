package com.springBootCSV.dto;

public class FinancialSurveyDto {
	private int id;
	private int year;

	private String iAggregation;

	
	private String iCode;
	
	private String iName;

	private String unit;

	
	private String vCode;


	private String vName;
	
	private String vCategory;

	private String value;

	
	private String indCode;


	public FinancialSurveyDto() {
		super();
		
	}


	public FinancialSurveyDto(int id, int year, String iAggregation, String iCode, String iName, String unit, String vCode,
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
