package DVsuperiorAccount.entities;

public class BusinessAccount extends Account{
	private Double loanLimit;

	public BusinessAccount() {
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loalLimit) {
		super(number, holder, balance);
		this.loanLimit = loalLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
    public void loan(Double amount){
    	if(amount <= this.loanLimit){
    		deposit(amount);
    	}
    }
    @Override
    public void withDraw(double amount){
    	super.withDraw(amount);
    	this.balance -= 2;
    }
  
}
