package com.umsf.survey.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Subject {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;

	@Column(name = "title",nullable = false)
	String title;
	
	@Column(name = "education_level",length = 10,nullable = false)
	String educationLevel;
	
	@Column(name = "educational_form",length = 10,nullable = false)
	String educationalForm;
	
	@Column(name = "speciality",nullable = false)
	String speciality;
	
	@Column(name = "year", columnDefinition = "SMALLINT",nullable = false)
	Integer year;
	
	@Column(name = "lecturer",nullable = false,length = 50)
	String lecturer;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEducationLevel() {
		return educationLevel;
	}

	public void setEducationLevel(String educationLevel) {
		this.educationLevel = educationLevel;
	}

	public String getEducationalForm() {
		return educationalForm;
	}

	public void setEducationalForm(String educationalForm) {
		this.educationalForm = educationalForm;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getLecturer() {
		return lecturer;
	}

	public void setLecturer(String lecturer) {
		this.lecturer = lecturer;
	}
	
	@Override
	public String toString() {
		return "Subject [id=" + id + ", title=" + title + ", educationLevel=" + educationLevel + ", educationalForm="
				+ educationalForm + ", speciality=" + speciality + ", year=" + year + "]";
	}	
}