package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface Quizrepo extends JpaRepository<Quiz, Integer>{

	@Query("select q.topic,count(distinct q.quizno) from Quiz as q group by q.quizno")
	public List<Object> listOfQuiz();
	}
