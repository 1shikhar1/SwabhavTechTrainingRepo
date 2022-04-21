package com.monocept.model;

public class Person {

	private static final int eatWeightIncreasePersentage = 10;
	private static final int workoutHeightIncreasePersentage = 2;
	private static final int workoutWeightDecreasePersentage = 5;
	private static final float defaultHeight = 6;
	private static final float defaultWeight = 60;
	private static final GenderOptions defaultGender = GenderOptions.MALE;

	private final String name;
	private int age;
	private float height;
	private float weight;
	private final GenderOptions gender;

	public Person(String name, int age) {
		this(name, age, defaultHeight, defaultWeight, defaultGender);
	}

	public Person(String name, int age, float height, float weight, GenderOptions gender) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.gender = gender;
	}

	public void eat() {
		weight = ((weight * eatWeightIncreasePersentage) / 100) + weight;
	}

	public void workout() {
		height = ((height * workoutHeightIncreasePersentage) / 100) + height;
		weight = weight - ((weight * workoutWeightDecreasePersentage) / 100);
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public float getHeight() {
		return height;
	}

	public float getWeight() {
		return weight;
	}

	public GenderOptions getGender() {
		return gender;
	}
}
