package Exercise1;
public class Life extends Insurance {

    public Life(){
        super("Life");
    }

    public Life(double monthlyFee){
        super("Life", monthlyFee);
    }

    @Override
    public void setInsuranceCost(double insuranceCost){
        super.setMonthlyCost(insuranceCost);
    }

    @Override
    public void displayInfo(){
        System.out.println("\nInsurance Info:");
        System.out.println("----------------");
        System.out.println("Insurance Type: " + getTypeOfInsurance() + " Insurance");
        System.out.printf("Monthly Cost: $%.2f%n", getMonthlyCost());
    }
}
