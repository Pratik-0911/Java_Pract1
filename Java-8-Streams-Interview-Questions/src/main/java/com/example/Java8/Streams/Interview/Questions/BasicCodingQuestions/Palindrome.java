package com.example.Java8.Streams.Interview.Questions.BasicCodingQuestions;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Palindrome or not: "+checkPalindrome("absa"));
    }

    private static boolean checkPalindrome(String value) {

        int right=value.length()-1, left=0;
        while(left<right)
        {
            if(value.charAt(left) != value.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

}
