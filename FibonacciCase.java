import java.util.Scanner;

public class FibonacciCase {

    // Recursive method to return Fibonacci value
    public static int fib(int n) {
        // Base cases
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        // Recursive call
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Display the Fibonacci value
        System.out.println("fib(" + n + ") = " + fib(n));

        sc.close();
    }
}