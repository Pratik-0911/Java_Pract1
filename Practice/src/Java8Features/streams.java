package Java8Features;
import java.util.*;
import java.util.Arrays;
import java.util.stream.Stream;

public class streams {
    public static void main(String args[]){
        List<Integer> l1= Arrays.asList(1,2,3,4);
        System.out.println(l1);
        Stream<Integer> s1= l1.stream();
        Stream<Integer> s2=s1.filter(n->n%2==0);
        Stream<Integer> s3=s2.map(n->n*2);
        s2.forEach(n->System.out.println(n));
        s3.forEach(n->System.out.println(n));
    }
}
