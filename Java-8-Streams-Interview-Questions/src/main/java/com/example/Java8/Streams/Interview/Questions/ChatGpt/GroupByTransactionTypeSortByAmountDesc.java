package com.example.Java8.Streams.Interview.Questions.ChatGpt;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class GroupByTransactionTypeSortByAmountDesc {
    public static void main(String[] args) {

        List<Transaction> transactions = Arrays.asList(
                new Transaction("Food", 50.0),
                new Transaction("Entertainment", 100.0),
                new Transaction("Food", 30.0),
                new Transaction("Bills", 200.0),
                new Transaction("Entertainment", 75.0),
                new Transaction("Food", 90.0)
        );

        System.out.println(transactions.stream().collect(Collectors.groupingBy(Transaction::getType, Collectors.collectingAndThen(
                Collectors.toList(), list->list.stream().sorted(Comparator.comparing(Transaction::getAmount).reversed()).toList()


        ))));

    }
}
