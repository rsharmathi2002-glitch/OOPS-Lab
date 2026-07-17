import java.util.Scanner;

public class FindFactors {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Read input from the user
        System.out.print("Enter a number: ");
        int N = sc.nextInt();

        // Display the factors
        System.out.println("Factors of " + N + " are:");

        // Find and print all factors
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                System.out.println(i);
            }
        }

        // Close the Scanner
        sc.close();
    }
}