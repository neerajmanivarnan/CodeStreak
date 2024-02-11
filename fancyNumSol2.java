import java.util.Scanner;

public class fancyNumSol2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of numbers
        int numNumbers = scanner.nextInt();

        // Count the fancy numbers and store them
        int fancyCount = 0;
        int[] fancyNumbers = new int[numNumbers];

        // Iterate over each number
        for (int i = 0; i < numNumbers; i++) {
            int number = scanner.nextInt();

            // Check if the number is fancy
            if (isFancyNumber(number)) {
                fancyNumbers[fancyCount++] = number;
            }
        }

        // Print the results
        System.out.println("Total fancy numbers: " + fancyCount);
        for (int i = 0; i < fancyCount; i++) {
            System.out.println(fancyNumbers[i]);
        }

        scanner.close();
    }

    // Helper function to check if a number is fancy
    public static boolean isFancyNumber(int number) {
        int numDigits = String.valueOf(number).length();

        // Get the first and last digits
        int firstDigit = number / (int) Math.pow(10, numDigits - 1);
        int lastDigit = number % 10;

        // Return true if only first and last digits are non-zero, otherwise false
        return firstDigit != 0 && lastDigit != 0 && isMiddleZero(number, numDigits);
    }

    // Helper function to check if middle digits are all zero
    public static boolean isMiddleZero(int number, int numDigits) {
        for (int i = 1; i < numDigits - 1; i++) {
            if (number / (int) Math.pow(10, numDigits - i - 1) % 10 != 0) {
                return false;
            }
        }
        return true;
    }
}
