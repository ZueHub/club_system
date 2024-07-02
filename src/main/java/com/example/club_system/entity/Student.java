package com.example.club_system.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	@Id
	@Column(name = "student_id")
	private int student_id;

	@Column(name = "grade")
	private String grade;

	@Column(name = "name")
	private String name;

	@Column(name = "email")
	private String email;

	@Column(name = "pwd")
	private String pwd;

	@Column(name = "status")
	private String status;

	@Column(name = "academic_year ")
	private int academic_year ;

	@Column(name = "club_id")
	private int club_id;

	@Column(name = "payment_status")
	private boolean paymentStatus;

	@Column(name = "choice_start_time")
	private LocalDate choiceStartTime;

	@Column(name = "choice_start_time")
	private LocalDate choiceEndTime;

	@Column(name = "choice_list")
	private String choiceList;

	public Student() {
		super();

	}

	public Student(int student_id, String grade, String name, String email, String pwd, String status,
			int academic_year, int club_id, boolean paymentStatus, LocalDate choiceStartTime, LocalDate choiceEndTime,
			String choiceList) {
		super();
		this.student_id = student_id;
		this.grade = grade;
		this.name = name;
		this.email = email;
		this.pwd = pwd;
		this.status = status;
		this.academic_year = academic_year;
		this.club_id = club_id;
		this.paymentStatus = paymentStatus;
		this.choiceStartTime = choiceStartTime;
		this.choiceEndTime = choiceEndTime;
		this.choiceList = choiceList;
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getAcademic_year() {
		return academic_year;
	}

	public void setAcademic_year(int academic_year) {
		this.academic_year = academic_year;
	}

	public int getClub_id() {
		return club_id;
	}

	public void setClub_id(int club_id) {
		this.club_id = club_id;
	}

	public boolean isPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(boolean paymentStatus) {
		this.paymentStatus = paymentStatus;
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


	