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


	public List<Answer> getAll(){
		return answerRepo.getAll();
	}

	public List<Answer> getAllByLecturer(String lecturer){
		List<Answer> answers = answerRepo.getAllByLecturer(lecturer);
		for ()
	}

	public Answer sendAnswer(Answer answer) {
		if (answer == null){
			throw new NullPointerException();
		}
		return answerRepo.save(answer);
	}

	public List<Answer> getAllSubject() {
		return answerRepo.findAll();
	}
}
