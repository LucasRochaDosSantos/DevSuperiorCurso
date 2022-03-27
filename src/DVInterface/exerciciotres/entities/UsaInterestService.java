package DVInterface.exerciciotres.entities;



public class UsaInterestService implements InterestService {
	
	private Double interestRate;

	public UsaInterestService(Double intrestRate) {

		this.interestRate = intrestRate;
	}

	@Override
	public double getInterestRate() {
		
		return interestRate;
	}
	

}
