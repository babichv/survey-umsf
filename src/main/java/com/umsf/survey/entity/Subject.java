package com.umsf.survey.entity;

import java.util.Set;

import javax.persistence.CascadeType;
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
public class Subject {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE,CascadeType.PERSIST})
	@JoinTable(
			name = "subject_lecturer",
			joinColumns = {@JoinColumn(name = "id_subject")},
			inverseJoinColumns = {@JoinColumn(name = "id_lecturer")}
			)
	Set<Lecturer> lecturers;
	
	@ManyToMany(mappedBy = "subjects")
	Set<Speciality> specialities;
	
	@Column(name = "title",nullable = false)
	String title;
	
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

	@Override
	public String toString() {
		return "Subject [id=" + id + ", title=" + title
				+ "]";
	}
	
}
