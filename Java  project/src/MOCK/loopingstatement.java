package MOCK;

public class loopingstatement {

	public static void main(String[] args) {

		// print 1 to 5
		for (int i = 1; i <= 5; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		// print even no from 1 to 10
		for (int a = 1; a <= 10; a++) {
			if (a % 2 == 0) {
				System.out.println("even number are:" + a);
			}
		}

		System.out.println();
		// reverse for loop
		for (int b = 10; b >= 1; b--) {
			System.out.print(b + " ");
		}

		System.out.println();
		// sum of first 10 natural numbers
		int sum = 0;
		for (int r = 1; r <= 10; r++) {
			sum += r;
		}
		System.out.print("sum=" + sum);

		System.out.println();
		// while loop
		// print even no from 1 to 20 using while loop
		int c1 = 0;
		while (c1 <= 20) {

			System.out.print(c1 + " ");
			c1 += 2;

		}

		System.out.println();
		// print numbers from 10 to 1 using for loop in reverse
		for (int p = 10; p >= 1; p--) {
			System.out.print(p + " ");
		}

		System.out.println();
		// find sum of first 5 numbers using a do-while loop
		int v = 1;
		sum = 0;
		do {
			sum += v;
			v++;
		} while (v <= 5);
		System.out.println("sum = " + sum);

		System.out.println();
		// print multiplication table of 5 using for loop
		for (int m = 1; m <= 10; m++) {
			System.out.println("5 * " + m + "= " + (5 * m));
		}

		System.out.println();
		// solid rectangle
		for (int a0 = 1; a0 <= 4; a0++) {

			for (int b0 = 1; b0 <= 5; b0++) {
				System.out.print("*" + " ");
			}

			System.out.println();
		}

		System.out.println();
		// hallow rectangle
		for (int n = 1; n <= 4; n++) {
			for (int m0 = 1; m0 <= 5; m0++) {
				if (n == 1 || n == 4 || m0 == 1 || m0 == 5) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();

		for (int e = 1; e <= 4; e++) {

			for (int f = 1; f <= 5; f++) {

				if (e == 1 || e == 4 || f == 1 || f == 5) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}

			}
			System.out.println();
		}

		// hallow rectangle
		for (int q = 1; q <= 6; q++) {
			for (int w = 1; w <= 7; w++) {
				if (q == 1 || q == 6 || w == 1 || w == 7) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		for (int d1 = 1; d1 <= 10; d1++) {
			if (d1 % 2 != 0) {
				System.out.print(d1 + " ");
			}
		}
		System.out.println();

		for (int s1 = 10; s1 >= 0; s1--) {
			System.out.print(s1 + " ");
		}
		System.out.println();
		for (int x = 1; x <= 10; x++) {
			System.out.println(6 * x);
		}
		
		System.out.println();
		for (int xx = 1; xx <= 10; xx++) {
			System.out.println(6+"*"+xx+"="+6*xx);
		}
		
		System.out.println();
		for(int aa=1;aa<=4;aa++) {
			for(int bb=1;bb<=5;bb++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int cc=1;cc<=4;cc++) {
			for(int dd=1;dd<=5;dd++) {
				if(cc==1 || cc==4 || dd==1 || dd==5) {
				System.out.print("* ");	
				}
				else {
					System.out.print("  ");
				}
				//System.out.println();
			
			}
			System.out.println();
		}
		System.out.println();
		//half pyramid
		for(int ss=1;ss<=4;ss++) {
			for(int vv=1;vv<=ss;vv++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();
		//half pyramid with numbers
		for(int ss=1;ss<=4;ss++) {
			for(int vv=1;vv<=ss;vv++) {
				System.out.print(vv+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		for(int ss=1;ss<=4;ss++) {
			for(int vv=1;vv<=ss;vv++) {
				System.out.print(ss+" ");
			}
			System.out.println();
		}
		System.out.println();
		//inverted half pyramid
		for(int l=4;l>1;l--) {
			for(int h=1;h<=5;h++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}
