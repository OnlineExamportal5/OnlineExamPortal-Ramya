package com.exam.OEPRepo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exam.OEPModel.User;

@Repository
public interface UserRepo extends JpaRepository<User,Integer> {

	
public List<User> findAll();	 	
public void deleteAll();
}
