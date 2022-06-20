package org.springcore.faculty;

public class TeachingAssistant {
    private String name;

    /*
    Constructor
     */

    public TeachingAssistant(String name) {
        this.name = name;
    }

    /*
    Class methods
     */

    @Override
    public String toString() {
        return "TeachingAssistant{" +
                "name='" + name + '\'' +
                '}';
    }
}
