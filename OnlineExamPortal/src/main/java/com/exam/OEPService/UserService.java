package com.exam.OEPService;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.OEPModel.User;
import com.exam.OEPRepo.UserRepo;
@Service
@Transactional
public class UserService {
	@Autowired
	UserRepo repo;
	
	public User addUser(User u)
	{
		User user=repo.save(u);
		return user;
	}
	
	public List<User> getAllUsers()
	{
		return repo.findAll();
	}
	 
	public void deleteAll() {
		repo.deleteAll();
	}
}
