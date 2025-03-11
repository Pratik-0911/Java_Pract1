package com.example.Java8.Streams.Interview.Questions.ChatGpt;

import java.util.Arrays;
import java.util.List;
import java.util.stream.LongStream;

public class FlatMapNestedCollections {

    public static void main(String[] args) {

        List<Employee> dept1Employees = Arrays.asList(
                new Employee(1, "John", 60000),
                new Employee(2, "Alice", 70000)
        );

        List<Employee> dept2Employees = Arrays.asList(
                new Employee(3, "Bob", 80000),
                new Employee(4, "David", 55000)
        );

        List<Department> departments = Arrays.asList(
                new Department("HR", dept1Employees),
                new Department("IT", dept2Employees)
        );

        System.out.println(departments.stream().map(dept-> dept.getEmployees().stream().filter(employee -> employee.getSalary()>60000).toList())
                               .toList()


        );

        long sum = LongStream.rangeClosed(1, 1_000_000)
                .parallel()
                .sum();

        System.out.println(sum);

        System.out.println(1_0_0_0);
    }
}
