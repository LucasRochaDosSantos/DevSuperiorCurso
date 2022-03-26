package DVInterface.entities;

public class ConcreteScanner extends Device implements Scanner {
    
	
	
	public ConcreteScanner(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public String scanner() {
		
		return "Scanner content";
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("Scanner processing: " + doc);
		
	}

}
