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
		//return new ArrayList<Subject>();
		return subjectRepo.findAllByEducationLevelAndYearAndEducationalFormAndSpeciality(educationLevel, year, educationalForm, speciality);
	}

	public List<Subject> getLecturerByCriteria(
			String educationLevel, 
			Integer year, 
			String educationalForm,
			String speciality,
			String title
			) {
		return subjectRepo.findAllByEducationLevelAndYearAndEducationalFormAndSpecialityAndTitle(educationLevel, year, educationalForm, speciality, title);
	}

	public List<Subject> getAllEducationLevel(){
		return subjectRepo.findAllEducationLevel();
	}

	public List<Subject> getAllYear(){
		return subjectRepo.findAllYear();
	}

	public List<Subject> getAllEducationalForm(){
		return subjectRepo.findAllEducationalForm();
	}
	
	public List<Subject> getAllSpeciality(){
		return subjectRepo.findAllSpeciality();
	}
}
