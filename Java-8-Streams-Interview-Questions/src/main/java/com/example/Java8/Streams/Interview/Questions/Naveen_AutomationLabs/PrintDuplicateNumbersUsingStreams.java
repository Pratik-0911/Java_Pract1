package com.example.Java8.Streams.Interview.Questions.Naveen_AutomationLabs;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;


// Print Duplicate Numbers using Streams
public class PrintDuplicateNumbersUsingStreams {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 2, 3, 4, 5);
//        List<Integer> list1=new CopyOnWriteArrayList<>();
//        list1.add(1);
//        list1.add(2);
//        list.stream().limit(1).forEach(System.out::println);
//        list.parallelStream().forEachOrdered(System.out::println);
        Set<Integer> result = list.stream().filter(e -> Collections.frequency(list, e) > 1).collect(Collectors.toSet());
        System.out.println(result);
//        for(int i :list1)
//        {
//            list1.add(20);
////            System.out.println(list1);
////            System.out.println(i);
////
//        }

        Set<Integer> seen = new HashSet<>();
//        System.out.println(seen.add(1));
//        System.out.println(seen.add(1));
        Set<Integer> duplicates =
                list.stream().filter(e -> !seen.add(e))
//                .forEach(System.out::println);// If add() returns false, the element is a duplicate
                        .collect(Collectors.toSet());
        System.out.println(duplicates);
        String str = "bdsaascm";
        String ans = "";
        int max = 0;
        for (int i = 0; i < str.length(); i++) {
            String s = str.substring(i);
            while (s.length() != 0) {
                s = s.substring(0, s.lastIndexOf(str.charAt(i)) + 1);
                if (isPalindrome(s)) {
                    if (max < s.length()) {
                        max = s.length();
                        ans = s;

                    }
                    break;
                } else {
                    s = s.substring(0, s.lastIndexOf(str.charAt(i)));
                }
            }
        }
        System.out.println(ans);

        justToCheck();


    }

    private static void justToCheck() {
        List<Integer> list=Arrays.asList(1,2,8,9);


    }

    private static boolean isPalindrome(String s) {
        if (s.length() == 0 || s.length() == 1) return true;
        else if (s.charAt(0) == s.charAt(s.length() - 1)) return isPalindrome(s.substring(1, s.length() - 1));
        else return false;
    }

}
