public class SearchNumber {
    public static void main(String[] args) {

        // Array of numbers
        int[] numbers = {2, 4, 6, 7, 9};

        // Number to search
        int target = 7;

        // Boolean flag
        boolean isFound = false;

        // Search for the target number
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                isFound = true;
                break;   // Exit the loop once the number is found
            }
        }

        // Display the result
        if (isFound) {
            System.out.println(target + " is found in the array.");
        } else {
            System.out.println(target + " is not found in the array.");
        }
    }
}