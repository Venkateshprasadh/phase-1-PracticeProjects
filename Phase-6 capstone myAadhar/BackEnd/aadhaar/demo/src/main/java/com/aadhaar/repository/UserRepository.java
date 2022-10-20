package com.aadhaar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.aadhaar.bean.AadhaarInfo;
import com.aadhaar.bean.User;

@Repository
public interface UserRepository extends JpaRepository<User, String>{
	
	
	

}
