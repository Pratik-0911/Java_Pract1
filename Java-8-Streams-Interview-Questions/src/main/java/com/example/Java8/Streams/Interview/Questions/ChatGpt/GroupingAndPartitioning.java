package com.example.Java8.Streams.Interview.Questions.ChatGpt;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingAndPartitioning {

    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
                new Transaction(1, "Credit", 1500),
                new Transaction(2, "Debit", 800),
                new Transaction(3, "Credit", 2000),
                new Transaction(4, "Debit", 500)
        );

        Map<String, List<Transaction>> transaction =
                transactions.stream().collect(Collectors.groupingBy(Transaction::getType));

        System.out.println(transaction);
        Map<Boolean, List<Transaction>> transactionsPartitionBy = transactions.stream().collect(Collectors.partitioningBy(e -> e.getAmount() > 1000));

        System.out.println(transactionsPartitionBy.get(true));

        justToCheck(transactions);


    }

    private static void justToCheck(List<Transaction> transactions)
    {
        System.out.println(transactions.stream().collect(Collectors.groupingBy(Transaction::getType)).entrySet()
                .stream()
                .collect(Collectors.partitioningBy(entry-> entry.getValue().stream().anyMatch(t->t.getAmount()>1000))).get(true));


    }



}

class A{
    protected int display()
    {
        System.out.println("Hello World");
        return 0;
    }
}
class B extends A
{
    public void juctToCheck()
    {
        System.out.println(display());
    }
}


