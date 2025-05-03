package org.example;

import org.example.entity.Employee;

public class Main {

    public static void main(String[] args) {

        Employee emp1 = new Employee( 1 , "Noto");

        System.out.println("Hello , "+ emp1.toString() + ".");

    }

}