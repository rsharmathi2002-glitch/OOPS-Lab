import java.util.Scanner;

public class FibbonacciSeries {

    // Recursive method to find the nth Fibonacci number
    public static int fib(int n) {
        // Base cases
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        // Recursive calls
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        // Print Fibonacci series from 0th to nth term
        System.out.println("Fibonacci Series:");
        for (int i = 0; i <= n; i++) {
            System.out.print(fib(i) + " ");
        }

        sc.close();
    }
}