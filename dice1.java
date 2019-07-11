import java.util.Random;
import java.util.Scanner;

	public class dice {
		public static void main(String args[]) {
			Random rad = new Random();
			Scanner scan = new Scanner(System.in);

			int dice1 = rad.nextInt(6) + 1;
			int dice2 = rad.nextInt(6) + 1;
			int total = dice1 + dice2;

			int dice3 = rad.nextInt(6) + 1;
			int dice4 = rad.nextInt(6) + 1;

			System.out.println("What is your name? ");
			String name = scan.nextLine();
			System.out.println("> Hello, " + name);
			System.out.println("");

			System.out.println("Rolling the dice...");
			System.out.println("Die 1: " + dice1);
			System.out.println("Die 2: " + dice2);

			System.out.println("Total value: " + total);

			if(total > 7) {
				System.out.println(name + " win!");
			}else {
				System.out.println(name + " lost");
			}
		}
}		
