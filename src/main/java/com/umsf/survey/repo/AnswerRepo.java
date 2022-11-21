package com.umsf.survey.repo;

import com.umsf.survey.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

import com.umsf.survey.entity.Answer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface AnswerRepo extends JpaRepository<Answer, Long>{
    @Query(value = "SELECT * FROM answer", nativeQuery = true)
    List<Answer> getAll();
    
    List<Answer> getAllByLecturer(String lecturer);

}
