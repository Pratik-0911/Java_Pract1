package Task;

public class prime_1_100 {
    public static void main(String[] args) {
        System.out.print("Prime Numbers between 1 to 100: ");
        for (int num = 2; num <= 100; num++) {
            boolean isPrime = true;
            for (int i = 2; i <= num/2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}