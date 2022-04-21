package isp.violation.test;

import isp.violation.*;

public class IspViolationTest {
	public static void main(String args[]) {
		Manager mngr = new Manager();
		Robot robo = new Robot();
		
		atTheWorkStation(mngr);
		atTheWorkStation(robo);
		
		atTheCafeteria(mngr);
		atTheCafeteria(robo);
	}
	
	public static void atTheWorkStation(IWorker worker) {
		System.out.println("At the work station");
		worker.startWork();
		worker.stopWork();
	}
	
	public static void atTheCafeteria(IWorker worker) {
		System.out.println("At the cafeteria");
		worker.startEat();
		worker.stopEat();
	}
}
