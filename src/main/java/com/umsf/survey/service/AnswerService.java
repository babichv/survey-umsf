package com.umsf.survey.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.umsf.survey.entity.Answer;
import com.umsf.survey.model.AnswerI;
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

//	public List<AnswerModel> getAllModelByLecturer(String lecturer){
//		List<Answer> answers = getAllByLecturer(lecturer);
//		List<AnswerModel> answerModels = new ArrayList<>();
//		for (Answer answer : answers){
//			answerModels.add(AnswerModel.entityToModel(answer));
//		}
//		return answerModels;
//	}

//	public List<AnswerModel> getAllModelBySubjectAndLecturer(String subject, String lecturer){
//		List<Answer> answers = answerRepo.getAllBySubjectAndLecturer(subject, lecturer);
//		AnswerModel answerModel = new AnswerModel();
//		for (Answer answer : answers){
//
//		}
//	}

	public List<AnswerI> getAllByLecturer(String lecturer){
		return answerRepo.getAllByLecturer(lecturer);
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
