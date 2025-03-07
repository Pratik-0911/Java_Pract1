package com.example.Java8.Streams.Interview.Questions.MediumWebsite;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WrapCheckedExceptionInRuntimeUsingStreams {


    public static void main(String[] args) {
        List<String> list= Arrays.asList("1","2","3","4","a");

//        list.stream().map(a->{
//
//            try{
//
//                return a.length();
//            }
//            catch (Exception e)
//            {
//                throw e;
//
//            }
//        }).toList();
//

//     int result=0;
//      result += 1;
//      result = result+1;
//        System.out.println(result);


//        if(false)
//        {
//            System.out.println("Hello");
//        }
//        else
//        {
//            System.out.println("World");
//        }
//        System.out.println(true?"Hello":"World");
        List<Integer> result = list.stream()
                .flatMap(item -> {
                    try {
                        return Stream.of(Integer.parseInt(item));
                    } catch (NumberFormatException e) {
                        return Stream.empty(); // Skip invalid elements
                    }
                })
                .collect(Collectors.toList());

    }


}
