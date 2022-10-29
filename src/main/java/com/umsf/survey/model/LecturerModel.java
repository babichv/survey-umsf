package com.umsf.survey.model;

import com.umsf.survey.entity.Subject;

public class LecturerModel {
    private Long id;
    private String name;

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setTitle(String name) {
		this.name = name;
	}

    public LecturerModel(Long id, String name){
        this.id = id;
        this.name = name;
    }

    public static LecturerModel entityToModel(Subject subject){
        LecturerModel model = new LecturerModel(subject.getId(), subject.getLecturer());
        return model;
    }
}