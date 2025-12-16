package user001;

public class Localvariable {
	//local variable : inside the class and inside the method 
	public void username() {
	int p=80;
	char j='A';
	System.out.println(p);
	System.out.println(j);
	}
	
	public static void login() {
		float t=90.00f;
		int g=9;
		System.out.println(t);
		System.out.println(g);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Localvariable o=new Localvariable();
		o.username();
		
		
		Localvariable.login();
	}
		

		


}
