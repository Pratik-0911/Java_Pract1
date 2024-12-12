package com.example.Java8.Streams.Interview.Questions.Naveen_AutomationLabs;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//Print Sum Of All Numbers
public class PrintSumOfAllNumbers {

    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7);

       Integer result=list.stream().reduce(Integer::sum).get();
        System.out.println(result);




    }
}
