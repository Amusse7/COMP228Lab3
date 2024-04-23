package Exercise3;

import java.util.Scanner;

public class ProcessMortgage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double currentInterestRate = PrimeRates.getCurrentPrimeRate();

        Mortgage[] mortgages = new Mortgage[3];
        boolean continueEntering = true;
        int mortgageCount = 0;

        while (continueEntering && mortgageCount < 3) {
            System.out.println("Enter mortgage type (1 for Business, 2 for Personal): ");
            int mortgageType = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Enter customer name: ");
            String customerName = scanner.nextLine();
            System.out.print("Enter mortgage amount: ");
            double amount = scanner.nextDouble();
            System.out.print("Enter term (1 for Short, 3 for Medium, 5 for Long): ");
            int term = scanner.nextInt();

            if (mortgageType == 1)
                mortgages[mortgageCount] = new BusinessMortgage(mortgageCount + 1, customerName, amount, term);
            else
                mortgages[mortgageCount] = new PersonalMortgage(mortgageCount + 1, customerName, amount, term);

            mortgageCount++;

            System.out.print("Do you want to enter another mortgage? (Y/N): ");
            String choice = scanner.next();
            continueEntering = choice.equalsIgnoreCase("Y");
        }

        System.out.println("\n--- Mortgages ---");
        for (Mortgage mortgage : mortgages) {
            if (mortgage != null) {
                mortgage.setInterestRate(currentInterestRate); // Set the current interest rate for each mortgage
                mortgage.getMortgageInfo();
                System.out.println("Monthly Payment: $" + String.format("%.2f", mortgage.calculateMonthlyPayment()) + "\n");
            }
        }
    }
}
