package com.tekzu.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.tekzu.dao.HallTicketPdfDAO;
import com.tekzu.student.model.Student;

public class HallTicketPdfServiceImpl implements HallTicketPdfService {

	@Autowired
	HallTicketPdfDAO hallTicketPdfDAO;

	@Override
	public Student getStudentDetails() {
		// TODO Auto-generated method stub
		return null;
	}

}
