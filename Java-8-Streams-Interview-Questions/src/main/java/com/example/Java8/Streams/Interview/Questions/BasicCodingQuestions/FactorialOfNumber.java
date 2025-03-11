package com.example.Java8.Streams.Interview.Questions.BasicCodingQuestions;

public class FactorialOfNumber {

    public static int factorial(int n) {
        return (n == 0) ? 1 : n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));  // Output: 120
    }
}
