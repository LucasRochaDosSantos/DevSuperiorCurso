package DVEmploye.entites;

public class OutSourcedEmployee extends Employe {
	private Double additionalCharge;

	public OutSourcedEmployee(){
		super();
	}
	public OutSourcedEmployee(String name, Integer hours, Double valuePerhour, Double additionalCharge) {
		super(name, hours, valuePerhour);
		this.additionalCharge = additionalCharge;
	}
	public Double getAdditionalCharge() {
		return additionalCharge;
	}
	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public double payment() {
		return this.getHours() * this.getValuePerhour() + (this.additionalCharge * 1.1 ); 
	}
}
