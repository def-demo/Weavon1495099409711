package com.ford.fleet.api.service;

import com.ford.fleet.models.Bankbranchmaster;


import com.ford.fleet.exception.NotFoundException;
import java.util.List;

public interface BankbranchmasterApiService {
  
      List<Bankbranchmaster> findAllBankbranchmaster()
      throws NotFoundException;
  
      Bankbranchmaster updateBankbranchmaster(Bankbranchmaster bankbranchmaster)
      throws NotFoundException;
  
      Bankbranchmaster addBankbranchmaster(Bankbranchmaster bankbranchmaster)
      throws NotFoundException;
  
      Bankbranchmaster findByIdBankbranchmaster(Integer id)
      throws NotFoundException;
  
      void deleteBankbranchmaster(Integer id)
      throws NotFoundException;
  
}

