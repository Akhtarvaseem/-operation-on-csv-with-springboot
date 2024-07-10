package com.springBootCSV.serviceImpls;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.springBootCSV.Entity.FinancialSurvey;
import com.springBootCSV.dao.FinancialSurveyDao;
import com.springBootCSV.service.FinancialSurveyService;

@Service
public class FinancialSurveyServiceImpl implements FinancialSurveyService {

	@Autowired
	FinancialSurveyDao dao;

// CSV validation 
	@Override
	public boolean hasCsvFormat(MultipartFile file) {
		String type = "text/csv";
		if (!type.equals(file.getContentType())) {
			return false;
		}

		return true;
	}

	// FOR GET DATA FROM CSV FILE AND FORMATING
	@Override
	public List<FinancialSurvey> csvToDb(InputStream stream) {

		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(stream, "UTF-8"));

			CSVParser parser = new CSVParser(reader,
					CSVFormat.DEFAULT.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim());

			List<FinancialSurvey> ls = new ArrayList<>();
			List<CSVRecord> csvRecords = parser.getRecords();

			for (CSVRecord rd : csvRecords) {

				if (rd.get(0) != null && rd.get(1) != null && rd.get(2) != null && rd.get(3) != null
						&& rd.get(4) != null && rd.get(5) != null && rd.get(6) != null && rd.get(7) != null
						&& rd.get(8) != null && rd.get(9) != null) {

					FinancialSurvey fs = new FinancialSurvey();

					fs.setYear(Integer.parseInt(rd.get("Year")));
					fs.setiAggregation(rd.get("Industry_aggregation_NZSIOC"));
					fs.setiCode(rd.get("Industry_code_NZSIOC"));
					fs.setiName(rd.get("Industry_name_NZSIOC"));
					fs.setUnit(rd.get("Units"));
					fs.setvCode(rd.get("Variable_code"));
					fs.setvName(rd.get("Variable_name"));
					fs.setvCategory(rd.get("Variable_category"));
					fs.setValue("Value");
					fs.setIndCode(rd.get("Industry_code_ANZSIC06"));

					ls.add(fs);

				} else {
					Arrays.asList();
				}
			}

			return dao.saveFinancialSurvey(ls);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return Arrays.asList();
	}

	@Override
	public List<FinancialSurvey> getAllRecords() {
		return dao.getAllRecords();
	}

	@Override
	public Map<String, Object> getRecordsUsingPage(int pageNum, int pageSize, String vName) {
		if (pageSize != 0) {

			String name = null;
			String direction = null;

			if (vName != null) {

				String[] split = vName.split(",");
				
//				
//				List<String> asList = Arrays.asList(split);
//				
//				
//				testSearch(asList);
//				

//				System.out.println("length " + split.length);
//				if (split.length > 1 && split[0]!=null) {
//
//					name = split[0];
//					direction = split[1];
//				} else {
//					direction = split[0];
//				}

				for (int i = 0; i < split.length; i++) {
					if (split[i] != null && ( (split[i]).equalsIgnoreCase("desc") || (split[i]).equalsIgnoreCase("asc"))) {
						direction = split[i];
//						System.out.println("data "+split[i]);
					} else {
						name = split[i];
//						System.out.println("name "+split[i]);
					}
				}

			}

			// name == vName
			return dao.getRecordsUsingPage(pageNum, pageSize, name, direction);
		}
		return Collections.<String, Object>emptyMap();
	}
	
	
	
	

}