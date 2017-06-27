import java.util.Scanner;

public class Main {
	static Scanner scanner = new Scanner(System.in);

	static int myTurn;
	static int nowTurn;

	static Samurai[] samurai = { new Yari(), new Katana(), new Masakari() };

	static int[][] statasOfSamurai = new int[6][5];
	static int[][] statasOfField = new int[15][15];

	static int bestSamurai;

	public static void main(String[] args) {
		myTurn = scanner.nextInt();
		System.out.println(0);
		while (true) {
			nowTurn = scanner.nextInt();
			for (int i = 0; i < 6; i++) {
				for (int j = 0; j < 5; j++) {
					statasOfSamurai[i][j] = scanner.nextInt();
				}
			}
			for (int i = 0; i < 3; i++) {
				samurai[i].setState(statasOfSamurai[i]);
			}
			for (int i = 0; i < 15; i++) {
				for (int j = 0; j < 15; j++) {
					statasOfField[i][j] = scanner.nextInt();
				}
			}
			int max = samurai[0].Action();
			bestSamurai = 0;
			int temp = samurai[1].Action();
			if (max < temp) {
				max = temp;
				bestSamurai = 1;
			}
			temp = samurai[2].Action();
			if (max < temp)
				bestSamurai = 2;
			String command = String.valueOf(bestSamurai) + " ";
			if (samurai[bestSamurai].wasHidden) {
				command += "9 ";
				if (samurai[bestSamurai].bestMove > 0)
					command += String.valueOf(samurai[bestSamurai].bestMove + 4) + " ";
				command += String.valueOf(samurai[bestSamurai].bestAttack) + " ";
			} else {
				if (samurai[bestSamurai].bestMove > 0)
					command += String.valueOf(samurai[bestSamurai].bestMove + 4) + " ";
				command += String.valueOf(samurai[bestSamurai].bestAttack) + " ";
				command += "9 ";
			}
			command += "0";
			System.out.println(command);
		}
	}
}
