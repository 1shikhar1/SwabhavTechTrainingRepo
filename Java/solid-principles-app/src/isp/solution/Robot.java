package isp.solution;

public class Robot implements IWork {

	@Override
	public void startWork() {
		System.out.println("Robot is started working");
	}

	@Override
	public void stopWork() {
		System.out.println("Robot has stopped working");
	}
	
}
