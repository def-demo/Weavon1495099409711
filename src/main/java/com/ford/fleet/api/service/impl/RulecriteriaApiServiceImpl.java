package com.ford.fleet.api.service.impl;

import com.ford.fleet.api.service.*;
import com.ford.fleet.models.*;
import org.springframework.stereotype.Service;
import com.ford.fleet.models.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.ford.fleet.models.Rulecriteria;


import java.util.List;
import com.ford.fleet.exception.NotFoundException;


@Service
@Transactional
public class RulecriteriaApiServiceImpl implements RulecriteriaApiService {
		  	  
	  @Autowired
	
  	  private RulecriteriaRepository  rulecriteriaRepository ;
	   
  
  
				
			
      @Override
      public List<Rulecriteria> findAllRulecriteria()
      throws NotFoundException {
      
        
  		
  		
  			return rulecriteriaRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Rulecriteria updateRulecriteria(Rulecriteria rulecriteria)
      throws NotFoundException {
      
         
        	return rulecriteriaRepository.save(rulecriteria);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Rulecriteria addRulecriteria(Rulecriteria rulecriteria)
      throws NotFoundException {
      
         
        	return rulecriteriaRepository.save(rulecriteria);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Rulecriteria findByIdRulecriteria(Integer id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return rulecriteriaRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deleteRulecriteria(Integer id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}

