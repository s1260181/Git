import java.util.Random;
public class dice1{
		public static void main(String args[]) {
			Random rad = new Random();

			int dice1 = rad.nextInt(6) + 1;
			int dice2 = rad.nextInt(6) + 1;
			int total = dice1 + dice2;

						System.out.println("Rolling the dice...");
			System.out.println("Die 1: " + dice1);
			System.out.println("Die 2: " + dice2);

			System.out.println("Total value: " + total);

			if(total > 7) {
				System.out.println("You won");
			}else {
				System.out.println("You lost");
			}

		}
}
