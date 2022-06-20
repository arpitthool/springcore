package org.springcore.faculty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("faculty/professor.xml");

        Professor professor1 = (Professor) context.getBean("professor1");
        Professor professor2 = (Professor) context.getBean("professor2");
        Professor professor3 = (Professor) context.getBean("professor3");

        System.out.println(professor1.toString());
        System.out.println(professor2.toString());
        System.out.println(professor3.toString());
    }
}
