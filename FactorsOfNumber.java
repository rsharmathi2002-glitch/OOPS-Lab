import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number: ");

        // Read the number
        int N = sc.nextInt();

        // Print the factors of N
        System.out.println("Factors of " + N + " are:");

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                System.out.println(i);
            }
        }

        // Close the Scanner
        sc.close();
    }
}