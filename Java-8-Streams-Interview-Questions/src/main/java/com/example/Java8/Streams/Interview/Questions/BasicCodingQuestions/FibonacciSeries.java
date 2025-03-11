package com.example.Java8.Streams.Interview.Questions.BasicCodingQuestions;

public class FibonacciSeries {

    public static void fibonacci(int n) {
        int a = 0, b = 1, c;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }

    }

    public static void main(String[] args) {
       fibonacci(10);
    }
}
