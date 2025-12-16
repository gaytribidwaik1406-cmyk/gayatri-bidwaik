package MOCK;

public class Instancevariable {
	
	int a=90;
	String s="abc";
	char c='A';

	//access instance variable into instance method
	public void main() {
		System.out.println(a);
		System.out.println(s);
		System.out.println(c);
	}
	
	//access instance variable into static method
	public static void num() {
		Instancevariable g=new Instancevariable();
		System.out.println(g.a);
		System.out.println(g.s);
		System.out.println(g.c);
		
	}
 public static void main(String[] args) {
	
	 //access instance method into main method
	 Instancevariable h=new Instancevariable();
	 h.main();
	 //access static method into main method
	 Instancevariable.num();
	 
}
}
