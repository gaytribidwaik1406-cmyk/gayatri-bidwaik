package user001;

public class nestedforloop {
	
	
public static void main(String[] args) {
	//outer loop from 1 to 5 
	//inner loop from 1 to 3
	for( int a=1; a<=5 ;a++){
		System.out.println(" the valus of outer loop is as : " +a);
		
		for( int b=1;b<=3;b++) {
			System.out.println(b);
		}
	}
	
	//solid rectangle
	//outer loop - values of row 1to4
	//inner loop - values of column 1to5
	for(int c=1;c<=4;c++) {
		//System.out.print("c"+" ");
		
	for(int d=1;d<=5;d++) {
		System.out.print("*"+" ");
		
			}
		System.out.println();
	}
	
	for(int c=1;c<=4;c++) {
		//System.out.print("c"+" ");
		
	for(int d=1;d<=5;d++) {
		System.out.print(c+" ");
		
			}
		System.out.println();
	}
	
	//hallow rectangle 
	//outer loop 1 to 4
	//inner loop 1 to 5
	for(int e=1;e<=4;e++) {
		
		for(int f=1;f<=5;f++) {
			
			if(e==1||e==4||f==1||f==5) {
				System.out.print("* ");
			}else {
				System.out.print("  ");
		}
		
	}
		System.out.println();
}
	
	//half pyramid
	for(int g=1;g<=4;g++) {
		for(int h=1;h<=g;h++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	//half pyramid with numbers
	for(int g=1;g<=4;g++) {
		for(int h=1;h<=g;h++) {
			System.out.print(h+" ");
		}
		System.out.println();
	}
	
	//inverted half pyramid
	for(int z=1;z<=4;z++) {
		{
			System.out.print("*"+" ");
		}
		System.out.println();
	}
}
}

