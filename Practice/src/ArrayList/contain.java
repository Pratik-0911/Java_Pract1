package ArrayList;

import java.util.ArrayList;

public class contain {
    public static void main(String args[]){
        ArrayList<Integer> Num = new ArrayList<>();
        Num.add(7);
        Num.add(2);
        Num.add(3);
        Num.add(4);
        Num.add(5);
        System.out.println(Num);
        System.out.println(Num.contains(2));
    }
}
