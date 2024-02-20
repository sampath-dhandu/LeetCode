package com.sampath;

import java.util.ArrayList;
import java.util.List;

public class EmployeeSalary {

       private String name;
       private double salary;

       public EmployeeSalary(String name, double salary) {
           this.name = name;
           this.salary = salary;
       }

    public static void main(String[] args) {
        EmployeeSalary employee = new EmployeeSalary("sampath", 10000.00);
        EmployeeSalary employee1 = new EmployeeSalary("swapna", 5000.00);
        EmployeeSalary employee2 = new EmployeeSalary("gowtham", 8000.00);
        EmployeeSalary employee3 = new EmployeeSalary("vihaan", 2000.00);

        List<EmployeeSalary> listOfEmployees= new ArrayList<>();
        listOfEmployees.add(employee);
        listOfEmployees.add(employee1);
        listOfEmployees.add(employee2);
        listOfEmployees.add(employee3);

        listOfEmployees.stream()
                .filter(p ->p.salary> 9000)   // filtering price
                .map(pm ->pm.salary)          // fetching price
                .forEach(System.out::println);  // iterating price

        if(1 + 1 + 1 + 1 + 1 == 5){
            System.out.print("TRUE");
        }
        else{
            System.out.print("FALSE");
        }

    }

}
