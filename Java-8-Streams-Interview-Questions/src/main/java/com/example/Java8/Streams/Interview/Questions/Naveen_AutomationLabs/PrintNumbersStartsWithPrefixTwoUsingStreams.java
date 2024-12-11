package com.example.Java8.Streams.Interview.Questions.Naveen_AutomationLabs;


import java.util.Arrays;
import java.util.List;

// Print Numbers Starts With Prefix 2 using Streams
public class PrintNumbersStartsWithPrefixTwoUsingStreams {

    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(1,-2,3,4,5,6,7);

        List<Integer> result=list.stream().map(String::valueOf).filter(e->e.startsWith("2")|| e.startsWith("-2")).map(Integer::valueOf).toList();
        System.out.println(result);

        List<Integer> result1 = list.stream()
                .filter(e -> Integer.toString(e).startsWith("2") || Integer.toString(e).startsWith("-2"))  // Filter integers that start with "2"
                .toList();  // Collect the result as a List

        System.out.println(result1);
    }
}
