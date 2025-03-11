package com.example.Java8.Streams.Interview.Questions.BasicCodingQuestions;

import java.util.Arrays;

public class FindMissingNumberInArray {

    public static void main(String[] args) {

        int[] a={1,2,4,5};

        int val=1;
        for (int i=0;i<a.length;i++)
        {
            if(val==a[i])
                val++;
        }
        System.out.println(val);

//        anotherWayToSolve(a);

    }


}
