package org.springcore.study;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("test/test.xml");

        Test test1 = (Test) context.getBean("test1");
        System.out.println(test1);

        Test test2 = (Test) context.getBean("test2");
        System.out.println(test2);
    }
}
