package com.umsf.survey.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.umsf.survey.entity.Subject;
import com.umsf.survey.repo.SubjectRepo;

@Service
public class SubjectService {
	
	private final SubjectRepo subjectRepo;
	
	@Autowired
	public SubjectService(SubjectRepo subjectRepo) {
		this.subjectRepo = subjectRepo;
	}

	public List<Subject> getAllSubject() {
		return subjectRepo.findAll();
	}

	public List<Subject> getSubjectByCriteria(String educationLevel, Integer year, String educationalForm,
			String speciality) {
		return subjectRepo.findAllByEducationLevelAndYearAndEducationalFormAndSpeciality(educationLevel, year, educationalForm, speciality);
	}
	
	public List<Subject> getSubjectByCriteria(String speciality) {
		return subjectRepo.findAllBySpeciality(speciality);
	}

	public List<Subject> getLecturerByCriteria(
			String educationLevel, 
			Integer year, 
			String educationalForm,
			String speciality,
			String title
			) {
		return subjectRepo.getAllByEducationLevelAndYearAndEducationalFormAndSpecialityAndTitle(educationLevel, year, educationalForm, speciality, title);
	}
	
	public List<Subject> getLecturerByCriteria(String speciality, String title) {
		return subjectRepo.getAllBySpecialityAndTitle(speciality, title);
	}

	public List<Subject> getAllEducationLevel(){
		return subjectRepo.getAllEducationLevel();
	}

	public List<Subject> getAllYear(){
		return subjectRepo.getAllYear();
	}

	public List<Subject> getAllEducationalForm(){
		return subjectRepo.getAllEducationalForm();
	}
	
	public List<Subject> getAllSpeciality(){
		return subjectRepo.getAllSpeciality();
	}

	

	
}
