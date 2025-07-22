package Task;
import java.util.*;
public class duplicatarray {
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 2, 4, 5, 1,2 };

            for (int i = 0; i < arr.length; i++) {
                int k=0;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        k++;
                        arr[j]='o';


                    }
                }
                if (k>=1 && arr[i]!='o'){
                    System.out.print(arr[i] + " ");
                }
            }
        }
}
