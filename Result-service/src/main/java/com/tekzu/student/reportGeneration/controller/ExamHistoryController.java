package com.tekzu.student.reportGeneration.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExamHistoryController {
	
	@RequestMapping(value = "/Examhistory/{id}", method = RequestMethod.GET)
	   @ResponseBody
	   public Long findOne(@PathVariable("id") Long id) {
	       return id;
	   }

}
