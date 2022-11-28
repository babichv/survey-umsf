package com.umsf.survey.repo;

import java.util.List;

import com.umsf.survey.model.IAnswerCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.umsf.survey.entity.Answer;

public interface AnswerRepo extends JpaRepository<Answer, Long>{

    @Query(value = "SELECT * FROM answer", nativeQuery = true)
    List<Answer> getAll();
    
    @Query(value = "SELECT * FROM answer WHERE lecturer= :lecturer  ORDER BY `subject` ASC",nativeQuery = true)
    List<Answer> findAllByLecturer(String lecturer);
    
    @Query(nativeQuery = true,
value = "SELECT \n"
		+ "a.id AS id,\n"
		+ "lecturer AS lecturer,\n"
		+ "subject AS subject,\n"
		+ "COUNT(*) AS count,\n"
		+ "AVG(answer_1) AS answer1,\n"
		+ "AVG(answer_2) AS answer2,\n"
		+ "AVG(answer_3) AS answer3,\n"
		+ "AVG(answer_4) AS answer4,\n"
		+ "AVG(answer_5) AS answer5,\n"
		+ "AVG(answer_6) AS answer6,\n"
		+ "AVG(answer_7) AS answer7,\n"
		+ "AVG(answer_8) AS answer8,\n"
		+ "AVG(answer_9) AS answer9,\n"
		+ "AVG(answer_10) AS answer10,\n"
		+ "AVG(answer_11) AS answer11\n"
		+ "FROM answer a WHERE lecturer= :lecturer GROUP BY `subject`")
    List<IAnswerCustom> getAllByLecturerGroupSubject(String lecturer);
    
    
    List<Answer> getAllBySubjectAndLecturer(String subject, String lecturer);
}
