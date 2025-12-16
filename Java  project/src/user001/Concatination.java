package user001;

public class Concatination {

	public static void main(String[] args) {
		String p="STP";
		String j="Infotech" ;
		System.out.println(p+j);
		System.out.println("the name of institute : " +(p+j));
		// TODO Auto-generated method stub
		
		int a=3;
		int b=90;
		System.out.println("the addition of a and b :" + (a+b));
		
		
		//BSIL = we cannot stored the long into int , short , byte and cannot stored int into short and byte that means not stored the bigger data type into smaller one . 
		byte g=40;
		short h=60;
		int c=60;
		long k=g+h+c;
		System.out.println("The addition of the three variable i.e g+h+c :"+k);

		
		int o=90;
		short i=89;
		long n=o-i;
		System.out.println("The substraction of the o and i will be :" +(n));
		
		
	}

}
