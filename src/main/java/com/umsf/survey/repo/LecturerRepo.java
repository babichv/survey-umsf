package com.umsf.survey.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.umsf.survey.entity.Lecturer;

public interface LecturerRepo extends JpaRepository<Lecturer, Long>{

}
