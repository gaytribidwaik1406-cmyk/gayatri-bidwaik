package practice1;

public class patterns {

	
	public static void main(String[] args) {
//		rectangle
//		for(int a=1;a<=4;a++) {
//			
//			for(int b=1;b<=4;b++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		//hollow rectangle
//		for(int a=1;a<=4;a++) {
//			for(int b=1;b<=5;b++) {
//				if(a==1||b==1||a==4||b==5) {
//					System.out.print("* ");
//				}else {
//					System.out.print("  ");
//				}
//				
//			}
//			System.out.println();
//		}
//		
//		//half pyramid
//		for(int c=1;c<=4;c++) {
//			for(int d=1;d<=c;d++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		
//		//half pyramid with no
//		for(int e=1;e<=4;e++){
//			for(int f=1;f<=e;f++) {
//				System.out.print(f);
//			}
//			System.out.println();
//		}
//		
		//inverted half pyramid
		for(int g=4;g>=1;g--) {
			for(int u=1;u<=g;u++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		//inverted half pyramid with numbers
		for(int v=5;v>=1;v--) {
			for(int y=1;y<=v;y++) {
				//System.out.print(v+" ");
				System.out.print(y);
			}
			System.out.println();
		}
		
		System.out.println();
		//0-1 traingle
		for(int n=1;n<=4;n++) {
			for(int m=1;m<=n;m++) {
				if((n+m)%2==0) {
					System.out.print("1");
				}else {
					System.out.print("0");
				}
				
			}
			System.out.println();
		}
	}
}
