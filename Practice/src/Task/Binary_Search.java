package Task;

public class Binary_Search {

        public static int binarySearch(int[] arr, int ele) {
            int left = 0, right = arr.length - 1;

            while (left <= right) {
                int mid = (left + right)  / 2;

                if (arr[mid] == ele)
                    return mid;

                if (arr[mid] < ele)
                    left = mid + 1;

                else
                    right = mid - 1;
            }

            return -1;
        }
    public static void main(String[] args) {
        int[] numbers = {2, 4, 10, 23, 36, 50, 75};
        int ele = 23;

        int result = binarySearch(numbers, ele);

        if (result == -1)
            System.out.println("not found.");
        else
            System.out.println( result);
    }

    }
