package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("onlinequiz")
public class MainController {
	@Autowired
	UserDAO usdao;
	@Autowired
	AdminDAO addao;
	
	//http://localhost:8080/onlinequiz/userLogin
	@PostMapping(value="userLogin", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String userLogin(@RequestBody User u)
	{
			return usdao.userLogin(u.getEmailid(), u.getPassword());
	}
	
	//http://localhost:8080/onlinequiz/userRegister
	@PostMapping(value="userRegister", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String userRegiter(@RequestBody User u)
	{
		return usdao.userRegister(u);
	}
	
	//http://localhost:8080/onlinequiz/adminLogin
	@PostMapping(value="adminLogin", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String adminLogin(@RequestBody Admin u)
	{
			return addao.adminLogin(u);
	}
	
	//http://localhost:8080/onlinequiz/adminprofile
		@PostMapping(value="adminprofile", consumes = MediaType.APPLICATION_JSON_VALUE)
		public String adminUpdate(@RequestBody Admin u)
		{
				return addao.adminupdate(u);
		}
	
	
	
	
	//http://localhost:8080/onlinequiz/createQuestions
	@PostMapping(value="createQuestions", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String createQuestions(@RequestBody Question q)
	{
			return addao.addQuestion(q);
	}
	
	//http://localhost:8080/onlinequiz/createQuiz
	@PostMapping(value="createQuiz", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String createQuiz(@RequestBody Quiz q)
	{
			return addao.addQuiz(q);
	}
	
	//http://localhost:8080/onlinequiz/ListAllQuiz
		@GetMapping(value="ListAllQuiz", produces= MediaType.APPLICATION_JSON_VALUE)
		public List<Quiz> ListAllQuiz()
		{
				return addao.viewAllQuiz();
		}
		
		//http://localhost:8080/onlinequiz/quizDetails
		@GetMapping(value="quizDetails", produces= MediaType.APPLICATION_JSON_VALUE)
		public Statistics quizDetails()
		{
				return addao.quizInfo();
		}
		
		//http://localhost:8080/onlinequiz/viewQuiz
				@GetMapping(value="viewQuiz", produces= MediaType.APPLICATION_JSON_VALUE)
				public List<Object> viewQuiz()
				{
						return usdao.viewAllQuiz();
				}


				//http://localhost:8080/onlinequiz/takeTest
				@PostMapping(value="takeTest", consumes = MediaType.APPLICATION_JSON_VALUE)
				public String takeTest(@RequestBody Test t)
				{
						return usdao.takeTest(t);
				}
				
				//http://localhost:8080/onlinequiz/ListAllTest
				@GetMapping(value="ListAllTest", produces= MediaType.APPLICATION_JSON_VALUE)
				public List<Test> ListAllTest()
				{
						return usdao.getTestList();
				}
				
				//http://localhost:8080/onlinequiz/result
				@GetMapping(value="result", produces= MediaType.APPLICATION_JSON_VALUE)
				public List<Result> result()
				{
						return usdao.result();
				}
				
				//http://localhost:8080/onlinequiz/AdminResult
				@GetMapping(value="AdminResult", produces= MediaType.APPLICATION_JSON_VALUE)
				public List<Result> AdminResult()
				{
						return usdao.result();
				}
				
}
