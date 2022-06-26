package org.springcore.study;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("test/test.xml");
        Test test = (Test) context.getBean("test");
        System.out.println(test);
    }
}
