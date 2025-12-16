package user001;

public class Methodreturntype {
	
	//without return statement and no parameter
	public void testing () {
		int a=90;
		System.out.println(a);
	}
	
	//without return statment and with parameter
	public void name1( int b) {
		System.out.println(b);
		
	}
	
	//with return statement and with parameter 
	public static void main(String[] args) {
		Methodreturntype n=new Methodreturntype();
		n.testing();
		n.name1(89);
		
	}

}
