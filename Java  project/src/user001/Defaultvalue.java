package user001;

public class Defaultvalue {
	//primitive 8

	//numric 6
	//integer 4
	byte k;
	short s;
	int g;
	long l;
	
	//floating 2
	float h;
	static float f;
	double d;
	
	//non numeric 2
	boolean w;
	char b;
	
	//non primitive 2
	String p;
	//array 
	
	
	
	
	
	public static void main(String[] args) {
		//instance method into main method 
		Defaultvalue t=new Defaultvalue();
		System.out.println(t.k);
		System.out.println("The default value of byte is "+ (t.k));
		System.out.println("The default value of short is "+(t.s));
		System.out.println("The default value of int is "+(t.g));
		System.out.println("The default value of long is "+ (t.l));
		System.out.println("The default value of float is "+(t.h));
		System.out.println("The default value of char is "+ (t.b));
		System.out.println("The default value of boolean is "+(t.w));
		System.out.println("The default value of string is "+(t.p));
		System.out.println("The default value of string is "+(t.w));
		
		//static method into main method 
		System.out.println(f);
		System.out.println("The default value of float is " +(f));
		
		
		// TODO Auto-generated method stub

	}

}
