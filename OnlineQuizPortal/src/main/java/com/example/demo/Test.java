package com.example.demo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="test")
public class Test {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int testid;
	@ManyToOne(cascade = {CascadeType.ALL})
	@JoinColumn(referencedColumnName = "userid")
	private User usid;
	@ManyToOne
	@JoinColumn(referencedColumnName = "quzid")
	private Quiz quizid;
	@ManyToOne
	@JoinColumn(referencedColumnName = "quesid")
	private Question questionid;
	private int testans;
	public int getTestid() {
		return testid;
	}
	public void setTestid(int testid) {
		this.testid = testid;
	}
	public User getUsid() {
		return usid;
	}
	public void setUsid(User usid) {
		this.usid = usid;
	}
	public Quiz getQuizid() {
		return quizid;
	}
	public void setQuizid(Quiz quizid) {
		this.quizid = quizid;
	}
	public Question getQuestionid() {
		return questionid;
	}
	public void setQuestionid(Question questionid) {
		this.questionid = questionid;
	}
	public int getTestans() {
		return testans;
	}
	public void setTestans(int testans) {
		this.testans = testans;
	}
	@Override
	public String toString() {
		return "Test [testid=" + testid + ", usid=" + usid + ", quizid=" + quizid + ", questionid=" + questionid
				+ ", testans=" + testans + "]";
	}
	
	
	
	
	

}
