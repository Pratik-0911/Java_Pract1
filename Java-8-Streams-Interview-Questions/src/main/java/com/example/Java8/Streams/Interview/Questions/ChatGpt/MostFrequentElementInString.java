package com.example.Java8.Streams.Interview.Questions.ChatGpt;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostFrequentElementInString {
    public static void main(String[] args) {


        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");

        String value= words.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get()
                .getKey();


        System.out.println(value);
        System.out.println(words.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
    }




}
