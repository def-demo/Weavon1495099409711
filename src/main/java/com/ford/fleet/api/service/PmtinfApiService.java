package com.ford.fleet.api.service;

import com.ford.fleet.models.Pmtinf;


import com.ford.fleet.exception.NotFoundException;
import java.util.List;

public interface PmtinfApiService {
  
      List<Pmtinf> findAllPmtinf()
      throws NotFoundException;
  
      Pmtinf updatePmtinf(Pmtinf pmtinf)
      throws NotFoundException;
  
      Pmtinf addPmtinf(Pmtinf pmtinf)
      throws NotFoundException;
  
      Pmtinf findByIdPmtinf(Integer id)
      throws NotFoundException;
  
      void deletePmtinf(Integer id)
      throws NotFoundException;
  
}

