package MOCK;

public class staticvariablemock {

	static int a=90;
	static String s="abc";
	static char c='A';
	
	//access static variable into instance method
	public void main() {
		System.out.println(a);
		System.out.println(s);
		System.out.println(c);
	}
	
	//access static variable into static method
	public static void num() {
		System.out.println(a);
		System.out.println(s);
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		
		//access instance method into main method
		staticvariablemock b=new staticvariablemock();
		b.main();
		//access static method into main method
		staticvariablemock.num();
		
	}
	}

	
