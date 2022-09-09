package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminDAO {
	@Autowired
	Questionrepo quesrepo;
	@Autowired
	Quizrepo quzrepo;
	@Autowired
	Userrepo usrepo;
	@Autowired
	Statistics stats;
	@Autowired
	AdminRepo adrepo;
	
	
	
	public String adminLogin(Admin u)
	{
		Admin ad= adrepo.findById(1).get();
		if(u.getUsername().equals(ad.getUsername())&&u.getPassword().equals(ad.getPassword()))
		{
			return "Welcome admin: " +ad.getUsername();
		}
		else
		{
			return " Sorry ! invalid Credentials please try again";
		}
	}
	public String adminupdate(Admin a)
	{
		Admin ad= adrepo.findById(1).get();
		ad.setUsername(a.getUsername());
		ad.setPassword(a.getUsername());
		adrepo.saveAndFlush(ad);
			return "admin details Updated succesfully ";
	

	}
	
	public String addQuestion(Question q)
	{
		if(q!=null)
		{
			quesrepo.save(q);
			return "question  :"+q.getQuestion()+ "---added succesfully";
		}
		else
		{
			return "failed to add new question";
		}
		
	}
	
	public String addQuiz(Quiz q)
	{
		
		if(q!=null)
		{
			quzrepo.save(q);
			return " new quiz for topic: "+q.getTopic()+"\n subject: "+q.getSubject()+"----added succesfully";
		}
		else
		{
			return "failed to add new quiz";
		}
	}
	
	public List<Quiz> viewAllQuiz()
	{
		return quzrepo.findAll();
	}
	
	public Statistics quizInfo()
	{
		stats.setUsers(usrepo.findAll().size());
		stats.setQuestions(quesrepo.findAll().size());
		stats.setQuiz(quzrepo.listOfQuiz());
		
		return stats;

	}
	
	

}
