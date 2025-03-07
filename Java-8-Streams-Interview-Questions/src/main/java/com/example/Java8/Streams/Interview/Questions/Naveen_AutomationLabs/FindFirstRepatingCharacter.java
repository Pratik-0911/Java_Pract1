package com.example.Java8.Streams.Interview.Questions.Naveen_AutomationLabs;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstRepatingCharacter {

    public static void main(String[] args) {

        String input="Java Articles are Awesome";
        Character result=input.chars()
                .mapToObj(s->Character.toLowerCase((char) s))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(a->a.getValue()>1L)
                .map(Map.Entry::getKey)
                .findFirst()
                .get();
        System.out.println(result);

        anotherWayToHandle(input);

    }

    private static void anotherWayToHandle(String input) {

        System.out.println(input.chars().mapToObj(a->Character.toLowerCase((char)a)).filter(v->input.indexOf(v)!=input.lastIndexOf(v)).findFirst().get());

        int[] a={2,5,6};
        System.out.println(Arrays.stream(a).boxed().max(Comparator.comparing(Integer::valueOf)));

    }


}
