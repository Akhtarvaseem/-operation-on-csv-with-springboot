package com.springBootCSV.dao;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Repository;

import com.springBootCSV.Entity.FinancialSurvey;
import com.springBootCSV.repo.FinancialSurveyRepo;

@Repository
public class FinancialSurveyDao {

	@Autowired
	FinancialSurveyRepo repo;

	public List<FinancialSurvey> saveFinancialSurvey(List<FinancialSurvey> ls) {

		if (!ls.isEmpty()) {

			repo.saveAll(ls);
		}
		return Arrays.asList();

	}

	// getting all records
	public List<FinancialSurvey> getAllRecords() {
		List<FinancialSurvey> all = repo.findAll();
		if (!all.isEmpty()) {
			return all;
		}
		return Arrays.asList();

	}

	// getting records using pagination
	public Map<String, Object> getRecordsUsingPage(int pageNum, int pageSize, String vName, String direction) {

// Here we are getting "vName" for sorting with Desc or Asc 

		PageRequest pageable;
		Page<FinancialSurvey> page;

		if (direction != null && direction.equalsIgnoreCase("desc")) {

			pageable = PageRequest.of(pageNum, pageSize, Sort.by(Direction.DESC, "id"));

		} else {
			pageable = PageRequest.of(pageNum, pageSize);
		}

// Here we are getting all data with particular search 

		if (vName == null) {
			page = repo.findAll(pageable);
		} else {

//		   page =repo.findByVName(vName, pageable);   // when we use query on method 
			page = repo.findByvNameContaining(vName, pageable);

		}

		List<FinancialSurvey> content = page.getContent();
		Map<String, Object> reponsePage = new HashMap<>();

		if (!content.isEmpty()) {

			reponsePage.put("Page Content", content);
			reponsePage.put("currentPage", page.getNumber());
			reponsePage.put("totalItems", page.getTotalElements());
			reponsePage.put("totalPages", page.getTotalPages());
			return reponsePage;
		} else {

			return Collections.<String, Object>emptyMap();
		}

	}

}
