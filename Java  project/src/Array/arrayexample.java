package Array;

import java.util.Arrays;

public class arrayexample {

	public static void main(String[] args) {
		
		//reverse of array 
		int [] a = {20,30,40,50};
		
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
			
		}
		System.out.println(Arrays.toString(a));
		
		char[] b = {};
		
		for(int d=b.length-1;d>=0;d--) {
			System.out.println(b[d]);
			
		}
		System.out.println(Arrays.toString(b));
		
		//duplicate in array
		
		int [] n = {200,300,400,800,300,200,300,100};
		 
		int num=300;
		 int count =0;
		 
		 for(int values:n) {
			 if(values==num) {
				 count++;
			 }
		 }
		 System.out.println("how many times the 300 num duplicate in array? "+count);
		
		 
		 System.out.println();
		 int [] c1= {30,90,67,89,30,30,30};
		 
		 int number = 30;
		 count=0;
		 
		 for( int value: c1) {
			 if(value==number) {
				 count ++;//1 
			 }
			 
		 }
		 System.out.println("30 number is duplicate in " +count+" times");
		 
}
}
