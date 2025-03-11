package com.example.Java8.Streams.Interview.Questions.Naveen_AutomationLabs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class AnyMatchEx {

    public static void main(String[] args) {

        int[] num=null;

        Set<Integer> set=new HashSet<>();

        boolean result= Arrays.stream(num).boxed().anyMatch(set::add);





    }
}
