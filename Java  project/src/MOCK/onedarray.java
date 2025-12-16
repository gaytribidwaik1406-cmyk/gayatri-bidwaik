package MOCK;

public class onedarray {

	public static void main(String[] args) {
		//by allocating memory using for each loop or enhance loop
		int [] a=new int[6];
		
		a[0]=23;
		a[1]=24;
		a[2]=25;
		a[3]=26;
		a[4]=93;
		a[5]=43;
		
		for(int i:a) {
			System.out.print(i+" ");
		}
		System.out.println();

		System.out.println("length of array is as:"+a.length);
		System.out.println("value at index 5:"+a[5]);
		
		//by allocating memory using for loop
		String [] t=new String[3];
		t[0]="gayu";
		t[1]="anu";
		t[2]="minu";
		
		for(int r=0;r<3;r++) {
			System.out.println(t[r]);
		}
		
		//by without allocating memory using for each loop
		int[]e= {89,78,68,58};
		for(int p:e) {
			System.out.println(p);
//			System.out.println("length of array is as:"+e.length);
		}
		System.out.println("length of array is as:"+e.length);
		
		//by without allocating memory using for loop
		char [] c= {'a','b','c','d','e'};
		for(int r=0;r<5;r++) {
			System.out.println(c[r]);
		}
	}
}
