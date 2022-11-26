package com.umsf.survey.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.umsf.survey.entity.Subject;

public interface SubjectRepo extends JpaRepository<Subject, Long> {
	List<Subject> findAllByEducationLevelAndYearAndEducationalFormAndSpeciality(
			String educationLevel,
			Integer year,
			String educationalForm,
			String speciality
			);
	
	List<Subject> findAllBySpeciality(
			String speciality
			);
	
	@Query(value = "SELECT s.id,s.title FROM `subject` as s "
			+ "where s.education_level = :educationLevel "
			+ "and s.year = :year "
			+ "and s.educational_form = :educationalForm "
			+ "and s.speciality = :speciality ;",nativeQuery = true)
	List<Subject> findIdAndTitleByEducationLevelAndYearAndEducationalFormAndSpeciality(
			@Param("educationLevel") String educationLevel,
			@Param("year") Integer year,
			@Param("educationalForm") String educationalForm,
			@Param("speciality") String speciality
			);
	
	List<Subject> getAllByEducationLevelAndYearAndEducationalFormAndSpecialityAndTitle(
			String educationLevel,
			Integer year, 
			String educationalForm, 
			String speciality, 
			String title
			);
	
	@Query(value = "SELECT * FROM subject WHERE speciality = :speciality GROUP BY lecturer ", nativeQuery = true)
	List<Subject> getAllBySpeciality(
			String speciality
			);

	@Query(value = "SELECT * FROM subject GROUP BY education_level", nativeQuery = true)
	List<Subject> getAllEducationLevel();

	@Query(value = "SELECT * FROM subject GROUP BY year", nativeQuery = true)
	List<Subject> getAllYear();
	
	@Query(value = "SELECT * FROM subject GROUP BY educational_form", nativeQuery = true)
	List<Subject> getAllEducationalForm();
	
	@Query(value = "SELECT * FROM subject GROUP BY speciality", nativeQuery = true)
	List<Subject> getAllSpeciality();
}
