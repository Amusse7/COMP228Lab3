package Exercise3;

import java.util.Scanner;

public class PrimeRates {
    private static Scanner scanner = new Scanner(System.in);
    private static double currentPrimeRate = -1; // Initialize to a negative value as an indicator

    public static double getCurrentPrimeRate() {
        if (currentPrimeRate == -1) { // If prime rate hasn't been set yet
            System.out.print("Enter the current prime rate: ");
            currentPrimeRate = scanner.nextDouble();
        }
        return currentPrimeRate;
    }
}
