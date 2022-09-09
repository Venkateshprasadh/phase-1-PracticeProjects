package com.example.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDAO {
	
	
	List<Result> finalList=new ArrayList<>();
	@Autowired
	Userrepo usrepo;
	@Autowired
	Quizrepo quzrepo;
	@Autowired
	Testrepo tstrepo;
	@Autowired
	User us;
	@Autowired
	Test tst;

	Result r= new Result();
	
	public String userLogin(String email,String password)
	{
		us=usrepo.findByEmailid(email);
		if(us!=null)
		{
			
		
		if(us.getEmailid().equals(email)&&us.getPassword().equals(password))
		{
			return "login successful for user"+us.getEmailid();
		}
		else
		{
			return "login failed please check the credentials";
		}
		
		
	}
	else
	{
		return "User not found";
	}
		

  }
	
	
	public String userRegister(User u)
	{
		if(usrepo.findByEmailid(u.getEmailid())==null)
		{
			usrepo.save(u);
			return "new user registered succesfully for email id: "+u.getEmailid();
		}
		else
		{
			return "User already exists";
		}
	}
	
	public List<Object> viewAllQuiz()
	{
		return quzrepo.listOfQuiz();
	}
	
	public String takeTest(Test t)
	{
		if(t!=null)
		{
			tstrepo.save(t);
			return " test submitted succesfully ";
		}
		
		else
		{
			return "submission failed";
		}
			
	}
	
	public List<Test> getTestList()
	{
		return tstrepo.findAll();
	}
	
	public List<Result> result()
	{	
		String email="";
		int mark=0;
		List<Test> obj=tstrepo.findAll();
		List<User> u= usrepo.findAll();
		for (User user : u) {
			mark=0;
			email=user.getEmailid();
			System.out.println(user.getEmailid());
			
			for(Test ob :obj)
			{
				if(user.getUid()==ob.getUsid().getUid())
				{
					
					if(ob.getTestans()==ob.getQuestionid().getAnswer())
					{
						mark++;
					}
					System.out.println("inside"+mark);
					
				}
			}
			System.out.println("outside"+mark); 
			
		
			
			finalList.add(new Result(email,mark));
			
			
			
		}
		System.out.println("final :"+mark);
		
		Collections.sort(finalList);
		
		return finalList;
		
	}
}