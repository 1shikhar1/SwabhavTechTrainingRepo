package ocp.solution.test;

import ocp.solution.*;

public class OcpSolutionTest {

	public static void main(String args[]) {
		
		FixedDeposite fd1 = new FixedDeposite("112",100000,2, OcpSolutionTest::ramzanFestival);
		System.out.println("fd1 simple interest: "+fd1.calculateSimpleInterest());
		
		FixedDeposite fd2 = new FixedDeposite("112",100000,1, ()->  {
			System.out.println("Diwali season");
			return 13f;
		});
		
		System.out.println("fd2 simple interest: "+fd2.calculateSimpleInterest());
		
		FixedDeposite fd3 = new FixedDeposite("112",100000,3, new HoliFestivaleRate());
		System.out.println("fd3 simple interest: "+fd3.calculateSimpleInterest());

		
		
	}
	
	static float ramzanFestival() {
		System.out.println("Ramzan season");
		return 12f;
	}
}
