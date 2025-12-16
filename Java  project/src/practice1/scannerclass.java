package practice1;

import java.util.Scanner;

public class scannerclass {

	 
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter first element");
		int a =s. nextInt();
		System.out.println("enter sec element");
		char c=s.next().charAt(0);
		
		//print table of 7
		int b=s.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(i+"*"+b+"="+i*b);
		}
	}
}

