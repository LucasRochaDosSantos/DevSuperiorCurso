package DVInterface.entities;

import DVInterface.enums.Color;

public class Circle extends AbstractShape{
   
	private Double radius;
	
	
	public Circle() {}
	public Circle(Double radius, Color color) {
		this.radius = radius;
	    this.setColor(color);
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}
    
	@Override
	public double area() {
		
		return Math.PI * radius * radius;
	}
	

}
