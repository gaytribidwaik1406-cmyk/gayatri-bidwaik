package practice1;

public class constructor {

//	public constructor() {
//		System.out.println(4);
//	}
	
	public constructor(int a,float b,char c) {
		System.out.println("stp");
	}
	
	public void main() {
		System.out.println("stp");
	}
	
	public static void main(String[] args) {
		
		constructor a=new constructor(3,4.6f,'g');
		//whenever we create the object object ka control constcurtor pe jayega
		
		a.main();
	}

}
