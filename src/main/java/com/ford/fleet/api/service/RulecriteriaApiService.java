package com.ford.fleet.api.service;

import com.ford.fleet.models.Rulecriteria;


import com.ford.fleet.exception.NotFoundException;
import java.util.List;

public interface RulecriteriaApiService {
  
      List<Rulecriteria> findAllRulecriteria()
      throws NotFoundException;
  
      Rulecriteria updateRulecriteria(Rulecriteria rulecriteria)
      throws NotFoundException;
  
      Rulecriteria addRulecriteria(Rulecriteria rulecriteria)
      throws NotFoundException;
  
      Rulecriteria findByIdRulecriteria(Integer id)
      throws NotFoundException;
  
      void deleteRulecriteria(Integer id)
      throws NotFoundException;
  
}

