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

	public List<Subject> getSubjectsByCriteria(String educationLevel, Integer recruitmentYear, String educationForm,
			String speciality) {
		return subjectRepo.findAllByCriteria(educationLevel, recruitmentYear, educationForm, speciality);
	}
}
