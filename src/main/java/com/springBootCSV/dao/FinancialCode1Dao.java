package com.springBootCSV.dao;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springBootCSV.Entity.FinancialCode1;
import com.springBootCSV.Entity.FinancialCode2;
import com.springBootCSV.repo.FinancialCode2Repo;
import com.springBootCSV.repo.FinanicialCode1Repo;



@Repository
public class FinancialCode1Dao{
	
	@Autowired 
	FinanicialCode1Repo repo1;
	
	@Autowired
	FinancialCode2Repo repo2;
	
	

	
//	FIRST SAVE DATA IN OUR DATABASE AND RETURN LIST OF OBEJECT SAVE ONT TO MANEY
	
	  public List<FinancialCode1> saveFinancialCode1(List<FinancialCode1> st1) {
		  
	                 return repo1.saveAll(st1);
	   
	  }
	
	  // SAVE DATA MANEY TO ONE AS A LIST 
	  public List<FinancialCode2> saveFinancialCode2( List<FinancialCode2> fs2) {
		
	      return repo2.saveAll(fs2);
		  
	  }
}
