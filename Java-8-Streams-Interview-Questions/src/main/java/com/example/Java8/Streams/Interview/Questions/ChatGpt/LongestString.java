package com.example.Java8.Streams.Interview.Questions.ChatGpt;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestString {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("apple", "banana", "strawberry", "kiwi");

        System.out.println(words.stream().max(Comparator.comparing(String::length)).get());
    }
}
