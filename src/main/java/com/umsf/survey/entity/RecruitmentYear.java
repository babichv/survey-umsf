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
@Table(name = "recruitment_year")
public class RecruitmentYear {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	@ManyToMany(mappedBy = "recruitmentYears")
	Set<EducationLevel> educationLevels;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(
			name = "recruitment_year_speciality",
			joinColumns = {@JoinColumn(name = "id_recruitment_year")},
			inverseJoinColumns = {@JoinColumn(name = "id_speciality")}
			)
	Set<Speciality> specialities;
	
	@Column(name = "year", columnDefinition = "SMALLINT",nullable = false)
	Integer year;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}
	
}
