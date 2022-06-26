package org.springcore.study;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;
import java.util.Properties;

public class Test {

    private String name;
    private int totalMarks;
    private String date;
    private String totalQuestions;

    @Autowired
    @Qualifier("myProperties")
    private Properties properties;


    @Autowired
    @Qualifier("myQuestionsList")
    private List<Question> questionList;
    private int duration;

    /*
    getter and setter
     */

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public List<Question> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(List<Question> questionList) {
        this.questionList = questionList;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
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

    public Test(String name, int totalMarks, String date, String totalQuestions) {
        this.name = name;
        this.totalMarks = totalMarks;
        this.date = date;
        this.totalQuestions = totalQuestions;
    }

    public Test(String name, int totalMarks, String date, String totalQuestions, Properties properties, List<Question> questionList, int duration) {
        this.name = name;
        this.totalMarks = totalMarks;
        this.date = date;
        this.totalQuestions = totalQuestions;
        this.properties = properties;
        this.questionList = questionList;
        this.duration = duration;
    }

    /*
    class methods
     */

    @Override
    public String toString() {
        return "Test{" +
                "name='" + name + '\'' +
                ", totalMarks=" + totalMarks +
                ", date='" + date + '\'' +
                ", totalQuestions='" + totalQuestions + '\'' +
                ", properties=" + properties +
                ", questionList=" + questionList +
                ", duration=" + duration +
                '}';
    }
}
