package com.tekzu.student.reportGeneration.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tekzu.student.model.StudentAddress;

@RestController
public class ResultGenerationController {
	
	
	@RequestMapping(method = RequestMethod.GET, value="/student/resultgeneration")
	public void ResultGeneration() {
		System.out.println(" ResultGenerationController...");
		
	}


}
