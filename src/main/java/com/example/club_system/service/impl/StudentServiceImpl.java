package com.example.club_system.service.impl;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.example.club_system.constants.ResMessage;
import com.example.club_system.repository.StudentDao;
import com.example.club_system.service.ifs.StudentService;
import com.example.club_system.vo.BasicRes;
import com.example.club_system.vo.CreateReq;


@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;

	@Override
	public BasicRes Create(CreateReq req) {
		BasicRes checkResult = checkParams(req);
		if(checkResult !=null) {
			return checkResult;
		}
		return null;
	}

	private BasicRes checkParams(CreateReq req) {
		if (req.getStudentId() <= 0) {
			return new BasicRes(ResMessage.PARAM_STUDENT_ID_ERROR.getCode(), //
					ResMessage.PARAM_STUDENT_ID_ERROR.getMessage());
		}
		if(!StringUtils.hasText(req.getGrade())) {
			return new BasicRes(ResMessage.PARAM_GRADE_ERROR.getCode(), //
					ResMessage.PARAM_GRADE_ERROR.getMessage());
		}
		if(!StringUtils.hasText(req.getName())) {
			return new BasicRes(ResMessage.PARAM_NAME_ERROR.getCode(), //
					ResMessage.PARAM_NAME_ERROR.getMessage());
		}
		if(!StringUtils.hasText(req.getEmail())) {
			return new BasicRes(ResMessage.PARAM_EMAIL_ERROR.getCode(), //
					ResMessage.PARAM_EMAIL_ERROR.getMessage());
		}
		if(!StringUtils.hasText(req.getPwd())) {
			return new BasicRes(ResMessage.PARAM_PWD_ERROR.getCode(), //
					ResMessage.PARAM_PWD_ERROR.getMessage());
		}
		if (req.getStudentId() <= 0) {
			return new BasicRes(ResMessage.	PARAM_CLUB_ID_ERROR.getCode(), //
					ResMessage.	PARAM_CLUB_ID_ERROR.getMessage());
		}
		if(req.getChoiceStartTime()==null    //
				||!req.getChoiceStartTime().isAfter(LocalDate.now())) {
			return new BasicRes(ResMessage.	PARAM_CHOICE_START_TIME_ERROR.getCode(),//
					ResMessage.	PARAM_CHOICE_START_TIME_ERROR.getMessage());
		}
		if(req.getChoiceEndTime()==null    //
				||!req.getChoiceEndTime().isBefore(req.getChoiceStartTime())) {
			return new BasicRes(ResMessage.	PARAM_CHOICE_END_TIME_ERROR.getCode(),//
					ResMessage.	PARAM_CHOICE_END_TIME_ERROR.getMessage());
		}
		if(!StringUtils.hasText(req.getChoiceList())) {
			return new BasicRes(ResMessage.PARAM_CHOICE_LIST_ERROR.getCode(), //
					ResMessage.PARAM_CHOICE_LIST_ERROR.getMessage());
		}
		return null;
	}
}
