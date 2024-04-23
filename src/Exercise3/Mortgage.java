package Exercise3;

public abstract class Mortgage implements MortgageConstants {
    private int mortgageNumber;
    private String customerName;
    private double amount;
    protected double interestRate;
    private int term;

    public Mortgage(int mortgageNumber, String customerName, double amount, int term) {
        this.mortgageNumber = mortgageNumber;
        this.customerName = customerName;
        if (amount > MAX_AMOUNT)
            this.amount = MAX_AMOUNT;
        else
            this.amount = amount;
        if (term != SHORT_TERM && term != MEDIUM_TERM && term != LONG_TERM)
            this.term = SHORT_TERM;
        else
            this.term = term;
    }

    public abstract void setInterestRate(double rate);

    public double calculateMonthlyPayment() {
        int months = term * 12;
        double monthlyRate = interestRate / 12 / 100;
        return amount * monthlyRate / (1 - Math.pow(1 + monthlyRate, -months));
    }

    public void getMortgageInfo() {
        System.out.println("Mortgage Number: " + mortgageNumber +
                "\nCustomer Name: " + customerName +
                "\nAmount: $" + amount +
                "\nInterest Rate: " + interestRate + "%" +
                "\nTerm: " + term + " years" +
                "\nBank Name: " + BANK_NAME);
    }
}

