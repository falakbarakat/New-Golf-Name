package se.lexicon.golf2;

import java.util.Random;

public class Calculations {

	public static double calculation(int velocity,double angle) {
		
		int[] position = new int[0];
		double totaldistance=0.0 ;
		int hole=0 ;
		int tries=0 ;
		boolean win = false;
		
		position = (AddTooAarray.addToArray(position,
				(int) (Math.pow(velocity, 2) / 9.8 * Math.sin(2 * ((Math.PI / 180) * (angle))))));
		for (int i = 0; i < position.length; i++) {
			totaldistance =totaldistance+ position[i];
		}
		return totaldistance;
    }
	public   static int get_hole_distance() {
		int max = 1000;
		int mini = 950;
		Random rnd = new Random();
		int hole_distance = rnd.nextInt(max - mini) + mini;
		System.out.println("the  position of the hole is :" + hole_distance + "" + "meters");
		return hole_distance;
	}
}
