package inheritance;

public class login extends username {

	//login=child class and username=parent class
	int r=90;
	public static void man() {
		System.out.println("tester");
	}
	public static void main(String[] args) {
		
		login s=new login();
		s.main();
		s.age();
		System.out.println(s.a);
		s.man();
		System.out.println(s.r);
		
		
	}
}
