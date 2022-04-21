package ocp.violation.test;

import ocp.violation.FestivalType;
import ocp.violation.FixedDeposite;

public class OcpViolationTest {
	public static void main(String args[]) {
		FixedDeposite fd = new FixedDeposite("111",100000,3,FestivalType.EID);
		
		System.out.println("Simple interest: "+fd.calculateSimpleInterest());
		
	}
}
