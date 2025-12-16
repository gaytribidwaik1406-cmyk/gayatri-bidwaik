package Array;

import java.util.Arrays;


import java.util.Scanner;

public class scannerinarray {

	public static void main(String[] args) {
		
		//scanner in array
		
		//Scanner s = new Scanner (System.in); 
		
		
		int[]a = new int[4];
		
		Scanner s = new Scanner (System.in); 
		
		for(int i=0;i<4;i++) {
			a[i] = s.nextInt();
		}
		System.out.println(Arrays.toString(a));
		
		System.out.println();
		//enter character
	
		char [] b =  new char[5];//1D array with allocating memory
		
		Scanner r = new Scanner(System.in);
		
		for(int k=0;k<5;k++) {
			b[k] = r.next().charAt(0);
			
		}
		System.out.println(Arrays.toString(b));
		
		System.out.println();
		//enter name in console
		
		String [] c=new String[6];
		
		Scanner p = new Scanner (System.in);
		
		for(int g=0;g<6;g++) {
			c[g]=p.nextLine();
		}
		
		System.out.println(Arrays.toString(c));
		
	}
}


