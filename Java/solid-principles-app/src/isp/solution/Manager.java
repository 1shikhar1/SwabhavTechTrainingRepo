package isp.solution;

public class Manager implements IWorker {

	@Override
	public void startWork() {
		System.out.println("Manager is started working");
	}

	@Override
	public void stopWork() {
		System.out.println("Manager has stopped working");
	}

	@Override
	public void startEat() {
		System.out.println("Manager is started eating");
	}

	@Override
	public void stopEat() {
		System.out.println("Manager has stopped eating");
	}

}
