package com.monocept.model.test;

import com.monocept.model.*;

public class PersonTest {
	public static void main(String args[]) {
		Person first = new Person("Asha", 24, 5.8f, 62.5f, GenderOptions.FEMALE);
		Person second = new Person("Rohan", 24);

		printDetails(second);
		System.out.println();

		printDetails(first);
		first.eat();

		System.out.println();

		printDetails(first);
		first.workout();

		System.out.println();

		printDetails(first);
	}

	public static void printDetails(Person person) {
		System.out.println("Name:\t " + person.getName());
		System.out.println("Age:\t " + person.getAge());
		System.out.println("Height:\t " + person.getHeight());
		System.out.println("Weight:\t " + person.getWeight());
		System.out.println("Gender:\t " + person.getGender());
	}
}
