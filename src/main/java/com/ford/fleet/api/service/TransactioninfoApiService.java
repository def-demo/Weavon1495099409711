package com.ford.fleet.api.service;

import com.ford.fleet.models.Transactioninfo;


import com.ford.fleet.exception.NotFoundException;
import java.util.List;

public interface TransactioninfoApiService {
  
      List<Transactioninfo> findAllTransactioninfo()
      throws NotFoundException;
  
      Transactioninfo updateTransactioninfo(Transactioninfo transactioninfo)
      throws NotFoundException;
  
      Transactioninfo addTransactioninfo(Transactioninfo transactioninfo)
      throws NotFoundException;
  
      Transactioninfo findByIdTransactioninfo(Integer id)
      throws NotFoundException;
  
      void deleteTransactioninfo(Integer id)
      throws NotFoundException;
  
}

