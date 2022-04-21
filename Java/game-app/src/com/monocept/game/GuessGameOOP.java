package com.monocept.game;

import java.util.Random;
import java.util.Scanner;

public class GuessGameOOP {

	public void game() {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		int play = 1;

		while (play != 0) {
			int num = rand.nextInt(100);
			System.out.println("Number guesser (choose between 1 to 100)");
			System.out.println("***");
			int count = 0;

			while (true) {
				System.out.println("Guess the number: ");
				int guess = sc.nextInt();
				count++;
				if (guess < num)
					System.out.println("Sorry too low");
				else if (guess > num)
					System.out.println("Sorry too high");
				else {
					System.out.println("! Right answer !\n Number of try: " + count);
					break;
				}
			}
			System.out.println("Do you wanna play more (if yes enter 1 otherwise enter 0): ");

			play = sc.nextInt();
		}
		System.out.println("Thanks for playing");
	}
}
