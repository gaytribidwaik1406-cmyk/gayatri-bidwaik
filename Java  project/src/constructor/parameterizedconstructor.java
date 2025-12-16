package constructor;

public class parameterizedconstructor {
	
	public parameterizedconstructor (int k,float b) {
		System.out.println("automation"); 
		System.out.println("the value of k is "+k);
		System.out.println("the value of b is "+b);
		System.out.println("manual");
	}
	
 public static void main(String[] args) {

 parameterizedconstructor p=new parameterizedconstructor(3,45.5f);
 System.out.println("abcd");
 }
 
}
