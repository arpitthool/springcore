package org.springcore.study;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Test {

    // using @Qualifier we can specify the bean name, this should be used with @Autowired
    // else it may cause errors
    @Autowired
    @Qualifier("question1")
    private Question question;
    private String name;
    private int totalMarks;
    private String date;
    private String totalQuestions;

    private int duration;

    /*
    getter and setter
     */

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTotalQuestions() {
        return totalQuestions;
    }

    public void setTotalQuestions(String totalQuestions) {
        this.totalQuestions = totalQuestions;
    }

    /*
    constructors
     */

    public Test() {
    }

    public Test(String name, int totalMarks, String date, String totalQuestions, int duration) {
        this.name = name;
        this.totalMarks = totalMarks;
        this.date = date;
        this.totalQuestions = totalQuestions;
        this.duration = duration;
    }

    public Test(Question question, String name, int totalMarks, String date, String totalQuestions) {
        this.question = question;
        this.name = name;
        this.totalMarks = totalMarks;
        this.date = date;
        this.totalQuestions = totalQuestions;
    }

    /*
    class methods
     */

    @Override
    public String toString() {
        return "\nTest{" +
                "question=" + question +
                ", name='" + name + '\'' +
                ", totalMarks=" + totalMarks +
                ", date='" + date + '\'' +
                ", totalQuestions='" + totalQuestions + '\'' +
                '}';
    }
}
