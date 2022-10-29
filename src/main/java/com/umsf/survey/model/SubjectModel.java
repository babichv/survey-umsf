package com.umsf.survey.model;

import com.umsf.survey.entity.Subject;

public class SubjectModel {
    private Long id;
    private String title;

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

    public SubjectModel(Long id, String title){
        this.id = id;
        this.title = title;
    }

    public static SubjectModel entityToModel(Subject subject){
        SubjectModel subjectModel = new SubjectModel(subject.getId(), subject.getTitle());
        return subjectModel;
    }
}
