package com.ford.fleet.api.service.impl;

import com.ford.fleet.api.service.*;
import com.ford.fleet.models.*;
import org.springframework.stereotype.Service;
import com.ford.fleet.models.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.ford.fleet.models.Transactioninfo;


import java.util.List;
import com.ford.fleet.exception.NotFoundException;


@Service
@Transactional
public class TransactioninfoApiServiceImpl implements TransactioninfoApiService {
		  	  
	  @Autowired
	
  	  private TransactioninfoRepository  transactioninfoRepository ;
	   
  
  
				
			
      @Override
      public List<Transactioninfo> findAllTransactioninfo()
      throws NotFoundException {
      
        
  		
  		
  			return transactioninfoRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Transactioninfo updateTransactioninfo(Transactioninfo transactioninfo)
      throws NotFoundException {
      
         
        	return transactioninfoRepository.save(transactioninfo);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Transactioninfo addTransactioninfo(Transactioninfo transactioninfo)
      throws NotFoundException {
      
         
        	return transactioninfoRepository.save(transactioninfo);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Transactioninfo findByIdTransactioninfo(Integer id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return transactioninfoRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deleteTransactioninfo(Integer id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}

