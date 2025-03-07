package com.example.Java8.Streams.Interview.Questions.MediumWebsite;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class GroupByEmployeesDepartment {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(2, "Ram", "IT", 75000.00),
                new Employee(1, "Amir", "HR", 60000.00),
                new Employee(3, "John", "Finance", 80000.00),
                new Employee(4, "Ravi", "IT", 72000.50),
                new Employee(5, "Ramesh", "HR", 65000.75),
                new Employee(6, "Raju", "Finance", 85000.25)
        );


        System.out.println(employees.stream().collect(Collectors.groupingBy(Employee::getDepartment)));


        System.out.println(employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).map(Employee::getSalary).limit(3).toList());


    }
}
