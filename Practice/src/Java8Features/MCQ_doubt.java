package Java8Features;

import java.util.function.Function;

public class MCQ_doubt {
        public static void main(String[] args) {
            Function<Integer, Integer> square = x -> x * x;
            System.out.println(square.apply(5));

        }

}
