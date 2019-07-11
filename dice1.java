import java.util.Random;
import java.util.Scanner;

	public class dice1 {
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
			System.out.println("Die 3: " + dice3);
			System.out.println("Die 4: " + dice4);

			if((dice1 > dice2) && (dice1 > dice3) && (dice1 > dice4)) {
				System.out.println("dice1 is bigger");
			}else if((dice2 > dice1) && (dice2 > dice3) && (dice2 > dice4)) {
				System.out.println("dice2 is bigger");
			}else if((dice3 > dice1) && (dice3 > dice2) && (dice3 > dice4)) {
				System.out.println("dice3 is bigger");
			}else if((dice4 > dice1) && (dice4 > dice2) && (dice4 > dice3)) {
				System.out.println("dice4 is bigger");
			}else if((dice3 > dice1) && (dice3 > dice2) && (dice3 > dice4)) {
				System.out.println("dice3 is bigger");
			}else if((dice3 == dice1) && (dice3 == dice2) && (dice3 == dice4)) {
				System.out.println("All dice are biggest");
			}else if((dice3 == dice1) && (dice3 == dice2)) {
				System.out.println("dice1 and dice2 and dice3 are biggest");
			}else if((dice2 == dice1) && (dice4 == dice2)) {
				System.out.println("dice1 and dice2 and dice4 are biggest");
			}else if((dice3 == dice1) && (dice3 == dice4)) {
				System.out.println("dice1 and dice3 and dice4 are biggest");
			}else if((dice3 == dice4) && (dice3 == dice2)) {
				System.out.println("dice2 and dice3 and dice4 are biggest");
			}else if((dice1 == dice2) && (dice3 == dice4) && (dice1 > dice3)) {
				System.out.println("dice1 and dice2 are biggest");
			}else if((dice1 == dice2) && (dice3 == dice4) && (dice1 < dice3)) {
				System.out.println("dice3 and dice4 are biggest");
			}else if((dice1 == dice3) && (dice2 == dice4) && (dice1 > dice2)) {
				System.out.println("dice1 and dice3 are biggest");
			}else if((dice1 == dice3) && (dice2 == dice4) && (dice1 < dice2)) {
				System.out.println("dice2 and dice4 are biggest");
			}else if((dice1 == dice4) && (dice2 == dice3) && (dice1 > dice2)) {
				System.out.println("dice1 and dice4 are biggest");
			}else if((dice1 == dice4) && (dice2 == dice3) && (dice1 < dice2)) {
				System.out.println("dice2 and dice3 are biggest");
			}else if(dice1 == dice2) {
				System.out.println("dice1 and dice2 are biggest");
			}else if(dice1 == dice3) {
				System.out.println("dice1 and dice3 are biggest");
			}else if(dice1 == dice4) {
				System.out.println("dice1 and dice4 are biggest");
			}else if(dice2 == dice3) {
				System.out.println("dice2 and dice3 are biggest");
			}else if(dice2 == dice4) {
				System.out.println("dice2 and dice4 are biggest");
			}else if(dice4 == dice3) {
				System.out.println("dice3 and dice4 are biggest");
			}
       	}
}		
