package com.monocept.game;

import java.util.Scanner;
import java.util.Random;

public class GuessGame {
	public static void main(String[] args) {
		game();
	}

	private static void game() {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		boolean play = true;

		while (play) {
			int randomNumber = rand.nextInt(100);
			System.out.println("Number guesser (choose between 1 to 100)");
			System.out.println("***");
			int countGuess = 0;

			while (true) {
				System.out.println("Guess the number: ");
				int guessedNumber = sc.nextInt();
				countGuess++;
				if (guessedNumber < randomNumber)
					System.out.println("Sorry too low");
				else if (guessedNumber > randomNumber)
					System.out.println("Sorry too high");
				else {
					System.out.println("! Right answer !\n Number of try: " + countGuess);
					break;
				}
			}
			System.out.println("Do you wanna play more (if yes enter 1 otherwise enter 0): ");

			int temp = sc.nextInt();
			if (temp == 1)
				play = true;
			play = false;
		}
		System.out.println("Thanks for playing");
	}
}