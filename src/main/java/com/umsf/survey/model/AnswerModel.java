package com.umsf.survey.model;

import com.umsf.survey.entity.Answer;

public class AnswerModel {
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
    private double avg;

    public AnswerModel() {
    }

    public static AnswerModel entityToModel(Answer answer){
        if (answer == null){
            throw new NullPointerException();
        }
        AnswerModel answerModel = new AnswerModel();
        double avg = 0;
        int countAnswers = 0;

        if (answer.getAnswer1() != null){
            answerModel.setAnswer1(answer.getAnswer1());
            avg =+ answer.getAnswer1();
            countAnswers++;
        }
        if (answer.getAnswer2() != null){
            answerModel.setAnswer2(answer.getAnswer2());
            avg =+ answer.getAnswer2();
            countAnswers++;
        }
        if (answer.getAnswer3() != null){
            answerModel.setAnswer3(answer.getAnswer3());
            avg =+ answer.getAnswer3();
            countAnswers++;
        }
        if (answer.getAnswer4() != null){
            answerModel.setAnswer4(answer.getAnswer4());
            avg =+ answer.getAnswer4();
            countAnswers++;
        }
        if (answer.getAnswer5() != null){
            answerModel.setAnswer5(answer.getAnswer5());
            avg =+ answer.getAnswer5();
            countAnswers++;
        }
        if (answer.getAnswer6() != null){
            answerModel.setAnswer6(answer.getAnswer6());
            avg =+ answer.getAnswer6();
            countAnswers++;
        }
        if (answer.getAnswer7() != null){
            answerModel.setAnswer7(answer.getAnswer7());
            avg =+ answer.getAnswer7();
            countAnswers++;
        }
        if (answer.getAnswer8() != null){
            answerModel.setAnswer8(answer.getAnswer8());
            avg =+ answer.getAnswer8();
            countAnswers++;
        }
        if (answer.getAnswer9() != null){
            answerModel.setAnswer9(answer.getAnswer9());
            avg =+ answer.getAnswer9();
            countAnswers++;
        }
        if (answer.getAnswer10() != null){
            answerModel.setAnswer10(answer.getAnswer10());
            avg =+ answer.getAnswer10();
            countAnswers++;
        }
        if (answer.getAnswer11() != null){
            answerModel.setAnswer11(answer.getAnswer11());
            avg =+ answer.getAnswer11();
            countAnswers++;
        }
        answerModel.setAvg(avg/countAnswers);
        answerModel.setExtra(answer.getExtra());
        answerModel.setLecturer(answer.getLecturer());


        return answerModel;
    }
    public AnswerModel(String lecturer,
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
                       Byte answer11,
                       double avg) {
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
        this.avg = avg;
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

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }
}
