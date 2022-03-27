package DVInterface.exerciciotres.entities;



public class BrazilInterestService implements InterestService{

    private Double interestRate;
	public BrazilInterestService(Double interesRate) {
		this.interestRate = interesRate;
	}
   
	@Override
	public double getInterestRate() {
		
		return interestRate;
	}
}
