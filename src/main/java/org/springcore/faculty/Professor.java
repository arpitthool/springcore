package org.springcore.faculty;

import org.springcore.Student;
import org.springcore.semester.Course;

import java.util.List;

public class Professor {
    private String name;
    private int id;
    private TeachingAssistant ta;
    private List<Course> currentCourses;

    /*
    Constructor
     */
    public Professor(String name, int id) {
        this.name = name;
        this.id = id;
        this.ta = null;
    }

    public Professor(String name, int id, TeachingAssistant ta) {
        this.name = name;
        this.id = id;
        this.ta = ta;
        this.currentCourses = null;
    }

    public Professor(String name, int id, TeachingAssistant ta, List<Course> currentCourses) {
        this.name = name;
        this.id = id;
        this.ta = ta;
        this.currentCourses = currentCourses;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", ta=" + ta +
                ", currentCourses=" + currentCourses +
                '}';
    }

    public void myInit() {
        System.out.printf("Professor is starting their term with us. Hello "+this.name);
    }

    public void myDestroy() {
        System.out.printf("Professor is ending their term with us. Good bye "+this.name);
    }


}
