package org.springcore.faculty;

import org.springcore.App;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("faculty/professor.xml");
        // AbstractApplicationContext context = new ClassPathXmlApplicationContext("faculty/professor.xml");

        Professor professor1 = (Professor) context.getBean("professor1");
        Professor professor2 = (Professor) context.getBean("professor2");
        Professor professor3 = (Professor) context.getBean("professor3");
        Professor professor4 = (Professor) context.getBean("professor4");

        System.out.println(professor1.toString());
        System.out.println(professor2.toString());
        System.out.println(professor3.toString());
        System.out.println(professor4.toString());

        // registering shut down hook
        // context.registerShutdownHook();
    }
}
