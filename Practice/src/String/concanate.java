package String;
import java.util.*;
public class concanate {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter first string");
        String str1= sc.next();
        Scanner sc1=new Scanner(System.in);
        System.out.println("enter 2nd string");
        String str2=sc1.next();
        String join = str1.concat(str2);
        System.out.println(join);
        System.out.println(str1+str2);
    }
}
