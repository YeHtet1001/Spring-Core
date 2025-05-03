package org.example;

import org.example.entity.Employee;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        Employee emp1 = new Employee();
        System.out.println("Not Spring Boot Application Context");
        System.out.println("Hello , "+ emp1.toString() + ".");

        BeanFactory beanFactory = new FileSystemXmlApplicationContext("Beans.xml");

        Employee employee = (Employee) beanFactory.getBean("employee");

        System.out.println("Spring With bean.xml");
        System.out.println(employee.toString());

    }

}