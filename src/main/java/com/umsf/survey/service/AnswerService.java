package com.umsf.survey.service;

import java.util.ArrayList;
import java.util.List;

import com.umsf.survey.model.AnswerModel;
import com.umsf.survey.model.IAnswerCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.umsf.survey.entity.Answer;
import com.umsf.survey.model.CommentModel;
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

	public List<AnswerModel> getAllByLecturerGroupSubject(String lecturer){
		List<IAnswerCustom> answers = answerRepo.getAllByLecturerGroupSubject(lecturer);
		List<AnswerModel> answerModels = new ArrayList<>();
		for (IAnswerCustom answer : answers){
			answerModels.add(AnswerModel.entityToModel(answer));
		}
		return answerModels;
	}
	
	public List<Answer> findAllByLecturer(String lecturer){
		return  answerRepo.findAllByLecturer(lecturer);
	}
	
	public List<CommentModel> findCommentByLecturer(String lecturer){
		List<CommentModel> commentModels = new ArrayList<CommentModel>();
		List<Answer> answers = answerRepo.findAllByLecturer(lecturer);
		for (Answer answer : answers) {
			commentModels.add(CommentModel.entityToModel(answer));
		}
		return commentModels;
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
