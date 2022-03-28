package com.exam.OEPController;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.exam.OEPModel.User;
import com.exam.OEPService.UserService;


@RestController
@RequestMapping("/UserLoginPage")
public class UserController {
	@Autowired
	UserService service;
	
	@PostMapping("/addUser")
	public ResponseEntity<String> addUser(@Validated @RequestBody User u)
	{
		@SuppressWarnings("unused")
		User user=service.addUser(u);
		return new ResponseEntity<String>("Registration done Successfully",HttpStatus.OK);
	}
	
	
	@GetMapping("/getAllUsers")
	@Validated
	public @ResponseBody List<User> getAllUsers() {
		List<User> userResponse = (List<User>) service.getAllUsers();
		return userResponse;
	}
	
	@DeleteMapping("/deleteUser")
	@Transactional
	@Validated
	public @ResponseBody String deleteUser() 
	{
	 service.deleteAll(); 
	 return "data deleted successfully";
	}
}
