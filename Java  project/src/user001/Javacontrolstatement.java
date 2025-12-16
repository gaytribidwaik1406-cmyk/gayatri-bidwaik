package user001;

public class Javacontrolstatement {

	public static void main(String[] args) {
		
		//if statement
		int a=90;
		if(a>78) {
			System.out.println(a);
		}
		int b=80;
		if(b>=90){
		System.out.println(b);
		}
		//will not execute 
		
		//if else statement
		int person_age =18;
		if(person_age >20) {
			System.out.println("eligible for vote");
		}
		else {
			System.out.println("not eligible for vote ");
		
		}
		
		int student_marks =90;
		if(student_marks>75) {
			System.out.println("eligible to participate in debate competition");
			
		}
		else {
			System.out.println("not eligible to participate in debate compititon");
		}
		
		//if else if statement
		
		int e=45;
		int w=67;
		int q=20;
		//find largest no among them
		if(e>w&&w<q) {
			System.out.println("e is  the largest no");
		}
		else if(w>e&&q>w) {
			System.out.println("w is the largest no");
			
		}
		else {
			System.out.println("q is the largest no");
		}
		
		//find smallest no among them 
		int p=45;
		int l=67;
		int h=20;
		if(p>l&&p>h) {
			System.out.println("p is the smallest no");
		}
		else if(p>l||l>p) {
			System.out.println("l is the smallest no");
		}
		else if(h>p||h>l){
			System.out.println("l is the smallest no");
			
		}
		else {
			System.out.println("l is the smallest no");
		}
		
		//find largest no from 2 variable
		int a1=89;
		int b1=90;
		if(a1>b1) {
			System.out.println(" largest no :"+a1);
		}
		else {
			System.out.println("largest no :"+b1);
		}
		
		//find smallest no from 2 variable
		int c1=100;
		int d1=201;
		if(d1>c1) {
			System.out.println("c1 is the smallest no");
		}
		else {
			System.out.println("d1 is the smallest no");
		}
		
		
	}
		

}

