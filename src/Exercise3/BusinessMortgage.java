package Exercise3;

public class BusinessMortgage extends Mortgage {
    public BusinessMortgage(int mortgageNumber, String customerName, double amount, int term) {
        super(mortgageNumber, customerName, amount, term);
        setInterestRate(PrimeRates.getCurrentPrimeRate() + 1);
    }

    @Override
    public void setInterestRate(double rate) {
        this.interestRate = rate;
    }
}

