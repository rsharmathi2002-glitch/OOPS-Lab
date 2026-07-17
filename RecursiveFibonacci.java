import java.util.Scanner;

public class RecursiveFibonacci {

    // Recursive method to calculate the nth Fibonacci number
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
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Display the nth Fibonacci number
        System.out.println("Fibonacci number: " + fib(n));

        sc.close();
    }
}