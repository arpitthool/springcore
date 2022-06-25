package org.springcore.faculty;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TeachingAssistant implements InitializingBean, DisposableBean {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("\ninside setter TA");
        this.name = name;
    }

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
        return "\nTeachingAssistant{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        // this is the init method in InitializingBean
        System.out.println("\nA new teaching assistant is starting their term with us. Hello! "+this.name);
    }

    @Override
    public void destroy() throws Exception {
        // this is the destroy method in DisposableBean
        System.out.println("\nA teaching assistant is ending their term with us. Goodbye! "+this.name);
    }

    public void myInit() throws Exception {
        System.out.println("\nmyinit");
    }

    public void myDestroy() throws Exception {
        System.out.println("\nmyDestroy");
    }

    @PostConstruct
    public void myInitAnnotation() throws Exception {
        System.out.println("\nmyInitAnnotation()");
    }

    @PreDestroy
    public void myDestroyAnnotation() throws Exception {
        System.out.println("\nmyDestroyAnnotation()");
    }
}
