package DVProduct.entities;

public class ImportedProduct extends Product{
	private Double customsFee;

	public ImportedProduct() {
	}

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	@Override
    public String priceTag(){
		return String.format("%s (used)$ %.2f (Customs fee: %.2f",this.getName() , this.getPrice(), totalPrice());
    }
	public double totalPrice() {
		return this.getPrice() + this.getCustomsFee();
	}
	
}
