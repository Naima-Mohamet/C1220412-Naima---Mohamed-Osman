import java.util.*;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        boolean isPrime;

        for (;;) {
            System.out.print("Please enter a number: ");
            number = scanner.nextInt();

            isPrime = true;

            if (number <= 1) {
                isPrime = false;
            }
            else {
                for (int i = 2; i <= number / 2; i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                System.out.println("This " + number + " is prime number.");
                break;
            } else {
                System.out.println("This " + number + " is not prime, Please retry another time.");
            }
        }
    }
}
