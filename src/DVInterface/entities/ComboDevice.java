package DVInterface.entities;

public class ComboDevice  extends Device implements Scanner , Printer{

	public ComboDevice(String serialNumber) {
		super(serialNumber);
	
	}

	@Override
	public String printer() {
		
		return "Combo print result";
	}

	@Override
	public String scanner() {
		return "Combo scan result";
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("Combo processing " + doc);
		
	}

}
