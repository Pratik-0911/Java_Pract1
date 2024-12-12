package com.example.Java8.Streams.Interview.Questions.Naveen_AutomationLabs;

import java.util.Arrays;
import java.util.List;

public class SquareFilterandAverageOfNumbers {
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7);
        double result = list.stream()
                .map(e -> e * 2)              // Double each element
                .mapToInt(a -> a)             // Convert to primitive int
                .average()                    // Calculate average
                .orElse(0.0);           // Default to 0.0 if empty
        System.out.println(result);  // Output: 20.0

        double result1 = list.stream()
                .map(e -> e * 2)
                .filter(a->a>10)// Double each element
                .mapToInt(a -> a)             // Convert to primitive int
                .average()                    // Calculate average
                .orElse(0.0);           // Default to 0.0 if empty
        System.out.println(result1);

    }


}
