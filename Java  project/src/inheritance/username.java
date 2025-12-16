package inheritance;

public class username {
	
	int a=5;
	public void main() {
		
		System.out.println("test");
	}
	
	public static void age() {
		System.out.println("test2");
	}
	
	public static void main(String[] args) {
		

		username p=new login();
		System.out.println(p.a);
		p.main();
		p.age();
		
		
	}

}
