package com.springBootCSV.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.springBootCSV.Entity.FinancialSurvey;
import com.springBootCSV.customException.InfoMissingException;
import com.springBootCSV.serviceImpls.FinancialSurveyServiceImpl;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/Financial-survey")
public class FinancialSurveyController {

	@Autowired
	FinancialSurveyServiceImpl service;

	// GET CSV FILE FROM
	@PostMapping(value = "/save/csv", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public ResponseEntity<?> saveFinancialSurvey(@RequestParam("file") MultipartFile file) {
		System.out.println(file.getContentType());

		if (service.hasCsvFormat(file)) {

			try {
				service.csvToDb(file.getInputStream());
			} catch (IOException e) {

				throw new InfoMissingException("something went wrong ! please check properly.");
			}

			return ResponseEntity.status(HttpStatus.OK).body(" csv file has been uploaded successfull");
		}

		throw new InfoMissingException("Sorry! please upload only csv file.");

	}

	@GetMapping("/get")
	public List<FinancialSurvey> getAllRecords() {
		return service.getAllRecords();

	}

	@GetMapping("/getPage")
	@Tag(description = "Here we can get data using pagination", name = "get Data using page ")
	public ResponseEntity<Map<String, Object>> getRecordsUsingPage(@RequestParam(defaultValue = "0") int pageNum,
			                                         @RequestParam(defaultValue = "5") int pageSize,
			                                         @RequestParam(required = false) String vName	                                       
			                                         ) 
	{

		try {
			
			Map<String, Object> recordsUsingPage = service.getRecordsUsingPage(pageNum, pageSize ,vName);
			return ResponseEntity.status(HttpStatus.OK).body(recordsUsingPage);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		}
		
	
		

	}
	


}
