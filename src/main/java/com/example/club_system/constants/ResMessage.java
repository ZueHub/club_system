package com.example.club_system.constants;

public enum ResMessage {
	SUCCESS(200, "Success!!"),//
	PARAM_STUDENT_ID_ERROR(400,"Param studentid error"),//
	PARAM_GRADE_ERROR(400,"Param grade error"),//
	PARAM_NAME_ERROR(400,"Param name error"),//
	PARAM_EMAIL_ERROR(400,"Param email error"),//
	PARAM_PWD_ERROR(400,"Param pwd error"),//
	PARAM_CLUB_ID_ERROR(400,"Param club_id error"),//
	PARAM_CHOICE_START_TIME_ERROR(400,"Param choice_start_time error"),//
	PARAM_CHOICE_END_TIME_ERROR(400,"Param choice_end_time error"),//
	PARAM_CHOICE_LIST_ERROR(400,"Param choice_list error");
	
	

	private int code;

	private String message;

	private ResMessage(int code, String message) {
		this.code = code;
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}

}
