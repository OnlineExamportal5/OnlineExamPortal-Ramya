package com.exam.OEPService;
  
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.OEPModel.TestPage;
import com.exam.OEPRepo.TestRepo;
  
  @Service
  
  @Transactional public class TestService {
  
  @Autowired
  TestRepo repo;
  
  public TestPage addTest(TestPage t) 
  {
	  TestPage test=repo.save(t);
	  return test;
  }
  
}
 