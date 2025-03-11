package com.example.Java8.Streams.Interview.Questions.MediumWebsite;

//Question:
//How to convert a List of objects into a Map by considering duplicated keys and store them in sorted order?

import com.example.Java8.Streams.Interview.Questions.MediumWebsite.dto.Notes;

import java.util.*;
import java.util.stream.Collectors;

public class ConvertListToMapWithDuplicatedKeys {

    public static void main(String[] args) {

        List<Notes> noteLst = new ArrayList<>();
        noteLst.add(new Notes(1, "note1", 11));
        noteLst.add(new Notes(2, "note2", 22));
        noteLst.add(new Notes(3, "note3", 33));
        noteLst.add(new Notes(4, "note4", 44));
        noteLst.add(new Notes(5, "note5", 55));

        noteLst.add(new Notes(6, "note6", 66));

        Map<String, Integer> result=noteLst.stream().sorted(Comparator.comparingLong(Notes::getTagId).reversed())
                .collect(Collectors.toMap(Notes::getTagName, Notes::getTagId, (oldValue, newValue)->oldValue, LinkedHashMap::new));

        System.out.println(result);

        Map<String, Integer> result1=noteLst.stream()
                .collect(Collectors.toMap(Notes::getTagName, Notes::getTagId));
        System.out.println(result1);

        practice();


    }

    private static void practice()
    {

        List<Notes> noteLst = new ArrayList<>();
        noteLst.add(new Notes(1, "note1", 11));
        noteLst.add(new Notes(2, "note2", 22));
        noteLst.add(new Notes(3, "note3", 33));
        noteLst.add(new Notes(4, "note4", 44));
        noteLst.add(new Notes(5, "note5", 55));

        noteLst.add(new Notes(6, "note6", 66));


        Map<String, Integer> value=noteLst.stream().sorted(Comparator.comparing(Notes::getTagId).reversed()).collect(Collectors.toMap(Notes::getTagName, Notes::getTagId, (oldvalue, newValue)->oldvalue, LinkedHashMap::new));

        System.out.println(value);







    }

}
