package com.umsf.survey.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.umsf.survey.entity.Answer;
import com.umsf.survey.repo.AnswerRepo;

@Service
public class AnswerService {
	
	private final AnswerRepo answerRepo;
	
	@Autowired
	public AnswerService(AnswerRepo answerRepo) {
		this.answerRepo = answerRepo;
	}

	public void addNewAnswer(Answer answer) {
		System.out.println(answer.toString());
		//genreRepository.save(genre);
	}

	public List<Answer> getAllSubject() {
		return answerRepo.findAll();
	}
}
