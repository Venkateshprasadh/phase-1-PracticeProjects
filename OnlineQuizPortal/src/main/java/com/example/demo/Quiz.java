package com.example.demo;



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
@Table(name="quiz")
public class Quiz {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int quzid;
	private String topic;
	private int quizno;
	private String subject;
	@ManyToOne
	@JoinColumn(referencedColumnName = "quesid")
	private Question quesid;
	public int getQuzid() {
		return quzid;
	}
	public void setQuzid(int quzid) {
		this.quzid = quzid;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public int getQuizno() {
		return quizno;
	}
	public void setQuizno(int quizno) {
		this.quizno = quizno;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public Question getQuesid() {
		return quesid;
	}
	public void setQuesid(Question quesid) {
		this.quesid = quesid;
	}
	@Override
	public String toString() {
		return "Quiz [quzid=" + quzid + ", topic=" + topic + ", quizno=" + quizno + ", subject=" + subject + ", quesid="
				+ quesid + "]";
	}
	
}
