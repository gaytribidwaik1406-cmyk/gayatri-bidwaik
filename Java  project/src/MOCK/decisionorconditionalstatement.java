package MOCK;

public class decisionorconditionalstatement {

	public static void main(String[] args) {
		int i = 91;
		
		if (i <= 90) {
			System.out.println(i);
		}
		
		if(i<=90) {
			System.out.println(i);
		}else {
			System.out.println("no");
		}

		int p = 90;
		if (p >= 90) {
			System.out.println("elegible for testing");
		} else {
			System.out.println("not eligible for testing ");
		}

		System.out.println();
		System.out.println("--------check no is positive , negative or zero------");
		int u = -9;
		if (u > 0) {
			System.out.println("positive");
		} else if (u < 0) {
			System.out.println("negative");
		} else {
			System.out.println("zero");
		}

		System.out.println();
		System.out.println("----check no is even or odd");
		int g = 15;
		if (g % 2 == 0) {
			System.out.println("even no");
		} else {
			System.out.println("odd no");
		}

		System.out.println();
		System.out.println("----find greatest of two no");
		int s = 89;
		int r = 90;
		if (s > r) {
			System.out.println(" s is greater");
		} else {
			System.out.println(" r is greater");
		}

		System.out.println();
		System.out.println("----check if no is divisible by both 3 and 5");
		int num = 50;
		if (num % 3 == 0) {
			System.out.println("no is divisible by 3 only ");
		} else if (num % 5 == 0) {
			System.out.println("no is divisible by 5 only");
		} else if (num % 3 == 0 && num % 5 == 0) {
			System.out.println("no is divisible by 3 and 5 both");
		} else {
			System.out.println("no is not divisible by 3 and 5 both");
		}

		System.out.println();
		System.out.println("---check if character is vowel or consonant");
		char c = 'P';
		if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
			System.out.println("char is vowel");
		} else {
			System.out.println("char is consonent");
		}

		System.out.println();
		System.out.println("---find greatest no from 3 no----");
		int q=90;
		int w=89;
		int y=78;
		if(q>w && w>y) {
			System.out.println("q is greater");
		}else if(w>y && y<w) {
			System.out.println("w is greater");
		}else {
		    System.out.println("y is greater");
		}
		
		System.out.println();
		System.out.println("----nested if-----");
		int a1=34;
		if(a1>=50) {
			System.out.println("greater");
		}else if(a1>50) {
			System.out.println("smaller");
		}else if(a1<50) {
			System.out.println("not smaller");
		}else if(a1>50) {
			System.out.println("not greater");
		}else {
			System.out.println("zero");
		}
		
		
	}

}
