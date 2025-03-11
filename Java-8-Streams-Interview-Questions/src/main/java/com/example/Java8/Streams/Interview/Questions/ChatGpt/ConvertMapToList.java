package com.example.Java8.Streams.Interview.Questions.ChatGpt;

import java.util.Comparator;
import java.util.Map;

public class ConvertMapToList
{

    public static void main(String[] args) {

        Map<String, Integer> map = Map.of("A", 1, "B", 2, "C", 3);

        System.out.println(map.entrySet().stream()
                        .sorted(Map.Entry.comparingByKey())
                .map(entry->entry.getKey()+"="+entry.getValue()).toList());
    }
}
