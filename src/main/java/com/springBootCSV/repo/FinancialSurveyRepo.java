package com.springBootCSV.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.springBootCSV.Entity.FinancialSurvey;
import java.util.List;





public interface FinancialSurveyRepo extends JpaRepository<FinancialSurvey, Integer>{


//	Page<FinancialSurvey> findByVName(String vName, PageRequest pageable);
	
//	@Query(value= "select * from financial_survey where variable_name like %:vName% ", nativeQuery = true)
//	Page<FinancialSurvey> findByVName(String vName, PageRequest pageable);
	
	Page<FinancialSurvey> findByvNameContaining(String vName, PageRequest pageable);
        
}