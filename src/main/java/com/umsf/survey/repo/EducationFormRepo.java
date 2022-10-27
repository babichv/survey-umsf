package com.umsf.survey.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.umsf.survey.entity.EducationForm;

public interface EducationFormRepo extends JpaRepository<EducationForm, Long> {

}
