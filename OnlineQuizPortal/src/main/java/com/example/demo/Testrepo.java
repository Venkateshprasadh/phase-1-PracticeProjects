package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface Testrepo extends JpaRepository<Test, Integer>{
	
	@Query("Select t from Test as t group by t.usid")
	List<Test> getIndividual();

}
