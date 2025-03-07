package com.example.Java8.Streams.Interview.Questions.AskedInInterview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SeparateMailsBasedOnCompany {

    public static void main(String[] args) {

        String[] list={"ravi@gmail.com", "naveen@yahoo.com", "sham@hotmail.com"};



        Map<String, List<String>> emailMap = Arrays.stream(list)
                .collect(Collectors.groupingBy(email -> email.split("@")[1].split("\\.")[0]));

        System.out.println(emailMap);

        String[] str={"fish.txt", "animal.txt"};

        for(String val:str)
        {
            String[] result=val.split("\\.");
            System.out.println(Arrays.toString(result));
        }






    }
}
