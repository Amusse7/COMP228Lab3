package Exercise3;

public class PersonalMortgage extends Mortgage {
    public PersonalMortgage(int mortgageNumber, String customerName, double amount, int term) {
        super(mortgageNumber, customerName, amount, term);
        setInterestRate(PrimeRates.getCurrentPrimeRate() + 2);
    }

    @Override
    public void setInterestRate(double rate) {
        this.interestRate = rate;
    }
}

