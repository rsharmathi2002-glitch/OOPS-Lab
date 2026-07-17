import java.util.Scanner;

public class RecursiveFactorial {

    // Recursive method to calculate factorial
    public static int factorial(int n) {
        // Base case
        if (n == 0 || n == 1) {
            return 1;
        }

        // Recursive call
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Display the factorial
        System.out.println("Factorial: " + factorial(n));

        sc.close();
    }
}