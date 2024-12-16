package com.example.Java8.Streams.Interview.Questions.Naveen_AutomationLabs;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SecondHighestAndLowestNumberUsingStreams {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(5,6,2,1,4,0,1,3,2,10,9,8);

        Integer secondHighest=list.stream().sorted(Collections.reverseOrder()).skip(1).findFirst().orElse(0);

        System.out.println("2nd highest in the list: "+secondHighest);

        Integer secondLowest=list.stream().sorted().skip(1).findFirst().orElse(0);

        System.out.println("2nd Lowest in the list: "+secondLowest);

        System.out.println(list.stream().flatMap(a->Collections.nCopies(a,"Hello "+a.toString()).stream()).toList());



    }
}
