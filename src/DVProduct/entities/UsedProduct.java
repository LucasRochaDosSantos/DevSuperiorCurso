package DVProduct.entities;

import java.util.Date;

public class UsedProduct extends Product{
	private Date manufactureDate ;
	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	@Override
	public String priceTag() {
		return String.format("%s (used)$ %.2f (Manufacture date: %tF",this.getName() , this.getPrice(), manufactureDate);
	}
}
