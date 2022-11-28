package com.umsf.survey.model;

import com.umsf.survey.entity.Answer;

import java.util.Objects;

public class AnswerModel {
    private String subject;
    private String lecturer;

    private double answer1;
    private double answer2;
    private double answer3;
    private double answer4;
    private double answer5;
    private double answer6;
    private double answer7;
    private double answer8;
    private double answer9;
    private double answer10;
    private double answer11;
    private double avg;
    private int countAnswers;


    public AnswerModel() {
    }

    public static AnswerModel entityToModel(IAnswerCustom answer){
        AnswerModel answerModel = new AnswerModel();
        if (answer == null){
            throw new NullPointerException();
        }
        double avg = 0;
        int count = 0;
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
        return answerModel;
    }

    public AnswerModel(String subject, String lecturer,
                       double answer1,
                       double answer2,
                       double answer3,
                       double answer4,
                       double answer5,
                       double answer6,
                       double answer7,
                       double answer8,
                       double answer9,
                       double answer10,
                       double answer11,
                       double avg,
                       int countAnswers) {

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

    public double getAnswer1() {
        return answer1;
    }

    public void setAnswer1(double answer1) {
        this.answer1 = answer1;
    }

    public double getAnswer2() {
        return answer2;
    }

    public void setAnswer2(double answer2) {
        this.answer2 = answer2;
    }

    public double getAnswer3() {
        return answer3;
    }

    public void setAnswer3(double answer3) {
        this.answer3 = answer3;
    }

    public double getAnswer4() {
        return answer4;
    }

    public void setAnswer4(double answer4) {
        this.answer4 = answer4;
    }

    public double getAnswer5() {
        return answer5;
    }

    public void setAnswer5(double answer5) {
        this.answer5 = answer5;
    }

    public double getAnswer6() {
        return answer6;
    }

    public void setAnswer6(double answer6) {
        this.answer6 = answer6;
    }

    public double getAnswer7() {
        return answer7;
    }

    public void setAnswer7(double answer7) {
        this.answer7 = answer7;
    }

    public double getAnswer8() {
        return answer8;
    }

    public void setAnswer8(double answer8) {
        this.answer8 = answer8;
    }

    public double getAnswer9() {
        return answer9;
    }

    public void setAnswer9(double answer9) {
        this.answer9 = answer9;
    }

    public double getAnswer10() {
        return answer10;
    }

    public void setAnswer10(double answer10) {
        this.answer10 = answer10;
    }

    public double getAnswer11() {
        return answer11;
    }

    public void setAnswer11(double answer11) {
        this.answer11 = answer11;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public int getCountAnswers() {
        return countAnswers;
    }

    public void setCountAnswers(int countAnswers) {
        this.countAnswers = countAnswers;
    }
}
