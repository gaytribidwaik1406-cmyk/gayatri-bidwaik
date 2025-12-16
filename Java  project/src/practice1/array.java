package practice1;

public class array {

	public static void main(String[] args) {
		// single dimensional array
		int[] a = new int[5];

		a[0] = 45;
		a[1] = 56;
		a[2] = 34;
		a[3] = 9;
		a[4] = 89;

		// for each loop / enhance loop
		for (int i : a) {
			System.out.print(i);
		}

		System.out.println();

		// for loop
		for (int b = 0; b <= 4; b++) {
			System.out.print(a[b]);

		}
		// length = int 4 byte and length 5=4*5=20 . length is 20
		System.out.println();
		// without allocating memory
		// for each loop
		int[] d = { 2, 4, 5, 6, 7 };
		for (int n : d) {
			System.out.print(n);
		}

		System.out.println();
		float[] f = { 56.7f, 56.8f };
		for (float j : f) {
			System.out.println(j);
		}

		// multi d array
		int[][] p = new int[2][3];

		p[0][0] = 56;
		p[0][1] = 56;
		p[0][2] = 56;

		p[1][0] = 56;
		p[1][1] = 56;
		p[1][2] = 56;

		for (int j = 0; j < 2; j++) {
			for (int k = 0; k < 3; k++) {
				System.out.print(p[j][k] + " ");
			}
			System.out.println();

		}

		// 4*5
		int[][] e = new int[4][5];
		e[0][0] = 67;
		e[0][1] = 27;
		e[0][2] = 37;
		e[0][3] = 57;
		e[0][4] = 47;

		e[1][0] = 67;
		e[1][1] = 47;
		e[1][2] = 57;
		e[1][3] = 67;
		e[1][4] = 07;

		e[2][0] = 67;

		e[2][1] = 64;
		e[2][2] = 66;
		e[2][3] = 65;
		e[2][4] = 60;
		{
			
		}
		e[3][0] = 67;

		e[3][1] = 67;
		e[3][2] = 97;
		e[3][3] = 07;
		e[3][4] = 27;

		
		for(int w=0;w<4;w++) {
			for(int u=0;u<5;u++) {
				System.out.print(e[w][u]+" ");
			}
			System.out.println();
		}
	}
}
