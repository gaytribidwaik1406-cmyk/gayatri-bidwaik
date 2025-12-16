package user001;

class breakstatement {

	public static void main(String[] args) {
		// break from 7
		for (int a = 1; a <= 10; a++) {
			System.out.print(a + " ");
			if (a == 7) {
				break;
			}
		}

		System.out.println();
		// break keyword in while loop
		int b = 10;
		while (b >= 1) {
			System.out.print(b + " ");
			if (b == 5) {
				break;
			}
			b--;
		}

		System.out.println();
// break keyword in do while loop
		int c = 24;
		do {
			System.out.println(c + " ");
			if (c == 18)
				break;
			c--;
		} while (c >= 10);

		System.out.println();
		int d = 5;
		do {
			System.out.println(d + " ");
			if (d == 6)
				break;
			d--;

		} while (d > 5);

	}
}
