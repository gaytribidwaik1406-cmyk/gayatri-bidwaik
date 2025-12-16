package Scannerclass;

import java.util.Scanner;

public class scanner002 {

	public static void main(String[] args) {
		//for loop 
		Scanner sc = new Scanner (System.in);

		System.out.println("----enter table of 4------");
		int b = sc.nextInt();
		for( int a=1;a<=10;a++) {
			
			System.out.println(b+"*"+a+"="+(b*a));
			
			
		}
		
		
		System.out.println("--------------switch statement----------");
		System.out.println("enter even no");
		
		int a1=sc.nextInt();
		
		switch(a1) {
		case 1:
			System.out.println("even no 2");
			break;
		case 2:
			System.out.println("even no 4");
			break;
		case 3:
			System.out.println("even no 6");
			break;
		case 4:
			System.out.println("even no 8");
			break;
		case 5:
			System.out.println("even no 10");
			break;
		case 6:
			System.out.println("even no 12");
			break;
		case 7:
			System.out.println("even no 14");
			break;
			
			default:
				System.out.println("invalid even no");
				break;
			
		
	}

}
}
