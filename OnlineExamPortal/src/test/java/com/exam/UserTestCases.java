package com.exam;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.exam.OEPModel.User;
import com.exam.OEPModel.UserAddress;
import com.exam.OEPRepo.UserRepo;
import com.exam.OEPService.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTestCases {
	@MockBean
	private UserRepo repository;
	
	@Autowired
	private UserService service;
	
	@Test
	public void saveUser()
	{
		UserAddress address=new UserAddress("IND","TS","HYD","09876");
		User insert =new User("nat","nat@gmail.com",1234567890,"nat100",address);
		when(repository.save(insert)).thenReturn(insert);
		assertEquals(insert,service.addUser(insert));
	}
	

}
