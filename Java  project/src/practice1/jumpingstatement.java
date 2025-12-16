package practice1;

public class jumpingstatement {

	public static void main(String[] args) {

		for (int a = 1; a <= 10; a++) {
			System.out.print(a + " ");
			if (a == 7) {
				break;
			}
		}
		
		System.out.println();
		//break keyword in while loop
		int c=10;
		while(c>=1) {
			System.out.print(c+" ");
			if(c==6) {
				break;
			}
			c--;
		}
		
		
		
		
		
		 System.out.println();
		 
		 //continue 
		for(int b=1;b<=20;b++) {
			if(b==15) {
				continue;
			}
			System.out.print(b+" ");
		}
	}

}
