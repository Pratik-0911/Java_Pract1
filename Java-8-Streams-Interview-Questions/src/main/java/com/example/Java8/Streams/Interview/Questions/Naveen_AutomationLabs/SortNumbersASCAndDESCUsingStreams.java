package com.example.Java8.Streams.Interview.Questions.Naveen_AutomationLabs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortNumbersASCAndDESCUsingStreams {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,6,2,1,4,0,1,3,2,10,9,8);

        List<Integer> asendingOrder=list.stream().sorted().toList();

        List<Integer> descendingOrder=list.stream().sorted(Collections.reverseOrder()).toList();

        List<Integer> descendingOrder1=list.stream().sorted((a,b)->b.compareTo(a)).toList();
        List<Integer> asendingOrder1=list.stream().sorted().toList();

        System.out.println("2nd Way asendingOrder: "+asendingOrder1+" descending Order: "+descendingOrder1);
        System.out.println(" asendingOrder: "+asendingOrder+" descending Order: "+descendingOrder);
    }
}
