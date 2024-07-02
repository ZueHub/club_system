package com.example.club_system.vo;

public class StudentReq {
	
	
	private int studentId;
	
	private String grade;
	
	private String name;
	
	private String email;
	
	private String pwd;

	public StudentReq() {
		super();
		
	}

	public StudentReq(int studentId, String grade, String name, String email, String pwd) {
		super();
		this.studentId = studentId;
		this.grade = grade;
		this.name = name;
		this.email = email;
		this.pwd = pwd;
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

	
	
}
