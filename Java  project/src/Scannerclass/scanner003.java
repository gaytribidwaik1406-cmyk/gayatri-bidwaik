package Scannerclass;

import java.util.Scanner;

public class scanner003 {

    public static void main(String[] args) {
    	
    	//print table
    	System.out.println("print no");
    	Scanner s=new Scanner(System.in);
    	int b=s.nextInt();
    	for(int a=1;a<=20;a++) {
    		System.out.println(b+"*"+a+"="+b*a);
    	}
    	
    	System.out.println("enter percentage");
    	float h=s.nextFloat();
    	if(h>=90) {
    		System.out.println("eligible for placement");
    	}else {
    		System.out.println("not eligible for placement");
    	}
    		
    		
    }
}