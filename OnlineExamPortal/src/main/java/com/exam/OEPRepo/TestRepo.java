package com.exam.OEPRepo;
  
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exam.OEPModel.TestPage;
  
  
@Repository
public interface TestRepo extends JpaRepository<TestPage, Integer>
{
  
  
  }
  
  
 