package org.springcore.study;

public class Question {
    private String question;
    private String answer;
    private String type;

    /*
    getter and setter
     */

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /*
    constructors
     */

    public Question() {
    }

    public Question(String question, String answer, String type) {
        this.question = question;
        this.answer = answer;
        this.type = type;
    }

    /*
    class methods
     */

    @Override
    public String toString() {
        return "\nQuestion{" +
                "question='" + question + '\'' +
                ", ans='" + answer + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
