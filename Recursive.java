import java.util.Scanner;

public class Recursive {

    // Recursive method
    public static void countdown(int n) {
        // Base case
        if (n == 0) {
            return;
        }

        // Print the current number
        System.out.println(n);

        // Recursive call
        countdown(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Call the recursive method
        countdown(n);

        sc.close();
    }
}