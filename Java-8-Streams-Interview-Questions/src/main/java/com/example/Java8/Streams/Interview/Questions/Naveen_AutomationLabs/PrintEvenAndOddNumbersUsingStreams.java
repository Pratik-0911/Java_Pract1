package com.example.Java8.Streams.Interview.Questions.Naveen_AutomationLabs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Print Even & Odd Numbers using Streams
public class PrintEvenAndOddNumbersUsingStreams {

    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7);

        Map<Boolean, List<Integer>> result=list.stream().collect(Collectors.partitioningBy(e->e%2==0));

        System.out.println("Even numbers: "+result.get(true)+" Odd Numbers: "+result.get(false));
    }
}
