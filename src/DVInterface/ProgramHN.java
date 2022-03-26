package DVInterface;

import DVInterface.entities.ComboDevice;
import DVInterface.entities.ConcretePrinter;
import DVInterface.entities.ConcreteScanner;

public class ProgramHN {
	public static void main(String[] args) {
		
      ConcretePrinter p = new ConcretePrinter("1000");
      p.processDoc("My Letter");
      System.out.println(p.printer());
      System.out.println("");
      ConcreteScanner s = new ConcreteScanner("2003");
      s.processDoc("My Email");
      System.out.println(s.scanner());
      System.out.println("");
      ComboDevice c = new ComboDevice("2081");
      c.processDoc("My dissertation");
      System.out.println(c.printer());
      System.out.println(c.scanner());
      
	}
}
