package srp.violation.test;

import srp.violation.Invoice;

public class InvoiceTest {
		public static void main(String args[]) {
			Invoice invoice = new Invoice("100","Samsung",100000,10,20);
			
			invoice.printInvoice();
		}
}
