package com.example.Java8.Streams.Interview.Questions.BasicCodingQuestions;

public class PrimeNumber {


        public static boolean isPrime(int num) {
            if (num <= 1) return false;
            System.out.println("Square root of num: "+Math.sqrt(num));
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) return false;
            }
            return true;
        }

        public static void main(String[] args) {
            System.out.println(isPrime(100));  // Output: true
        }
    }

