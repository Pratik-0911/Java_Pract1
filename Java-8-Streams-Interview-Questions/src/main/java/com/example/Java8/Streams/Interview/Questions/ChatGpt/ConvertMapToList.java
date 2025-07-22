package com.example.Java8.Streams.Interview.Questions.ChatGpt;

import java.util.Arrays;
import java.util.Comparator;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConvertMapToList
{

    public static void main(String[] args) {

        Map<String, Integer> map = Map.of("A", 1, "B", 2, "C", 3);

        System.out.println(map.entrySet().stream()
                        .sorted(Map.Entry.comparingByKey())
                .map(entry->entry.getKey()+"="+entry.getValue()).toList());

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4));

//        for(Integer i:list)
//        {
//            System.out.println(i);
//            list.add(2);
//        }

        CopyOnWriteArrayList<Integer> list1 = new CopyOnWriteArrayList<>(Arrays.asList(1, 2, 3, 4));
        for(Integer i:list1)
        {
            System.out.println(i);
            list.add(2);
        }



    }


}
