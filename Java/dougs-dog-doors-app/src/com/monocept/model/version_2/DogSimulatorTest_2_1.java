package com.monocept.model.version_2;

public class DogSimulatorTest_2_1 {
	public static void main(String[] args) {
		DogDoor door = new DogDoor();
		Remote remote = new Remote(door);
		System.out.println("Fido barks to go outside...");
		remote.pressButton();
		System.out.println("Fido has gone outside...");
		System.out.println("Fido's all done...");
		 try {
			 Thread.currentThread().sleep(10000);
		 }
		 catch(InterruptedException e) {
			 System.out.println("...but he's stuck outside ");
			 System.out.println("Fido's start barking.....");
			 System.out.println(".... so gina grabs the remote control.");
			 remote.pressButton();
			 System.out.println("Fido's back inside");
		 }
	}
}
