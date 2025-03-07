package com.example.Java8.Streams.Interview.Questions.MediumWebsite;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JoinToStrings {
    public static void main(String[] args) {
        String str="Fish";
        String str1="In Water";

        String result=Stream.of(str,str1).collect(Collectors.joining());
        System.out.println(result);

        //Normal way to handle

        String result1=String.join(" ",str1,str);
        System.out.println(result1);
    }
}
