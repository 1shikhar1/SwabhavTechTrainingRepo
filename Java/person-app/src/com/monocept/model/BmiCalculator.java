package com.monocept.model;

public class BmiCalculator {
	private final Person person;

	public BmiCalculator(Person person) {
		this.person = person;
	}

	public String getBodyCategory() {
		if(getBmiScore()<18.5)
			return "Under Weight";
		
		if(getBmiScore()>=18.5 && getBmiScore()<25)
			return "Normal";
		
		if(getBmiScore()>=25 && getBmiScore()<30)
			return "Over Weight";
		
		return "Obesity";
		
	}

	public float getBmiScore() {
		float heightInMeter = (float)(person.getHeight() * 0.3048);
		return (person.getWeight() / (heightInMeter * heightInMeter));
	}

	public String getDetails() {
		String details = "";
		details = details + "Name: " + person.getName() + "\n";
		details = details + "Gender: " + person.getGender() + "\n";
		details = details + "Age: " + person.getAge() + "\n";
		details = details + "Height: " + person.getHeight() + "\n";
		details = details + "Weight: " + person.getWeight() + "\n";
		
		return details;
	}
}
