package srp.violation;

public class Invoice {
	private String id;
	private String discription;
	private double amount; //1000000
	private float tax; //10%
	private double discountPrice; //20%
	
	public Invoice(String id, String discription, double amount, float tax, double discountPrice) {
		this.id = id;
		this.discription = discription;
		this.amount = amount;
		this.tax = tax;
		this.discountPrice = discountPrice;
	}
	
	public double calculateTax()
	{
		return (amount*tax)/100;
	}
	
	public double calculateDiscount() {
		return (amount*discountPrice)/100;
	}
	
	public double calculateTotal() {
		return amount + calculateTax() -calculateDiscount() ;
	}
	
	public void printInvoice() {
		System.out.println("Id: "+id);
		System.out.println("Discription: "+discription);
		System.out.println("Amount: "+amount);
		System.out.println("Tax: "+calculateTax());
		System.out.println("Discount price: "+calculateDiscount());
		System.out.println("Total price: "+calculateTotal());
	}
}
