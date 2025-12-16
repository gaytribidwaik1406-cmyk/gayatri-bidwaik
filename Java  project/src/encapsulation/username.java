package encapsulation;

public class username {

	 private int pin_code =4567;
	//method argument 
	public void name(int a) {
		pin_code=a;
		System.out.println(pin_code);
	}
	
	int number =45678965;
	public void men(int b) {
		number =b;
		System.out.println(number);
	}
	public static void main(String[] args) {
		
		username d=new username();
		d.name(4444);
		d.men(123456788);
	}

}
