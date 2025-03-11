package com.example.Java8.Streams.Interview.Questions.MediumWebsite;

import java.util.stream.Collectors;

public class StringIntoUpperCase {
    public static void main(String[] args) {

        String str="Example";

       String result= str.chars().mapToObj(s->(char)s)
                .map(s->Character.toString(Character.toUpperCase(s))).collect(Collectors.joining(""));

        System.out.println(result);

        System.out.println((1==1)+" "+(128==128));


    }
}
