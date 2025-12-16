package practice1;

public class ifstatement {

	public static void main(String[] args) {
		
		//if statement 
		int a=23;
		if(a>=24) {
			System.out.println("eligible for test");
		}else {
			System.out.println("not");
		}
		
		//if else statement
		int person_age =18;
		if(person_age>=18) {
			System.out.println("eligible for vote");
		}else {
			System.out.println("not elgible for vote");
		}
		
		int i=5;
		if(i%2==0) {
			System.out.println("even no");
		}else {
			System.out.println("odd no");
		}
		
		//if else if statement or ladder statement 
		int b=90;
		int c=89;
		int d=78;
		if(b>c && c>d) {
			System.out.println("a is largest");
		}else if(c>d &&b>d){
			System.out.println("b is largest ");
			
		}else {
			System.out.println("c is largest");
		}
		
		//month name on the basis of month number
		int month_no=6;
		if(month_no==1) {
			System.out.println("jan");
			
		}else if(month_no==2) {
			System.out.println("feb");
		}else if(month_no==3) {
			System.out.println("march");
		}else if(month_no==4) {
			System.out.println("april");
		}else if(month_no==5) {
			System.out.println("may");
		}else if(month_no==6) {
			System.out.println("june");
		}else if(month_no==7) {
			System.out.println("july");
		}else if(month_no==8) {
			System.out.println("aug");
		}else if(month_no==9) {
			System.out.println("sep");
		}else if(month_no==10) {
			System.out.println("oct");
		}else if(month_no==11) {
			System.out.println("nov");
		}else {
			System.out.println("dec");
		}
		
		//nested if
		int h=67;
		if(h<50) {
			System.out.println("yes"); 
		}if(h>100) {
			System.out.println("yes");
		}if(h==50) {
			System.out.println("yes");
		}if(h==100) {
			System.out.println("yes");
		}if(h<=67) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		
		
		
		
		
	}

}
