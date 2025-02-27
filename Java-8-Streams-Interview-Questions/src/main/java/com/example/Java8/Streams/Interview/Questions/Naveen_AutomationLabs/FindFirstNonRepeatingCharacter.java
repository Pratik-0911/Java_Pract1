package com.example.Java8.Streams.Interview.Questions.Naveen_AutomationLabs;

import java.awt.*;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepeatingCharacter {

    public static void main(String[] args) {

        String input="Java  Articles are Awesome";

         Character result=input.chars().mapToObj(value-> Character.toLowerCase((char) value))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(val->val.getValue()==1L)
                 .map(Map.Entry::getKey)
                 .findFirst()
                 .get();

        System.out.println(result);

        anotherWayToHandle(input);
    }

    public static void anotherWayToHandle(String input)
    {
        Character result=input.toLowerCase().chars().mapToObj(value-> (char)value).
                filter(ch-> input.indexOf(ch) == input.lastIndexOf(ch))
                .findFirst()
                .get();

        System.out.println(result);
    }


}
