import java.util.Scanner;

public class PrintInteger {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Read an integer from the user
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        // Display the entered integer
        System.out.println("Entered value: " + n);

        // Close the Scanner
        sc.close();
    }
}