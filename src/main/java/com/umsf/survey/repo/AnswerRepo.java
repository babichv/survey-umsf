package com.umsf.survey.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.umsf.survey.entity.Answer;

public interface AnswerRepo extends JpaRepository<Answer, Long>{
	
}
