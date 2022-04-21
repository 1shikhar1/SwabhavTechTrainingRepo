package srp.solution.test;

import srp.solution.Invoice;
import srp.solution.InvoiceConsolePrinter;

public class SrpSolutionTest {
	
	public static void main(String args[]) {
		
		Invoice invoice = new Invoice("100","Samsung",100000,10,20);
		
		InvoiceConsolePrinter printer = new InvoiceConsolePrinter();
		
		printer.printInvoice(invoice);
	}
}
