package dip.violation;

public class TaxCalculator {
	
	LogType loggerType;
	
	public TaxCalculator(LogType loggerType) {
		this.loggerType = loggerType;
	}
	
	public int calculateTax(int amt, int rate) {
		
		int result = 0;
		try {
			
			result = amt/rate;
			
		} catch(RuntimeException e) {
			
			if(loggerType == LogType.DB) {
				DBLogger db = new DBLogger();
				db.log("Divide by zero");
			}
			
			if(loggerType == LogType.FILE) {
				FileLogger file = new FileLogger();
				file.log("Divide by zero");
			}
				
		}
		
		return result;
	}
}
