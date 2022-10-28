package com.umsf.survey.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
	
//	@GetMapping("/byCriteria")
//	public List<Subject> SubjectsByCriteria(@RequestParam String educationLevel,
//			@RequestParam Integer recruitmentYear,
//			@RequestParam String educationForm,
//			@RequestParam String speciality){
//		return subjectService.getSubjectsByCriteria(educationLevel, recruitmentYear,educationForm,speciality);
//	}

	@GetMapping("/index")
	public ResponseEntity getAllByTitleAndSpeciality(@RequestParam("title") String title, @RequestParam("speciality") String speciality){
		try {
			return ResponseEntity.ok(subjectService.getSubjectsByTitleAndSpeciality(title, speciality));
		}
		catch (Exception e){
			return ResponseEntity.badRequest().body("Error Not Found");
		}
	}
	
}
