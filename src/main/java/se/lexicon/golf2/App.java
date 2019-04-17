package se.lexicon.golf2;

import java.util.Random;
import java.util.Scanner;

public class App {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int distance;
		int hole = 0;
		int tries = 0;
		int velocity;
		double angle;
		double gravity = 9.8;
		int[] position = new int[0];
		boolean win = false, running = true;
		double totaldistance;
		String[] result = new String[0];
		while (running) {
			if (tries == 0) {
				hole = get_hole_distance();
			}
			System.out.println("the hole is :" + " " + hole + " " + "meters far away");

			do {
				System.out.println("input velocity");
				velocity = Input_int.speedAndAngel();
				if (velocity >= 300 || velocity <= 5) {
					System.out.println("Wrong Speed please Enter Number between 10 & 200");
					System.out.println("enter another velocity!");
					velocity = Input_int.speedAndAngel();
				}

				System.out.println("enter the angel !");
				angle = Input_int.speedAndAngel();

				if (angle >= 90 || angle <= 1) {
					System.out.println("Wrong Value please Enter Number between 1 & 89");
					System.out.println("enter another angel  ");
					angle = Input_int.speedAndAngel();
				}
				double angleInRadians = ((Math.PI / 180) * angle);

				position = (AddTooAarray.addToArray(position,
						(int) (Math.pow(velocity, 2) / 9.8 * Math.sin(2 * ((Math.PI / 180) * (angle))))));
				// activiating asking player to play again;
				totaldistance = 0;

				for (int i = 0; i < position.length; i++) {
					totaldistance += position[i];
					if (totaldistance < hole + 15 && totaldistance > hole - 15) {
						System.out.println("congratulations! ");
						win = true;
					}
				}
				result = AddTooAarray.addToArray(result,
						"tries " + (tries + 1) + " " + position[tries] + " total: " + (int) (totaldistance));
				System.out.println("The Ball distance  " + position[position.length - 1] + " Total: " + totaldistance);
				tries = tries + 1;
			} while (!win && tries < 5 && totaldistance < hole);

			for (String s : result) {
				System.out.println(s);
			}

			System.out.println("Do You Want To play more ? (Y/N)");
			String answer = Input_int.getInput();
			running = playAgain(answer);
			tries = 0;
			totaldistance = 0;
			position = new int[0];
		}
	}

	public static boolean playAgain(String answer) {
		String upperCaseString = answer.toUpperCase();
		switch (upperCaseString) {
		case "Y":
			return true;
		default:
			System.out.println("good bye");
			return false;
		}
	}

	public static int get_hole_distance() {
		int max = 1000;
		int mini = 950;
		Random rnd = new Random();
		int hole_distance = rnd.nextInt(max - mini) + mini;
		System.out.println("the  position of the hole is :" + hole_distance + "" + "meters");
		return hole_distance;
	}

}
