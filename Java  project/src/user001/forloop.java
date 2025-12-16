package user001;

public class forloop {
	
	public static void main(String[] args) {
		//execution from 1 to 10
		for(int a=1;a<=10;a++) {
		System.out.print(a+" ");
		}
		System.out.println();
		//execution from 10 to 1
		for(int b=10;b>=1;b--) {
			System.out.print(b+" ");
		}
		System.out.println();
		//execute even num from 1 to 50
		for(int c=1;c<=50;c++) {
			if(c%2==0) {
				System.out.print(c+" ");
			}
		}
		System.out.println();
		//execute odd num from 1 to 50
		for(int d=1;d<=50;d++) {
			if(d%2!=0) {
				System.out.print(d+" ");
			}
		}
		  System.out.println();
		//execute testing for 5 times
		for(int g=1;g<=5;g++) {
			System.out.println("testing");
		}
		
		//print even num from 1 to 10
		for(int p=0;p<=10;p+=2) {
			System.out.print(p);
		}
		 System.out.println();
		//print odd num from 1 to 10
		for(int k=1;k<=10;k+=2) {
			System.out.print(k);
		}
	}

}
