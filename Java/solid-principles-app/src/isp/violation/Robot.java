package isp.violation;

public class Robot implements IWorker {

	@Override
	public void startWork() {
		System.out.println("Robot is started working");
	}

	@Override
	public void stopWork() {
		System.out.println("Robot has stopped working");
	}

	@Override
	public void startEat() {
		throw new RuntimeException("Robot can't eat");
	}

	@Override
	public void stopEat() {
		throw new RuntimeException("Robot can't eat");
	}
	
}
