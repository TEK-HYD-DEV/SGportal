package com.tekzu.student.reportGeneration.controller;

import javax.validation.Valid;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tekzu.student.model.Student;
import com.tekzu.student.model.StudentAddress;

@RestController
public class Hallticketcontroller {
	
		
	 @GetMapping("/reportgeneration/student")
	    @ResponseBody
	    public Student welcomeUser(@RequestParam(name="name", required=false, defaultValue="wrking") String name) {
	        return new Student();
	    }
	 
	 @RequestMapping(method = RequestMethod.POST, value="/student/address")
	 @ResponseBody
	 StudentAddress registerStudent(@RequestBody StudentAddress studentregd) {
		 StudentAddress stdregreply = new StudentAddress();
	 stdregreply.setCountry("India");
	 stdregreply.setState("Andhra Pradesh");
	 return stdregreply;
	 }


}