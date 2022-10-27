package com.umsf.survey.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.umsf.survey.entity.Answer;
import com.umsf.survey.repo.AnswerRepo;

@RestController
@RequestMapping("survey/answer")
public class AnswerController {
	
	private final AnswerRepo answerRepo;
	
	@Autowired
	public AnswerController(AnswerRepo answerRepo) {
		this.answerRepo = answerRepo;
	}
	
	@GetMapping
	public String hello() {
		return "answer";
	}
	
	@GetMapping("/all")
	public List<Answer> all() {
		return answerRepo.findAll();
	}
	
}
