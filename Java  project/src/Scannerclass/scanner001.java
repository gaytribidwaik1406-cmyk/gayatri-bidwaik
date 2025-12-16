package Scannerclass;

import java.util.Scanner;

public class scanner001 {

	
    public static void main(String[] args) {
	
	  Scanner sc=new  Scanner(System.in);
	  
	   //nextInt
	  //addition of two 
      System.out.println("-------------nextInt----------");
	  System.out.println("enter first number ");
	  int a = sc.nextInt();
	  System.out.println("enter second number ");
	  int b = sc.nextInt();
	  System.out.println("addition of two number is ");
	   int c = a+b;
	   System.out.println(c);
	   
	   
	   System.out.println();
	   System.out.println("---------nextFloat----------");
	 //nextFloat
	   //multiplication of two number
	System.out.println("enter first number");
	float d = sc.nextFloat();
	System.out.println("enter second number");
	float e = sc.nextFloat();
	System.out.println("Result will be");
	float f = d*e;
	System.out.println(f);
	
	System.out.println();
	System.out.println("-----------nextDouble--------");
	System.out.println("enter first number");
	 double g = sc. nextDouble();
	 System.out.println("enter second number");
	 double h = sc.nextDouble();
	 System.out.println("Result");
	 double t = g%h;
	 System.out.println();
	 
	 System.out.println();
	 System.out.println("---------nextLong----------");
	 System.out.println("enter first number");
	 long y = sc.nextLong();
	 System.out.println("enter second number");
	 long u = sc.nextLong();
	 System.out.println("result");
	 long i=y-u;
	 System.out.println(i);
	 
	 System.out.println();
	 System.out.println("--------nextByte----------");
	 System.out.println("enter first number");
	 byte l=sc.nextByte();
	 System.out.println("enter second number");
	 byte o=sc.nextByte();
	 System.out.println("result will be");
	 int k = l%o;
	 System.out.println(k);
	 
	 System.out.println();
	 System.out.println("-----------nextShort--------");
	 System.out.println("enter first number");
	 short a1 = sc.nextShort();
	 System.out.println("enter second number");
	 short b1 = sc.nextShort();
	 System.out.println("result will be");
	 int c1 = a1+b1;
	 System.out.println(c1);
	 
	 System.out.println();
	 System.out.println("-----------nextChar---------");
	 System.out.println("enter word1");
	  char d1 = sc.next().charAt(0);
	  //System.out.println("enter word2");
	  //char e1=sc.next().charAt(0);
	 System.out.println("the number is equal to");
	 char t1=d1;
	 System.out.println(t1);
	 
	 System.out.println();
	 System.out.println("------nextString-------");
	 System.out.println("enter first string");
	 String u1 = sc.nextLine();
	 System.out.println("enter second string");
	 String v1 = sc.nextLine();
	 System.out.println("the result will be");
	 String j1=u1+v1;
	 System.out.println(j1);
	 
	 System.out.println();
	 System.out.println("-----");
	 
	 
	 
}
}
