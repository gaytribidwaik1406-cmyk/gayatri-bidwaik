package user001;

public class practice1 {
	
	
public static void main(String[] args) {
	
	//print no from 1 to 50
	for(int a=1;a<=50;a++) {
		System.out.print(a +" ");
	}
	
	System.out.println();
	
	//print even no from 1 to 50
	for(int b=1;b<=50;b++) {
		if(b % 2  == 0) {
			System.out.print(b +" ");
		}
		}
	 System.out.println();
	//print odd no from 1 to 50
	for(int b=1;b<=50;b++) {
		if(b % 2  != 0) {
			System.out.print(b +" ");
		}
	}
	 System.out.println();
	//print largest no among 3 no
	int c=90;
	int d=89;
	int e=78;
	if(c>d&&e>d) {
		System.out.println("c is largest no ");
	} 
	else if(d>e&&d<e) {
		System.out.println("d is largest no");
	}
	else {
		System.out.println("e is largest no");
	}
	
	System.out.println();
	//print automation 5 times
	for(int f=1 ;f<=5;f++) {
		System.out.println("testing");
	}
	
	System.out.println();
	//print 1 odd no then even no double odd no then even no from 1 to 50
	for(int g=1;g<=50;g++) {
		if(g%2==0) {
			System.out.println("even number " +g);
		}else {
			System.out.println("odd number"+g);
		}
	}
	
	System.out.println();
	
	
	}
		
}


