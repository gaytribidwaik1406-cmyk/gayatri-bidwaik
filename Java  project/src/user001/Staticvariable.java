package user001;

public class Staticvariable {
	
	static int l=80;
	
	//instance method
	public void username() {
		System.out.println(l);
		
	}
	// static method 
	public static void logout() {
		System.out.println(l);
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staticvariable g=new Staticvariable();
		g.username();
		
		Staticvariable.logout();

	}

}
