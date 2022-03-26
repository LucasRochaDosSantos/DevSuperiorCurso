package DVInterface;

import java.util.Locale;

import DVInterface.entities.AbstractShape;
import DVInterface.entities.Circle;
import DVInterface.entities.Rectangle;
import DVInterface.enums.Color;

public class ProgramShape {
	public static void main(String[] args) {
     Locale.setDefault(Locale.US);
     AbstractShape s1 = new Circle(2.0, Color.BLACK);
     AbstractShape s2 = new Rectangle(3.0, 4.0, Color.WHITE);
     
     System.out.println("Circle color: " + s1.getColor());
     System.out.println("Circle area: " + String.format("%.2f", s1.area()));
     
     System.out.println("Circle color: " + s2.getColor());
     System.out.println("Circle area: " + String.format("%.2f", s2.area()));
     
	}
}
