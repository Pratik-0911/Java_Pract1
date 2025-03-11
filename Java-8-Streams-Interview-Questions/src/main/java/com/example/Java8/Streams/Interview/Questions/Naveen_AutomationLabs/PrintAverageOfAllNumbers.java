package com.example.Java8.Streams.Interview.Questions.Naveen_AutomationLabs;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;


//Print Average Of All Numbers
public class PrintAverageOfAllNumbers {
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7);

        double result=list.stream().mapToInt(e-> e).average().orElse(0.0);
        System.out.println(result);

        practice();

    }

    private static void practice()
    {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7);

        System.out.println((int)list.stream().mapToInt(e->e)
                .average().orElse(0.0));
    }
}
