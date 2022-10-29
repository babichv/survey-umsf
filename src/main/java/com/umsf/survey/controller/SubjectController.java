package com.umsf.survey.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.umsf.survey.entity.Subject;
import com.umsf.survey.service.SubjectService;

@RestController
@RequestMapping("survey/subject")
public class SubjectController {
	
	private final SubjectService subjectService;
	
	@Autowired
	public SubjectController(SubjectService subjectService) {
		this.subjectService = subjectService;
	}
	
	@GetMapping
	public String subject() {
		return "subject";
	}
	
	@GetMapping("/all")
	public List<Subject> all() {
		return subjectService.getAllSubject();
	}
	
	@GetMapping("/getSubjectByParams")
	public List<Subject> getSubjectByCriteria(@RequestParam("educationLevel") String educationLevel,
			@RequestParam("year") Integer year,
			@RequestParam("educationalForm") String educationalForm,
			@RequestParam("speciality") String speciality){
		return subjectService.getSubjectByCriteria(educationLevel,year,educationalForm,speciality);
	}
	
	@GetMapping("/getLecturerByParams")
	public List<Subject> getLecturerByCriteria(@RequestParam("educationLevel") String educationLevel,
			@RequestParam("year") Integer year,
			@RequestParam("educationalForm") String educationalForm,
			@RequestParam("speciality") String speciality,
			@RequestParam("title") String title){
		return subjectService.getLecturerByCriteria(educationLevel,year,educationalForm,speciality,title);
	}
	
}
