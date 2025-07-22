package ArrayList;
import java.util.*;

public class sort {
    public static void main(String args[]){
        ArrayList <Integer> Num = new ArrayList<>();
        Num.add(7);
        Num.add(2);
        Num.add(23);
        Num.add(4);
        Num.add(12);
        System.out.println(Num);
        Collections.sort(Num);
        System.out.println(Num);
        Collections.sort(Num,Collections.reverseOrder());
        System.out.println(Num);



    }
}
