import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {

        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter an integer
        System.out.print("Enter an integer: ");

        // Read the integer
        int number = sc.nextInt();

        // Print the entered integer
        System.out.println("You entered: " + number);

        // Close the Scanner
        sc.close();
    }
}