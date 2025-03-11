package com.example.Java8.Streams.Interview.Questions.MediumWebsite;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;



public class ConcatInStreams {

    public static void main(String[] args) {

        List<String> list2 = Arrays.asList("explained", "through", "programs");

        List<String> list1 = Arrays.asList("Java", "8");

        Stream<String> result=Stream.concat(list1.stream(),list2.stream());
        System.out.println(result.toList());

        practice();


    }

    private static void practice()
    {
        List<String> list2 = Arrays.asList("explained", "through", "programs");

        List<String> list1 = Arrays.asList("Java", "8");

        System.out.println(Stream.concat(list1.stream(),list2.stream()).sorted().toList());
    }


}
