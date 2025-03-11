package com.example.Java8.Streams.Interview.Questions.BasicCodingQuestions;

public class ArmStrongNumber {

    public static void main(String[] args) {

        int a=153,b=0, result=0, len=String.valueOf(a).length();

        while(a>0)
        {
            b=a%10;
            result+= (int) Math.pow(b,len);
            a=a/10;

        }
        System.out.println(result);

    }
}
