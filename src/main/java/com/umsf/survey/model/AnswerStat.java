package com.umsf.survey.model;


public class AnswerStat {

	private Long id;
	private String subject;
	private String lecturer;
	private String extra;
	private Byte answer1;
	private Byte answer2;
	private Byte answer3;
	private Byte answer4;
	private Byte answer5;
	private Byte answer6;
	private Byte answer7;
	private Byte answer8;
	private Byte answer9;
	private Byte answer10;
	private Byte answer11;
	
	public AnswerStat() {
	}

	public AnswerStat(String subject,
			  String lecturer,
			  String extra,
			  Byte answer1,
			  Byte answer2,
			  Byte answer3,
			  Byte answer4,
			  Byte answer5,
			  Byte answer6,
			  Byte answer7,
			  Byte answer8,
			  Byte answer9,
			  Byte answer10,
			  Byte answer11)
{
	this.subject = subject;
	this.lecturer = lecturer;
	this.extra = extra;
	this.answer1 = answer1;
	this.answer2 = answer2;
	this.answer3 = answer3;
	this.answer4 = answer4;
	this.answer5 = answer5;
	this.answer6 = answer6;
	this.answer7 = answer7;
	this.answer8 = answer8;
	this.answer9 = answer9;
	this.answer10 = answer10;
	this.answer11 = answer11;
}

	
	public AnswerStat(Long id,
				  String subject,
				  String lecturer,
				  String extra,
				  Byte answer1,
				  Byte answer2,
				  Byte answer3,
				  Byte answer4,
				  Byte answer5,
				  Byte answer6,
				  Byte answer7,
				  Byte answer8,
				  Byte answer9,
				  Byte answer10,
				  Byte answer11)
	{
		this.id = id;
		this.subject = subject;
		this.lecturer = lecturer;
		this.extra = extra;
		this.answer1 = answer1;
		this.answer2 = answer2;
		this.answer3 = answer3;
		this.answer4 = answer4;
		this.answer5 = answer5;
		this.answer6 = answer6;
		this.answer7 = answer7;
		this.answer8 = answer8;
		this.answer9 = answer9;
		this.answer10 = answer10;
		this.answer11 = answer11;
	}

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

	public String getLecturer() {
		return lecturer;
	}

	public void setLecturer(String lecturer) {
		this.lecturer = lecturer;
	}

	public String getExtra() {
		return extra;
	}

	public void setExtra(String extra) {
		this.extra = extra;
	}

	public Byte getAnswer1() {
		return answer1;
	}

	public void setAnswer1(Byte answer1) {
		this.answer1 = answer1;
	}

	public Byte getAnswer2() {
		return answer2;
	}

	public void setAnswer2(Byte answer2) {
		this.answer2 = answer2;
	}

	public Byte getAnswer3() {
		return answer3;
	}

	public void setAnswer3(Byte answer3) {
		this.answer3 = answer3;
	}

	public Byte getAnswer4() {
		return answer4;
	}

	public void setAnswer4(Byte answer4) {
		this.answer4 = answer4;
	}

	public Byte getAnswer5() {
		return answer5;
	}

	public void setAnswer5(Byte answer5) {
		this.answer5 = answer5;
	}

	public Byte getAnswer6() {
		return answer6;
	}

	public void setAnswer6(Byte answer6) {
		this.answer6 = answer6;
	}

	public Byte getAnswer7() {
		return answer7;
	}

	public void setAnswer7(Byte answer7) {
		this.answer7 = answer7;
	}

	public Byte getAnswer8() {
		return answer8;
	}

	public void setAnswer8(Byte answer8) {
		this.answer8 = answer8;
	}

	public Byte getAnswer9() {
		return answer9;
	}

	public void setAnswer9(Byte answer9) {
		this.answer9 = answer9;
	}

	public Byte getAnswer10() {
		return answer10;
	}

	public void setAnswer10(Byte answer10) {
		this.answer10 = answer10;
	}

	public Byte getAnswer11() {
		return answer11;
	}

	public void setAnswer11(Byte answer11) {
		this.answer11 = answer11;
	}

	@Override
	public String toString() {
		return "Answer{" +
				"id=" + id +
				", subject='" + subject + '\'' +
				", lecturer='" + lecturer + '\'' +
				", extra='" + extra + '\'' +
				", answer1=" + answer1 +
				", answer2=" + answer2 +
				", answer3=" + answer3 +
				", answer4=" + answer4 +
				", answer5=" + answer5 +
				", answer6=" + answer6 +
				", answer7=" + answer7 +
				", answer8=" + answer8 +
				", answer9=" + answer9 +
				", answer10=" + answer10 +
				", answer11=" + answer11 +
				'}';
	}
}