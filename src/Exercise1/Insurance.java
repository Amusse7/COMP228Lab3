package Exercise1;

public abstract class Insurance {

    public String typeOfInsurance;
    public double monthlyCost;

    public Insurance(String typeOfInsurance, double monthlyCost) {
        this.typeOfInsurance = typeOfInsurance;
        this.monthlyCost = monthlyCost;
    }

    public Insurance(String typeOfInsurance) {
        this.typeOfInsurance = typeOfInsurance;
        this.monthlyCost = 0;
    }

    //getters
    public String getTypeOfInsurance() {
        return typeOfInsurance;
    }
    public double getMonthlyCost(){
        return monthlyCost;
    }

    //setters

    public void setTypeOfInsurance(String typeOfInsurance){
        this.typeOfInsurance = typeOfInsurance;
    }

    public void setMonthlyCost(double monthlyCost) {
        this.monthlyCost = monthlyCost;
    }

    public abstract void setInsuranceCost(double insuranceCost);
    public abstract void displayInfo();
}
