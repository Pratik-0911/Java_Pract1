package Task;

public class ReverseArray {
    public static void main(String args[]){
        int[] array = {41, 52, 33, 84, 56};
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
