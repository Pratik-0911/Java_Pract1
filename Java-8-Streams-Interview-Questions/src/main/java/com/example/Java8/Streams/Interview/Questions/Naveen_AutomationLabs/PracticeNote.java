package com.example.Java8.Streams.Interview.Questions.Naveen_AutomationLabs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class PracticeNote {
    public static void main(String[] args) {

        int[] a={1,4,3,2};

        System.out.println(Arrays.stream(a).boxed().sorted(Comparator.naturalOrder()).toList());

        System.out.println(Arrays.stream(a).boxed().sorted(Comparator.reverseOrder()).toList());

    }
}
