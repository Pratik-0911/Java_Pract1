package Task;
import java.util.*;
public class ReverseString {
    public static void main(String[] args) {
            String str = "Eidiko";
            String reverse = "";
            int temp=str.length();
            for (int i = temp - 1; i >= 0; i--) {
                reverse += str.charAt(i);
            }
            System.out.println(reverse);
        }
}