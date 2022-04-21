package ocp.solution;

public class FixedDeposite {
	private final String accoontNo;
	private final double principle;
	private final int duration;
	private final IFestivalRate festivalRate;
	
	public FixedDeposite(String accountNo, double principle, int duration, IFestivalRate festivalRate) {
		this.accoontNo = accountNo;
		this.principle = principle;
		this.duration = duration;
		this.festivalRate = festivalRate;
	}
	
	public double calculateSimpleInterest() {
		return (principle*festivalRate.calculateRate()/100) * duration;
	}
}
