import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter an integer: ");

        // Read the number
        int number = sc.nextInt();

        // Check if the number is even or odd
        if (number % 2 == 0) {
            System.out.println(number + " is an Even number.");
        } else {
            System.out.println(number + " is an Odd number.");
        }

        // Close the Scanner
        sc.close();
    }
}