package com.example.Java8.Streams.Interview.Questions.ChatGpt;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacterInString {

    public static void main(String[] args) {

        String input = "swiss";

        System.out.println(input.chars().mapToObj(s->(char)s)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e-> e.getValue()==1)
                .map(Map.Entry::getKey)
                .findFirst()
                .get());
    }
}
