package com.umsf.survey.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table
public class Speciality {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	@Column(name = "title",nullable = false)
	String title;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(
			name = "speciality_subject",
			joinColumns = {@JoinColumn(name = "id_speciality")},
			inverseJoinColumns = {@JoinColumn(name = "id_subject")}
			)
	Set<Subject> subjects;
	
	@ManyToMany(mappedBy = "specialities")
	Set<RecruitmentYear> recruitmentYears;
	
	@ManyToMany(mappedBy = "specialities")
	Set<EducationForm> educationForms;

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
	
}
