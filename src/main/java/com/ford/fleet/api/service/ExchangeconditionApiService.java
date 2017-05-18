package com.ford.fleet.api.service;

import com.ford.fleet.models.Exchangecondition;


import com.ford.fleet.exception.NotFoundException;
import java.util.List;

public interface ExchangeconditionApiService {
  
      List<Exchangecondition> findAllExchangecondition()
      throws NotFoundException;
  
      Exchangecondition updateExchangecondition(Exchangecondition exchangecondition)
      throws NotFoundException;
  
      Exchangecondition addExchangecondition(Exchangecondition exchangecondition)
      throws NotFoundException;
  
      Exchangecondition findByIdExchangecondition(Integer id)
      throws NotFoundException;
  
      void deleteExchangecondition(Integer id)
      throws NotFoundException;
  
}

