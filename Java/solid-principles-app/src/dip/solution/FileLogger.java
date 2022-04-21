package dip.solution;

public class FileLogger implements ILogger {

	@Override
	public void log(String err) {
		System.out.println("Error logged in file: "+err);
	}

}
