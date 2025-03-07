package com.example.Java8.Streams.Interview.Questions.DataQincCompany;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ArmStrongNo {

    public static List<String> camelCase(String[] arr, String pat) {
        List<String> result=new ArrayList();

        for(String word: arr)
        {

            char[] singleWord=word.toCharArray();
            System.out.println(singleWord);
            result.add(singleWord.toString());

            // if(singleWord.)
        }
        return result;
    }
    public static void main(String[] args) {
//        IntStream nums=IntStream.of(125,);

       int n=9474,result=0,b=0;
       int len=String.valueOf(n).length();

        while(n>0)
        {
            b=n%10;
            result +=(int)Math.pow(b,len);
            n=n/10;
        }
        System.out.println(result);

       String[] arr = {"WelcomeGeek", "WelcomeToGeeksForGeeks", "GeeksForGeeks"};
       String pat = "WTG";
        camelCase(arr,pat);

        String[] check={"A","a","B","b"};
        Arrays.sort(check);
        Arrays.stream(check).forEach(System.out::println);


    }
}
