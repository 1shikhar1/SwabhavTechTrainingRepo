package isp.solution.test;

import isp.solution.*;

public class IspSolutionTest {
	public static void main(String args[]) {
		Manager mngr = new Manager();
		Robot robo = new Robot();
		
		atTheWorkStation(mngr);
		atTheWorkStation(robo);
		
		atTheCafeteria(mngr);
//		atTheCafeteria(robo);
	}
	
	public static void atTheWorkStation(IWork worker) {
		System.out.println("At the work station");
		worker.startWork();
		worker.stopWork();
	}
	
	public static void atTheCafeteria(IEat worker) {
		System.out.println("At the cafeteria");
		worker.startEat();
		worker.stopEat();
	}
}