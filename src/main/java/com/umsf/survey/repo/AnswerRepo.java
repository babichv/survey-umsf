package com.umsf.survey.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.umsf.survey.entity.Answer;
import com.umsf.survey.model.AnswerI;

public interface AnswerRepo extends JpaRepository<Answer, Long>{

    @Query(value = "SELECT * FROM answer", nativeQuery = true)
    List<Answer> getAll();
    
//    @Query(value = "SELECT id,"
//    		+ "AVG(answer_1) AS answer1,"
//    		+ "AVG(answer_2) AS answer2,"
//    		+ "AVG(answer_3) AS answer3,"
//    		+ "AVG(answer_4) AS answer4,"
//    		+ "AVG(answer_5) AS answer5,"
//    		+ "AVG(answer_6) AS answer6,"
//    		+ "AVG(answer_7) AS answer7,"
//    		+ "AVG(answer_8) AS answer8,"
//    		+ "AVG(answer_9) AS answer9,"
//    		+ "AVG(answer_10) AS answer10,"
//    		+ "AVG(answer_11) AS answer11,"
//    		+ "extra,subject,lecturer "
//    		+ "FROM answer WHERE lecturer= :lecturer GROUP BY `subject`",nativeQuery = true)
//    List<AnswerStat> getAllByLecturer(@Param("lecturer") String lecturer);
    
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
    List<AnswerI> getAllByLecturer(String lecturer);
    
    List<Answer> getAllBySubjectAndLecturer(String subject, String lecturer);
}
