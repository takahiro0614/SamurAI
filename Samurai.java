public abstract class Samurai {
	int x;
	int y;
	boolean wasMoved;
	boolean wasHidden;
	int lestTurn;

	int bestMove;
	int bestAttack;

	int max;

	void setState(int[] a) {
		x = a[0];
		y = a[1];
		wasMoved = (a[2] == 1);
		wasHidden = (a[3] == 1);
		lestTurn = a[4];
	}

	int Action() {
		max = -1;
		if (wasMoved)
			return -20;
		if (lestTurn != 0)
			return lestTurn - 18;
		moveAction(x, y, 0);
		if (y < 14)
			moveAction(x, y + 1, 1);
		if (x < 14)
			moveAction(x + 1, y, 2);
		if (y > 0)
			moveAction(x, y - 1, 3);
		if (x > 0)
			moveAction(x - 1, y, 4);
		return max;
	}

	void moveAction(int x, int y, int move) {
		int temp = SAction(x, y);
		if (max < temp) {
			max = temp;
			bestMove = move;
			bestAttack = 1;
		}
		temp = EAction(x, y);
		if (max < temp) {
			max = temp;
			bestMove = move;
			bestAttack = 2;
		}
		temp = NAction(x, y);
		if (max < temp) {
			max = temp;
			bestMove = move;
			bestAttack = 3;
		}
		temp = WAction(x, y);
		if (max < temp) {
			max = temp;
			bestMove = move;
			bestAttack = 4;
		}
	}

	void printState() {
		System.out.println("bestMove=" + bestMove);
		System.out.println("bestAttack=" + bestAttack);
		System.out.println("max=" + max);
	}

	abstract int SAction(int x, int y);

	abstract int EAction(int x, int y);

	abstract int NAction(int x, int y);

	abstract int WAction(int x, int y);
}
