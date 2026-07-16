import java.util.Scanner;

public class SumTon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= N; i++) {
            sum = sum + i;
        }

        System.out.println("Sum of numbers from 1 to " + N + " = " + sum);

        sc.close();
    }
}