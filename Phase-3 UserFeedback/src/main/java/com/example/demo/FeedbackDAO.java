package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedbackDAO 
{
	@Autowired
	FeedbackRepo repo;
	
	public Feedback insert(Feedback f)
	{
		return repo.save(f);
	}
	
	public List<Feedback> getall()
	{
		return repo.findAll();
	}
	
	
	public String delete(int id) {
		 repo.deleteById(id);
		 return "deleted the id "+id;
	}
}
