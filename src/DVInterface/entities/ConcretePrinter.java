package DVInterface.entities;

public class ConcretePrinter extends Device implements Printer {

	public ConcretePrinter(String serialNumber) {
		super(serialNumber);
		
	}

	@Override
	public String printer() {
		
		return "Printer content";
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("Printer processing " + doc);
		
	}

}
