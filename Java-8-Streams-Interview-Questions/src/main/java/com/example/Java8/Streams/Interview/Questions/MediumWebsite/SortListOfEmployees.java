package com.example.Java8.Streams.Interview.Questions.MediumWebsite;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortListOfEmployees {
    public static void main(String[] args) {


        List<Employee> employee= Arrays.asList(new Employee(2, "Ram"),new Employee(1, "Amir"));

        System.out.println(employee.stream().sorted(Comparator.comparing(Employee::getName)).toList());

        // Reverse Order
        System.out.println(employee.stream().sorted(Comparator.comparing(Employee::getId).reversed()).toList());

    }
}
