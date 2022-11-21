package com.umsf.survey.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.umsf.survey.entity.Subject;
import com.umsf.survey.service.SubjectService;

@RestController
@RequestMapping("/survey/subject")
public class SubjectController {
	
	private final SubjectService subjectService;
	
	@Autowired
	public SubjectController(SubjectService subjectService) {
		this.subjectService = subjectService;
	}

	@GetMapping("/all")
	public ResponseEntity all() {
		try{
			return ResponseEntity.ok(subjectService.getAllSubject());
		}
		catch (Exception e){
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}
	
	@GetMapping("/getSubjectByParams")
	public ResponseEntity getSubjectByCriteria(@RequestParam("educationLevel") String educationLevel,
			@RequestParam("year") Integer year,
			@RequestParam("educationalForm") String educationalForm,
			@RequestParam("speciality") String speciality){
		try{
			return ResponseEntity.ok(subjectService.getSubjectByCriteria(educationLevel,year,educationalForm,speciality));
		}catch (Exception e){
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}
	
	@GetMapping("/getSubjectStatsByParams")
	public ResponseEntity getSubjectByCriteria(@RequestParam("speciality") String speciality){
		try{
			return ResponseEntity.ok(subjectService.getSubjectByCriteria(speciality));
		}catch (Exception e){
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}
	
	@GetMapping("/getLecturerByParams")
	public ResponseEntity getLecturerByCriteria(@RequestParam("educationLevel") String educationLevel,
															   @RequestParam("year") Integer year,
															   @RequestParam("educationalForm") String educationalForm,
															   @RequestParam("speciality") String speciality,
															   @RequestParam("title") String title){
		try{
			return ResponseEntity.ok(subjectService.getLecturerByCriteria(educationLevel,year,educationalForm,speciality,title));
		}catch (Exception e){
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}
	
	@GetMapping("/getLecturerStatsByParams")
	public ResponseEntity getLecturerByCriteria(@RequestParam("speciality") String speciality,
												@RequestParam("title") String title){
		try {
			return ResponseEntity.ok(subjectService.getLecturerByCriteria(speciality, title));
		}catch (Exception e){
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}

	@GetMapping("/all/educationLevel")
	public ResponseEntity getAllEducationLevel(){
		try {
			return ResponseEntity.ok(subjectService.getAllEducationLevel());
		} catch (Exception e){
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}

	@GetMapping("/all/educationalForm")
	public ResponseEntity getAllEducationalForm(){
		try {
			return ResponseEntity.ok(subjectService.getAllEducationalForm());
		} catch (Exception e){
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}
	
	@GetMapping("/all/year")
	public ResponseEntity getAllYear(){
		try {
			return ResponseEntity.ok().body(subjectService.getAllYear());
		} catch (Exception e){
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}

	@GetMapping("/all/speciality")
	public ResponseEntity getAllSpeciality(){
		try {
			return ResponseEntity.ok(subjectService.getAllSpeciality());
		} catch (Exception e){
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}
}