package com.ford.fleet.api.service;

import com.ford.fleet.models.Transactiondetails;


import com.ford.fleet.exception.NotFoundException;
import java.util.List;

public interface TransactiondetailsApiService {
  
      List<Transactiondetails> findAllTransactiondetails()
      throws NotFoundException;
  
      Transactiondetails updateTransactiondetails(Transactiondetails transactiondetails)
      throws NotFoundException;
  
      Transactiondetails addTransactiondetails(Transactiondetails transactiondetails)
      throws NotFoundException;
  
      Transactiondetails findByIdTransactiondetails(String id)
      throws NotFoundException;
  
      void deleteTransactiondetails(String id)
      throws NotFoundException;
  
}

