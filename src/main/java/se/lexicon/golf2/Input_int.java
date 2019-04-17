package se.lexicon.golf2;

import java.util.Scanner;

public class Input_int {
	private static Scanner in = new Scanner(System.in);

	public static String getInput() {
		// player may input a letter instead of number
		return in.nextLine();
	}

	public static int speedAndAngel() {
		boolean valid = false;
		int number = 0;
		while (!valid) {
			try {
				// changing string into double and casting double into int
				number = (int) Double.parseDouble(getInput());
				valid = true;
			} catch (NumberFormatException e) {
				System.out.println("You did not enter a valid number");
			}
		}
		return number;
	}
}
