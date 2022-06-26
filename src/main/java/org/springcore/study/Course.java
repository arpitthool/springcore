package org.springcore.study;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("myCourseBeanName")
public class Course {

    @Value("Spring Framework CS 501")
    private String name;

    @Autowired
    @Qualifier("test")
    private Test test;

    /*
    Getter and Setter
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*
    Constructor
     */

    public Course() {
    }

    /*
    Class Methods
     */

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", test=" + test +
                '}';
    }
}

