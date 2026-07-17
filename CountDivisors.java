import java.util.Scanner;

public class CountDivisors {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        int N = sc.nextInt();

        // Variable to count the number of divisors
        int count = 0;

        // Check all numbers from 1 to N
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                count++;   // Increment count when a divisor is found
            }
        }

        // Display the total number of divisors
        System.out.println("Total number of divisors of " + N + " is: " + count);

        // Close the Scanner
        sc.close();
    }
}