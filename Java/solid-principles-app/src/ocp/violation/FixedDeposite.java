package ocp.violation;

public class FixedDeposite {
	private String accoontNo;
	private double principle;
	private int duration;
	private FestivalType festival;
	
	public FixedDeposite(String accountNo, double principle, int duration, FestivalType festival) {
		this.accoontNo = accountNo;
		this.principle = principle;
		this.duration = duration;
		this.festival = festival;
	}
	
	public float calculateRate() {
		if(festival == festival.NORMAL)
			return 7f;
		if(festival == festival.NEW_YEAR)
			return 8f;
		
		return 9f;
	}
	
	public double calculateSimpleInterest() {
		return (principle*calculateRate()/100) * duration;
	}
}
