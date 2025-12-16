package practice1;

import java.util.Arrays;
import java.util.Scanner;

public class arraymethods {

	public static void main(String[] args) {

		// hetrogenous data type
		Object[] a = { 6, 56.8f, "stp", 'G' };

		// object class=root class

		for (Object i : a) {
			System.out.println(i);
		}

		System.out.println();

		// sorting of array
		int[] b = { 900, 88, 66, 55 };
		System.out.println("before sysout");
		System.out.println(Arrays.toString(b));

		System.out.println();
		char[] c = { 'a', 'b', 'c' };
		System.out.println(Arrays.toString(c));

		System.out.println();
		// reverse of array
		int d[] = { 56, 78, 90, 78 };
		for (int e = d.length - 1; e >= 0; e--) {
			System.out.print(d[e] + " ");

		}
		System.out.println();
		System.out.println(Arrays.toString(d));

		System.out.println();
		
		// duplicate in array
		int m[] = { 800, 700, 800, 800, 900 };
		int num = 800;
		int count = 0;

		for (int values : m) {
			if (values == num) {
				count++;
			}
		}
		System.out.println(count);
		
		System.out.println();
		
		//scanner in array
		int n[]=new int [3];
		Scanner s=new Scanner(System.in);
		
		for(int j=0;j<3;j++) {
			n[j]=s.nextInt();
		}
		System.out.println(Arrays.toString(n));
	}
}