package com.example.demo;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class FeedbackRESTController 
{
	@Autowired
	FeedbackDAO dao;
	
	@RequestMapping("/")
	public ModelAndView intializerpage(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("index.jsp");
		return mv;
	}
	@RequestMapping("/insertvalue")
	public Feedback insertvalue(Feedback e) {
		return dao.insert(e);
	}
	
	
	@PostMapping("/insert")
	public Feedback insert(@RequestBody Feedback e) {
		return dao.insert(e);
	}
		
	@GetMapping("/getall")
	public List<Feedback> getall(){
		return dao.getall();
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable  int id) {
		 return dao.delete(id);
	}
}
