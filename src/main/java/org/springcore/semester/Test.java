package org.springcore.semester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Semester/semester.xml");
        Course course1 = (Course) context.getBean("course1");
        System.out.println(course1);
    }
}
