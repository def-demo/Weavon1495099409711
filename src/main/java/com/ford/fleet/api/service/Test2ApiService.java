package com.ford.fleet.api.service;

import com.ford.fleet.models.Test2;


import com.ford.fleet.exception.NotFoundException;
import java.util.List;

public interface Test2ApiService {
  
      List<Test2> findAllTest2()
      throws NotFoundException;
  
      Test2 updateTest2(Test2 test2)
      throws NotFoundException;
  
      Test2 addTest2(Test2 test2)
      throws NotFoundException;
  
      Test2 findByIdTest2(Integer id)
      throws NotFoundException;
  
      void deleteTest2(Integer id)
      throws NotFoundException;
  
}

