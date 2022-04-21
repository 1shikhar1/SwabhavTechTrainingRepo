package com.monocept.model.test;

import com.monocept.model.Player;

public class PlayerTest {
	public static void main(String[] args) {
		Player sachin = new Player(1, "Sachin", 45);

		Player rahul = new Player(2, "Rahul");

		System.out.println("Sachin details: ");
		printDetails(sachin);

		System.out.println("\nRahul details: ");
		printDetails(rahul);
		
		System.out.println("\nElder Player: "+sachin.whoIsElder(rahul).getName());
	}

	public static void printDetails(Player player) {
		System.out.println("Id: " + player.getId());
		System.out.println("Name: " + player.getName());
		System.out.println("Age: " + player.getAge());
	}
}
