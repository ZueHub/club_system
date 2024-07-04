package com.example.club_system.vo;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateReq {
	
	@JsonProperty("student_Id")
	private int studentId;
	
	private String grade;
	
	private String name;
	
	private String email;
	
	private String pwd;

	@JsonProperty("club_id")
	private int clubId;
	
	@JsonProperty("choice_start_time")
	private LocalDate choiceStartTime;
	
	@JsonProperty("choice_end_time")
	private LocalDate choiceEndTime;
	
	@JsonProperty("choice_list")
	private String choiceList;

	public CreateReq() {
		super();
		
	}

	public CreateReq(int studentId, String grade, String name, String email, String pwd, int clubId,
			LocalDate choiceStartTime, LocalDate choiceEndTime, String choiceList) {
		super();
		this.studentId = studentId;
		this.grade = grade;
		this.name = name;
		this.email = email;
		this.pwd = pwd;
		this.clubId = clubId;
		this.choiceStartTime = choiceStartTime;
		this.choiceEndTime = choiceEndTime;
		this.choiceList = choiceList;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public int getClubId() {
		return clubId;
	}

	public void setClubId(int clubId) {
		this.clubId = clubId;
	}

	public LocalDate getChoiceStartTime() {
		return choiceStartTime;
	}

	public void setChoiceStartTime(LocalDate choiceStartTime) {
		this.choiceStartTime = choiceStartTime;
	}

	public LocalDate getChoiceEndTime() {
		return choiceEndTime;
	}

	public void setChoiceEndTime(LocalDate choiceEndTime) {
		this.choiceEndTime = choiceEndTime;
	}

	public String getChoiceList() {
		return choiceList;
	}

	public void setChoiceList(String choiceList) {
		this.choiceList = choiceList;
	}
	
	

	
	
}
