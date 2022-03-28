package com.exam.OEPController;
  
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exam.OEPModel.TestPage;
import com.exam.OEPService.TestService;
  
@RestController
@RequestMapping("/AdminTestCreationPage") 
public class AdminTestCreation {
  
@Autowired TestService service;
  
@PostMapping("/addTest")
public ResponseEntity<String> addTest(@Validated @RequestBody TestPage t) {
  
@SuppressWarnings("unused") 
TestPage test=service.addTest(t); 
return new ResponseEntity<String>("Test Created Successfully", HttpStatus.OK); }
  
  
  
  
  }
 