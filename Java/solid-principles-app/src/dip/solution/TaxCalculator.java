package dip.solution;

public class TaxCalculator {
	private ILogger logger;
	
	public TaxCalculator(ILogger logger) {
		this.logger = logger;
	}
	
	public int calculateTax(int amt, int rate) {
		
		int result = 0;
		try {
			
			result = amt/rate;
			
		} catch(RuntimeException e) {
			
			logger.log("Divide by zero");
				
		}
		
		return result;
	}
}
