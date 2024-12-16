package com.example.Java8.Streams.Interview.Questions.Naveen_AutomationLabs;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// Find Max and Min Numbers using Streams
public class FindMaxAndMinNumbersUsingStreams {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(-1, 2, 3, 4, 5, 6, 7, 2, 3, 4, 5);

        Integer maxNo = list.stream().max(Comparator.comparing(Integer::valueOf)).get();

        Integer minNo= list.stream().min(Comparator.comparing(Integer::valueOf)).get();

        System.out.println("Maximum value: "+maxNo+" Minimum Value: "+minNo);

    }
}