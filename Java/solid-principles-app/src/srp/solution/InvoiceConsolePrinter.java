package srp.solution;

public class InvoiceConsolePrinter {
	
	public void printInvoice(Invoice invoice) {
		System.out.println("Id: "+invoice.getId());
		System.out.println("Discription: "+invoice.getDiscription());
		System.out.println("Amount: "+invoice.getAmount());
		System.out.println("Tax: "+invoice.calculateTax());
		System.out.println("Discount price: "+invoice.calculateDiscount());
		System.out.println("Total price: "+invoice.calculateTotal());
	}
}
