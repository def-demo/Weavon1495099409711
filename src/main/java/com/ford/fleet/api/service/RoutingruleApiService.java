package com.ford.fleet.api.service;

import com.ford.fleet.models.Routingrule;


import com.ford.fleet.exception.NotFoundException;
import java.util.List;

public interface RoutingruleApiService {
  
      List<Routingrule> findAllRoutingrule()
      throws NotFoundException;
  
      Routingrule updateRoutingrule(Routingrule routingrule)
      throws NotFoundException;
  
      Routingrule addRoutingrule(Routingrule routingrule)
      throws NotFoundException;
  
      Routingrule findByIdRoutingrule(Integer id)
      throws NotFoundException;
  
      void deleteRoutingrule(Integer id)
      throws NotFoundException;
  
}

