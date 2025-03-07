package com.example.Java8.Streams.Interview.Questions.LeetCode;

public class RecursiveEx {

    public static void main(String[] args) {

                int result = sum(5, 10);

                System.out.println(result);
            }
            public static int sum(int start, int end) {

                if (end > start) {
                    int value=end + sum(start, end - 1);
                    System.out.println(value);
                    return value;
                } else {
                    return end;
                }
            }
        }
