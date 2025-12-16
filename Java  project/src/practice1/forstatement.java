package practice1;

public class forstatement {

	public static void main(String[] args) {
		
		//print 1 to 20
		for(int a=1;a<=20;a++) {
			System.out.print(a+" ");
		}
		 System.out.println();
		 //even no from 1 to 50
		for(int i=1;i<=50;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			
			}
		}
		System.out.println();
		//print 6 table
		for(int b=1;b<=10;b++) {
			System.out.println(6*b);
		}
		
		//print 10 table in format
		for(int c=1;c<=10;c++) {
			System.out.println("10*"+c+"="+10*c);
		}
		
		System.out.println();
		
		//print 1 even no 1 odd no
		for(int d=1;d<=20;d++) {
			if(d%2!=0) {
				System.out.println(d);
			}else {
				System.out.println(d);
			}
		}
		
		for(int s=1;s<=3;s++) {
			System.out.println(s);
			for(int g=1;g<=2;g++) {
				System.out.print(g);
			}
		}
		
		
	}

}
