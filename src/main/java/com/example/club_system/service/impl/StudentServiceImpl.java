package com.example.club_system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.club_system.repository.StudentDao;
import com.example.club_system.service.ifs.StudentService;
import com.example.club_system.vo.BasicRes;
import com.example.club_system.vo.StudentReq;


@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentDao studentDao;

	@Override
	public BasicRes StudentReq(StudentReq req) {
		return null;
		
		
	}
	
	
	
	}


	

	
	

	

	


