package com.umsf.survey.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.umsf.survey.entity.Subject;

public interface SubjectRepo extends JpaRepository<Subject, Long> {
	@Query(value = "select t from lecturer",
			nativeQuery = true)
	List<Subject> findAllByCriteria(
			@Param("educationLevel") String educationLevel,
			@Param("recruitmentYear") Integer recruitmentYear,
			@Param("educationForm") String educationForm,
			@Param("speciality") String speciality
			);
}
