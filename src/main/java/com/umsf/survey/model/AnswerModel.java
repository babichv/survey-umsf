package com.umsf.survey.model;

import com.umsf.survey.entity.Answer;

import java.util.Objects;

public class AnswerModel {
    private String subject;
    private String lecturer;

    private Double answer1;
    private Double answer2;
    private Double answer3;
    private Double answer4;
    private Double answer5;
    private Double answer6;
    private Double answer7;
    private Double answer8;
    private Double answer9;
    private Double answer10;
    private Double answer11;
    private Double avg;
    private Integer countAnswers;


    public AnswerModel() {
    }

    public static AnswerModel entityToModel(IAnswerCustom answer){
        AnswerModel answerModel = new AnswerModel();
        if (answer == null){
            throw new NullPointerException();
        }
        Double avg = 0.0;
        Integer count = 0;
        if (!Objects.isNull(answer.getAnswer1())){
            answerModel.setAnswer1(answer.getAnswer1());
            avg = avg + answer.getAnswer1();
            count++;
        }
        if (!Objects.isNull(answer.getAnswer2())){
            answerModel.setAnswer2(answer.getAnswer2());
            avg = avg + answer.getAnswer2();
            count++;
        }
        if (!Objects.isNull(answer.getAnswer3())){
            answerModel.setAnswer3(answer.getAnswer3());
            avg = avg + answer.getAnswer3();
            count++;
        }
        if (!Objects.isNull(answer.getAnswer4())){
            answerModel.setAnswer4(answer.getAnswer4());
            avg = avg + answer.getAnswer4();
            count++;
        }
        if (!Objects.isNull(answer.getAnswer5())){
            answerModel.setAnswer5(answer.getAnswer5());
            avg = avg + answer.getAnswer5();
            count++;
        }
        if (!Objects.isNull(answer.getAnswer6())){
            answerModel.setAnswer6(answer.getAnswer6());
            avg = avg + answer.getAnswer6();
            count++;
        }
        if (!Objects.isNull(answer.getAnswer7())){
            answerModel.setAnswer7(answer.getAnswer7());
            avg = avg + answer.getAnswer7();
            count++;
        }
        if (!Objects.isNull(answer.getAnswer8())){
            answerModel.setAnswer8(answer.getAnswer8());
            avg = avg + answer.getAnswer8();
            count++;
        }
        if (!Objects.isNull(answer.getAnswer9())){
            answerModel.setAnswer9(answer.getAnswer9());
            avg = avg + answer.getAnswer9();
            count++;
        }
        if (!Objects.isNull(answer.getAnswer10())){
            answerModel.setAnswer10(answer.getAnswer10());
            avg = avg + answer.getAnswer10();
            count++;
        }
        if (!Objects.isNull(answer.getAnswer11())){
            answerModel.setAnswer11(answer.getAnswer11());
            avg = avg + answer.getAnswer11();
            count++;
        }
        answerModel.setAvg(avg/count);
        answerModel.setLecturer(answer.getLecturer());
        answerModel.setSubject(answer.getSubject());
        answerModel.setCountAnswers(answer.getCount());
        return answerModel;
    }

    public AnswerModel(String subject, String lecturer,
                       Double answer1,
                       Double answer2,
                       Double answer3,
                       Double answer4,
                       Double answer5,
                       Double answer6,
                       Double answer7,
                       Double answer8,
                       Double answer9,
                       Double answer10,
                       Double answer11,
                       Double avg,
                       Integer countAnswers) {

        this.subject = subject;
        this.lecturer = lecturer;
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
        this.avg = avg;
        this.countAnswers = countAnswers;
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

    public Double getAnswer1() {
        return answer1;
    }

    public void setAnswer1(Double answer1) {
        this.answer1 = answer1;
    }

    public Double getAnswer2() {
        return answer2;
    }

    public void setAnswer2(Double answer2) {
        this.answer2 = answer2;
    }

    public Double getAnswer3() {
        return answer3;
    }

    public void setAnswer3(Double answer3) {
        this.answer3 = answer3;
    }

    public Double getAnswer4() {
        return answer4;
    }

    public void setAnswer4(Double answer4) {
        this.answer4 = answer4;
    }

    public Double getAnswer5() {
        return answer5;
    }

    public void setAnswer5(Double answer5) {
        this.answer5 = answer5;
    }

    public Double getAnswer6() {
        return answer6;
    }

    public void setAnswer6(Double answer6) {
        this.answer6 = answer6;
    }

    public Double getAnswer7() {
        return answer7;
    }

    public void setAnswer7(Double answer7) {
        this.answer7 = answer7;
    }

    public Double getAnswer8() {
        return answer8;
    }

    public void setAnswer8(Double answer8) {
        this.answer8 = answer8;
    }

    public Double getAnswer9() {
        return answer9;
    }

    public void setAnswer9(Double answer9) {
        this.answer9 = answer9;
    }

    public Double getAnswer10() {
        return answer10;
    }

    public void setAnswer10(Double answer10) {
        this.answer10 = answer10;
    }

    public Double getAnswer11() {
        return answer11;
    }

    public void setAnswer11(Double answer11) {
        this.answer11 = answer11;
    }

    public Double getAvg() {
        return avg;
    }

    public void setAvg(Double avg) {
        this.avg = avg;
    }

    public Integer getCountAnswers() {
        return countAnswers;
    }

    public void setCountAnswers(Integer countAnswers) {
        this.countAnswers = countAnswers;
    }
}
