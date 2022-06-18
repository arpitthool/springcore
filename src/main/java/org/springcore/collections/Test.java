package org.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Employee/semester.xml");
        Employee employee1 = (Employee) context.getBean("Employee1");
        System.out.println(employee1.getName());
        System.out.println(employee1.getPhones());
        System.out.println(employee1.getAddresses());
        System.out.println(employee1.getCourses());

        Employee employee2= (Employee) context.getBean("Employee2");
        System.out.println(employee2.getName());
        System.out.println(employee2.getPhones());
        System.out.println(employee2.getAddresses());
        System.out.println(employee2.getCourses());
    }
}
