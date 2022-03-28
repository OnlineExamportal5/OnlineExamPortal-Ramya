package com.exam;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.exam.OEPModel.TestPage;
import com.exam.OEPRepo.TestRepo;
import com.exam.OEPService.TestService;

//@RunWith(SpringRunner.class)
@SpringBootTest
public class TestTestCases {
	@MockBean
	private TestRepo repository;
	
	@Autowired
	private TestService service;
	
	@Test
	public void saveTest()
	{
		TestPage test=new TestPage("MTech");
		when(repository.save(test)).thenReturn(test);
		assertEquals(test, service.addTest(test));
		
	}

}
