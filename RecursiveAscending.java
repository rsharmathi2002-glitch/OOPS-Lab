import java.util.Scanner;

public class RecursiveAscending {

    // Recursive method
    public static void printNumbers(int n) {
        // Base case
        if (n == 0) {
            return;
        }

        // Recursive call
        printNumbers(n - 1);

        // Print the current number
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Call the recursive method
        printNumbers(n);

        sc.close();
    }
}