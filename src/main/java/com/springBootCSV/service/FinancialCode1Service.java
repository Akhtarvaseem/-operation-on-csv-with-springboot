package com.springBootCSV.service;

import java.io.InputStream;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.springBootCSV.Entity.FinancialCode1;

public interface FinancialCode1Service {
	public boolean hasCsvFormat(MultipartFile file);
	public List<FinancialCode1> csvToDb(InputStream stream);
}
