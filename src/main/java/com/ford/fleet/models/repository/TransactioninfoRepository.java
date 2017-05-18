package com.ford.fleet.models.repository;

import com.ford.fleet.models.*;

import com.ford.fleet.models.Pmtinf;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface TransactioninfoRepository extends JpaRepository<Transactioninfo, Integer>{

}



