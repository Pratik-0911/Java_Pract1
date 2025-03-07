package com.example.Java8.Streams.Interview.Questions.GreekForGeeks;

import java.util.stream.Collectors;

public class FirstHalfUpperCaseSecondHalfLowerCase {

    public static void main(String[] args) {
        String str = "HelloWorld".toLowerCase();
        int mid = str.length() / 2; // Find the midpoint

        // Convert the string, processing each character based on its index
      String result=str.substring(0,mid).toLowerCase()+str.substring(mid).toUpperCase();
        System.out.println(result);
    }
}
