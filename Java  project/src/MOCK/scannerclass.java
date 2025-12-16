package MOCK;

import java.util.Scanner;

public class scannerclass {
	
	public static void main(String[] args) {
		
		Scanner r=new Scanner(System.in);
		
		System.out.println("enter first alphabet");
		char a=r.next().charAt(0); 
		System.out.println("enter sec aplhabet");
		char b=r.next().charAt(0);
		
		//enter table 
		int i=r.nextInt()	;
		for(int p=1;p<=10;p++) {
			System.out.println(i+"*"+p+"="+i*p);
		}
				}
} 
