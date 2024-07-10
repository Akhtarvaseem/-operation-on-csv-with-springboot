package com.springBootCSV.service;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

import com.springBootCSV.Entity.FinancialSurvey;

public interface FinancialSurveyService {

	public boolean hasCsvFormat(MultipartFile file);
	public List<FinancialSurvey> csvToDb(InputStream stream);
	public List<FinancialSurvey> getAllRecords();
	public Map<String, Object>  getRecordsUsingPage(int pageNum , int pageSize, String vName);

}
