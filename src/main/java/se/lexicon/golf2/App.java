package se.lexicon.golf2;

import java.util.Random;
import java.util.Scanner;

public class App {
	Scanner sc = new Scanner(System.in);
	
public static void main(String[] args) {

		int hole = 0;
		int tries = 0;
		int velocity=0;
		double angle=0;
		boolean win = false, running = true;
		double totaldistance = 0;
		double oneSwing = 0;
		String[] result = new String[0];
		hole=Calculations.get_hole_distance();

  while (running) {
		do {
			System.out.println("input velocity");
			velocity = Input_int.speedAndAngel();
			if (velocity >= 300 || velocity <= 5) {
				System.out.println("Wrong Speed please Enter Number between 10 & 200");
				System.out.println("enter another velocity!");
			}
			System.out.println("enter the angel !");
			angle = Input_int.speedAndAngel();
			
			if (angle >= 90 || angle <= 1) {
				System.out.println("Wrong Value please Enter Number between 1 & 89");
				System.out.println("enter another angel  ");
				angle = Input_int.speedAndAngel();
			}
			oneSwing=Calculations.calculation(velocity, angle);
			totaldistance += oneSwing;
			if (totaldistance == hole ) {
				System.out.println("congratulations! ");
				win = true;
			}
				result = AddTooAarray.addToArray(result,
				"tries " + (tries + 1) + " " +  " position: " + (int) (oneSwing));
		        System.out.println("The total distance the ball traveled is : " + totaldistance);
		        tries = tries + 1;
		       
		        for(String s:result){
		        System.out.println(s);
		     }
					
	}while(!win&&tries<5);
			System.out.println("Do You Want To play more ? (Y/N)");
			String answer = Input_int.getInput();
			running = playAgain(answer);
			tries = 0;
			totaldistance = 0;
			result = new String[0];
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
  }



