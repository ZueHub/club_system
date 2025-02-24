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
	@Column(name = "student_Id")
	private int studentId;

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
	private int academicYear ;

	@Column(name = "club_id")
	private int clubId;

	@Column(name = "payment_status")
	private boolean paymentStatus;

	@Column(name = "choice_start_time")
	private LocalDate choiceStartTime;

	@Column(name = "choice_end_time")
	private LocalDate choiceEndTime;

	@Column(name = "choice_list")
	private String choiceList;

	public Student() {
		super();

	}

	public Student(int studentId, String grade, String name, String email, String pwd, String status, int academicYear,
			int clubId, boolean paymentStatus, LocalDate choiceStartTime, LocalDate choiceEndTime, String choiceList) {
		super();
		this.studentId = studentId;
		this.grade = grade;
		this.name = name;
		this.email = email;
		this.pwd = pwd;
		this.status = status;
		this.academicYear = academicYear;
		this.clubId = clubId;
		this.paymentStatus = paymentStatus;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getAcademicYear() {
		return academicYear;
	}

	public void setAcademicYear(int academicYear) {
		this.academicYear = academicYear;
	}

	public int getClubId() {
		return clubId;
	}

	public void setClubId(int clubId) {
		this.clubId = clubId;
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


	