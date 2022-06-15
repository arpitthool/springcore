package org.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );
        // dependency injections
        // the Student object is created by the IOC container
        // the IOC container manages the whole life cycle of the object, right from
        // creation to destruction.

        // we create the ApplicationContext by passing the file location where we
        // have defined our beans
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        // we get the Student object from the context.
        Student student1 = (Student) context.getBean("student1");

        System.out.println(student1);
    }
}
