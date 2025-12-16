package MOCK;

public class patternsusingforloop {

	public static void main(String[] args) {
		// solid rectangle
		for (int a = 1; a <= 4; a++) {
			for (int b = 1; b <= 5; b++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println();
		// hallow rectangle
		for (int c = 1; c <= 4; c++) {
			for (int d = 1; d <= 5; d++) {
				if (c == 1 || c == 4 || d == 1 || d == 5) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		// hallow rectangle
		System.out.println();
		for (int s = 1; s <= 5; s++) {
			for (int v = 1; v <= 6; v++) {
				if (s == 1 || s == 5 || v == 1 || v == 6) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}

			}
			System.out.println();
		}

		System.out.println();
		// half pyramid
		for (int e = 1; e <= 4; e++) {
			for (int f = 1; f <= e; f++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		// half pyramid with numbers
		for (int e = 1; e <= 4; e++) {
			for (int f = 1; f <= e; f++) {
				System.out.print(f + " ");
			}
			System.out.println();
		}

		System.out.println();
		// inverted half pyramid
		for (int n = 4; n > 0; n--) {
			for (int m = 1; m <= n; m++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		// inverted half pyramid with numbers
		for (int n = 4; n > 0; n--) {
			for (int m = 1; m <= n; m++) {
				System.out.print(m + " ");
			}
			System.out.println();
		}

		System.out.println();
		// 0-1 triangle pattern
		for (int u = 1; u <= 5; u++) {
			for (int v = 1; v <= u; v++) {
				if ((u + v) % 2 == 0) {
					System.out.print("1 ");
				} else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		 
		

	}
}
