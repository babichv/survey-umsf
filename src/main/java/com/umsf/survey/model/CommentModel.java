package com.umsf.survey.model;

import com.umsf.survey.entity.Answer;
import com.umsf.survey.entity.Subject;

public class CommentModel {
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getExtra() {
		return extra;
	}

	public void setExtra(String extra) {
		this.extra = extra;
	}

	private Long id;
    private String subject;
    private String extra;
    
    public CommentModel() {
    }
    
	public CommentModel(Long id, String subject, String extra) {
		this.id = id;
		this.subject = subject;
		this.extra = extra;
	}
    
    public static CommentModel entityToModel(Answer answer){
    	CommentModel model = new CommentModel(answer.getId(),answer.getSubject(), answer.getExtra());
        return model;
    }
}
