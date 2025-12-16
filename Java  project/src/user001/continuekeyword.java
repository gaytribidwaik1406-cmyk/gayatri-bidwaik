package user001;

public class continuekeyword {

	public static void main(String[] args) {

		// continue keyword in for loop
		// print 1 to 20 and skip 17
		for (int a = 1; a <= 20; a++) {
			if (a == 17) {
				continue;
			}
			System.out.print(a + " ");
		}
		System.out.println();

		for (int b = 30; b >= 1; b--) {
			if (b == 19) {
				continue;
			}
			System.out.print(b + " ");
		}
		System.out.println();

		// continue keyword in while loop
		int c = 1;
		while (c <= 20) {
			c++;
			if (c == 14) {
				continue;
			}
			System.out.print(c + " ");

		}
		System.out.println();
		int d = 20;
		while (d >= 1) {
			d--;
			if (d == 15) {
				continue;
			}
			System.out.print(d + " ");
		}

		System.out.println();
		// continue keyword in do while loop
		int p = 1;
		do {
			p++;
			if (p == 9) {
				continue;
			}
			System.out.print(p + " ");

		} while (p <= 10);

		System.out.println();
		int g = 21;
		do {
			g--;
			if (g == 15) {
				continue;
			}
			System.out.print(g + " ");

		} while (g >= 1);

	}
}