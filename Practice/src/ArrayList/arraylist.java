package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
public class arraylist{
    public static void main(String args[]){
        ArrayList <Integer> Num = new ArrayList<>();
        Num.add(7);
        Num.add(2);
        Num.add(3);
        Num.add(4);
        Num.add(5);
        System.out.println(Num);
        for(int i:Num){
            System.out.println(i);
        }
        Iterator<Integer>itr=Num.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}