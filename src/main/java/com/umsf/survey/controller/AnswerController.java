package com.umsf.survey.controller;

import java.util.List;

import com.umsf.survey.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.umsf.survey.entity.Answer;
import com.umsf.survey.repo.AnswerRepo;

@RestController
@RequestMapping("/survey/answer")
public class AnswerController {
	
	private final AnswerService answerService;
	
	@Autowired
	public AnswerController(AnswerService answerService) {
		this.answerService = answerService;
	}
	
	@GetMapping
	public String hello() {
		return "answer";
	}
	
	@GetMapping("/all")
	public List<Answer> getAll() {
		return answerService.getAll();
	}

	@GetMapping("/{lecturer}")
	public List<Answer> getAnswerByLecturer(@PathVariable String lecturer){
		return answerService.getAllByLecturer(lecturer);
	}

	@PostMapping("/send")
	public ResponseEntity sendAnswer(@RequestBody Answer answer){
		try {
			answerService.sendAnswer(answer);
			return ResponseEntity.ok().body("Answer send success!");
		}catch (Exception e){
			return ResponseEntity.badRequest().body("Error!");
		}
	}
	
}
