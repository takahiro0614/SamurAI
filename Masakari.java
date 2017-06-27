public class Masakari extends Samurai {
	int SAction(int x, int y) {
		int get = 0;
		if (y > 0) {
			if (x > 0)
				if (Main.statasOfField[y - 1][x - 1] > 2)
					get++;
			if (x < 14)
				if (Main.statasOfField[y - 1][x + 1] > 2)
					get++;
		}
		if (x > 0)
			if (Main.statasOfField[y][x - 1] > 2)
				get++;
		if (x < 14)
			if (Main.statasOfField[y][x + 1] > 2)
				get++;
		if (y < 14) {
			if (x > 0)
				if (Main.statasOfField[y + 1][x - 1] > 2)
					get++;
			if (Main.statasOfField[y + 1][x] > 2)
				get++;
			if (x < 14)
				if (Main.statasOfField[y + 1][x + 1] > 2)
					get++;
		}
		return get;
	}

	int EAction(int x, int y) {
		int get = 0;
		if (x > 0) {
			if (y < 14)
				if (Main.statasOfField[y + 1][x - 1] > 2)
					get++;
			if (y > 0)
				if (Main.statasOfField[y - 1][x - 1] > 2)
					get++;
		}
		if (y < 14)
			if (Main.statasOfField[y + 1][x] > 2)
				get++;
		if (y > 0)
			if (Main.statasOfField[y - 1][x] > 2)
				get++;
		if (x < 14) {
			if (y < 14)
				if (Main.statasOfField[y + 1][x + 1] > 2)
					get++;
			if (Main.statasOfField[y][x + 1] > 2)
				get++;
			if (y > 0)
				if (Main.statasOfField[y - 1][x + 1] > 2)
					get++;
		}
		return get;
	}

	int NAction(int x, int y) {
		int get = 0;
		if (y < 14) {
			if (x < 14)
				if (Main.statasOfField[y + 1][x + 1] > 2)
					get++;
			if (x > 0)
				if (Main.statasOfField[y + 1][x - 1] > 2)
					get++;
		}
		if (x < 14)
			if (Main.statasOfField[y][x + 1] > 2)
				get++;
		if (x > 0)
			if (Main.statasOfField[y][x - 1] > 2)
				get++;
		if (y > 0) {
			if (x < 14)
				if (Main.statasOfField[y - 1][x + 1] > 2)
					get++;
			if (Main.statasOfField[y - 1][x] > 2)
				get++;
			if (x > 0)
				if (Main.statasOfField[y - 1][x - 1] > 2)
					get++;
		}
		return get;
	}

	int WAction(int x, int y) {
		int get = 0;
		if (x < 14) {
			if (y > 0)
				if (Main.statasOfField[y - 1][x + 1] > 2)
					get++;
			if (y < 14)
				if (Main.statasOfField[y + 1][x + 1] > 2)
					get++;
		}
		if (y > 0)
			if (Main.statasOfField[y - 1][x] > 2)
				get++;
		if (y < 14)
			if (Main.statasOfField[y + 1][x] > 2)
				get++;
		if (x > 0) {
			if (y > 0)
				if (Main.statasOfField[y - 1][x - 1] > 2)
					get++;
			if (Main.statasOfField[y][x - 1] > 2)
				get++;
			if (y < 14)
				if (Main.statasOfField[y + 1][x - 1] > 2)
					get++;
		}
		return get;
	}
}
