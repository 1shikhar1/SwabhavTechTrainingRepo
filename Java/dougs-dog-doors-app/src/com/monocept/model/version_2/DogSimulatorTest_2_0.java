package com.monocept.model.version_2;

public class DogSimulatorTest_2_0 {
	 public static void main(String[] args) {
	 DogDoor door = new DogDoor();
	 Remote remote = new Remote(door);
	 
	 System.out.println("Fido barks to go outside...");
	 remote.pressButton();
	 System.out.println("\nFido has gone outside...");

	 System.out.println("\nFido's all done...");

	 System.out.println("\nFido's back inside...");
	 }
}