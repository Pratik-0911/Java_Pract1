package com.example.Java8.Streams.Interview.Questions.ChatGpt;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupAndCountOccurences {

    public static void main(String[] args) {

          List<String> words = Arrays.asList("apple", "banana", "apple", "kiwi", "banana", "apple");

         Map<String, Long> result= words.stream().collect(Collectors.groupingBy(word-> word, Collectors.counting()));




        System.out.println(result);

    }
}
