package Exercise1;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class InsuranceDriver {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args){
        List<Insurance> insuranceList = new ArrayList<Insurance>();

        boolean isValid = true;
        do {
            String typeOfInsurance = getInputTypeOfInsurance();
            double monthlyCost = getInputMonthlyCost();

            switch(typeOfInsurance) {
                case "life":
                    Life newLifeInsurance = new Life(monthlyCost);
                    newLifeInsurance.displayInfo();
                    insuranceList.add(newLifeInsurance);
                    break;

                case "health":
                    Health newHealthInsurance = new Health(monthlyCost);
                    newHealthInsurance.displayInfo();
                    insuranceList.add(newHealthInsurance);
                    break;
            }

            System.out.println("\nWould You Like To Add A New Insurance? 'y' or 'n'");

            if ((scan.next()).equals("n")) {
                isValid = false;
            }
            System.out.println();

        } while(isValid);

        for(Insurance currentInsurance : insuranceList) {
            currentInsurance.displayInfo();
            System.out.printf("Set Insurance Cost $%.2f%n", currentInsurance.getMonthlyCost());
            currentInsurance.setInsuranceCost((currentInsurance.getMonthlyCost()));
        }

        scan.close();
    }

    public static String getInputTypeOfInsurance() {

        String typeOfInsurance;

        boolean isTypeOfInsuranceValid = false;

        do {
            System.out.println("Enter The Type Of Insurance: 1 - Life or  2 - Health");
            typeOfInsurance = scan.nextLine().toLowerCase();

            if(typeOfInsurance.equals("1") || typeOfInsurance.equals("Life")) {
                typeOfInsurance = "life";
                isTypeOfInsuranceValid = true;

            } else if(typeOfInsurance.equals("2") || typeOfInsurance.equals("Health")) {
                typeOfInsurance = "health";
                isTypeOfInsuranceValid = true;

            } else {
                System.out.println("Use the numbers (1 or 2) or the name ( 'life' or 'health')\n");
            }
        } while(!isTypeOfInsuranceValid);

        return typeOfInsurance;
    }

    public static double getInputMonthlyCost() {

        double monthlyCost = 0;
        System.out.print("Enter the insurance monthly cost: ");

        boolean isValid = false;
        while(!isValid) {
            if(scan.hasNextDouble()) {
                monthlyCost = scan.nextDouble();
                isValid = true;
            } else {
                System.out.println("\nFormat should be x,xxx,xx. Please try again.");
                scan.next();
            }
        }
        return monthlyCost;
    }


}
