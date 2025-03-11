package com.example.Java8.Streams.Interview.Questions.ChatGpt;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CustomCollection {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("apple", "banana", "cherry", "apple");

        TreeSet<String> customCollection= new TreeSet<>(words);

        System.out.println(customCollection);

        System.out.println(IntStream.range(2,10).boxed().collect(Collectors.toList()));

        int[] arr={1,3,5,6,8};

        System.out.println(Arrays.stream(arr).boxed().min(Comparator.comparingLong(e->e)).get());


        System.out.println(Arrays.stream(arr).count());
    }
}
