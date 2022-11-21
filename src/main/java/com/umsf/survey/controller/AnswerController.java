package com.umsf.survey.controller;

import com.umsf.survey.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.umsf.survey.entity.Answer;

@RestController
@RequestMapping("/survey/answer")
public class AnswerController {
	
	private final AnswerService answerService;
	
	@Autowired
	public AnswerController(AnswerService answerService) {
		this.answerService = answerService;
	}

	@GetMapping("/all")
	public ResponseEntity getAll() {
		try {
			return ResponseEntity.ok(answerService.getAll());
		}
		catch (Exception e){
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}

	@GetMapping("/getByLecturer")
	public ResponseEntity getAnswerByLecturer(@RequestParam String lecturer){
		try {
			return ResponseEntity.ok(answerService.getAllModelByLecturer(lecturer));
		}
		catch (Exception e){
			return ResponseEntity.badRequest().body(e.getMessage());
		}
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