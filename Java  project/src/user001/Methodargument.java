package user001;

public class Methodargument {
	 int a ;
	 static byte o;
	 float s;
	static double j; 
	long n;
	static long r;
	String z;
	static String q;
	static String y;
	
	int e;
	float x;
	public void BIT (int j, float t) {
		e=j;
		x=t;
		// signature method : BIT (int , float )
		System.out.println(e);
		System.out.println(x);
		
	}
//instance method 
	public void name1(int b , float g , long m , String v ,String c ) {
		s=g;
		a=b;
		n=m;
		z=v;
		y=c;
		System.out.println(a);
		System.out.println(s);
		System.out.println(n);
		System.out.println(z);
		System.out.println(y);
		
	}
	//static method 
	public static void name2(byte u , double l, long h, String d) {
		o=u;
		j=l;
		r=h;
		q=d;
		
	}
	//main method 
	public static void main(String[] args) {
		Methodargument p=new Methodargument();
		p.name1(78 , 90, 78 , "STP", "data");
		
		
		Methodargument.name2((byte)80 , 89,80, "STP infotech ");
		
		
	}
	

}
