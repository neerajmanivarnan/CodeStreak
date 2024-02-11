import java.util.Scanner;

public class fancyNumSol2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        int numNumbers = scanner.nextInt();

       
        int fancyCount = 0;
        int[] fancyNumbers = new int[numNumbers];

    
        for (int i = 0; i < numNumbers; i++) {
            int number = scanner.nextInt();

            
            if (isFancyNumber(number)) {
                fancyNumbers[fancyCount++] = number;
            }
        }

       
        System.out.println(fancyCount);
        for (int i = 0; i < fancyCount; i++) {
            System.out.println(fancyNumbers[i]);
        }

        scanner.close();
    }

  
    public static boolean isFancyNumber(int number) {
        int numDigits = String.valueOf(number).length();

        
        int firstDigit = number / (int) Math.pow(10, numDigits - 1);
        int lastDigit = number % 10;

        
        return firstDigit != 0 && lastDigit != 0 && isMiddleZero(number, numDigits);
    }

   
    public static boolean isMiddleZero(int number, int numDigits) {
        for (int i = 1; i < numDigits - 1; i++) {
            if (number / (int) Math.pow(10, numDigits - i - 1) % 10 != 0) {
                return false;
            }
        }
        return true;
    }
}
