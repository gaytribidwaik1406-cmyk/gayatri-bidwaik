package MOCK;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("enter first string");
		String a = s.nextLine();

		System.out.println("enter sec string");
		String b = s.nextLine();

		System.out.println("combination of these two");
		String c = a + b;
		System.out.println(c);

		// print table of any number
		int g = s.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(g + "*" + i + "=" + g * i);
		}
	}
}
