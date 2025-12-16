package Array;

public class singledarray {
	
	
public static void main(String[] args) {
	
	//by allocating memory by using for each or enhance loop
	int[]a = new int[5];
	
	a[0]=90;
	a[1]=89;
	a[2]=78;
	a[3]=80;
	a[4]=67;
	//a[5]=9;
	for(int i : a) {
		System.out.println(i);
	}
	
	System.out.println(a.length);
	System.out.println("value of index a[3] is as:" + a[3]);
	System.out.println("length of array is as:"+ (a.length));
	
	
	String[]t=new String[6];
	
	t[0]="homework";
	t[1]="home";
	t[2]="work";
	t[3]="k";
	t[4]="g";
	t[5]="i";
	
	for(String r:t) {
		System.out.println(r);
	}
	
	//by allocating memory by using for loop
int[]p = new int[5];
	
	p[0]=90;
	p[1]=89;
	p[2]=78;
	p[3]=80;
	p[4]=67;
	
	for(int f=0;f<p.length;f++) {
		System.out.println(p.length);
	}
	
String[]l=new String[6];
	
	l[0]="homework";
	l[1]="home";
	l[2]="work";
	l[3]="k";
	l[4]="g";
	l[5]="i";
	for(int y=0;y<6;y++) {
		System.out.println(l[y]);
	}
	
	
	//without allocating memory
	
	//without allocating memory by using for each or enhance loop
	int []d = { 67,78,90,89};
	
	for(int a1:d) {
		System.out.println(a1);
	}
	System.out.println("length of array is as:"+ (d.length));
	
	
	char[]c= {'a','b','c','d'};
	for(char b1:c) {
		System.out.println(b1);
	}
	
	
	//without allocating memory by using for loop
	char[]n= {'a','b','c','d','e'};
	for(int w=0;w<5;w++) {
		System.out.print(n[w]+" ");
	}
	System.out.println();
	System.out.println("length of array is :"+ n.length);
	System.out.println("value of index [1] is as "+n[1]);
}
}
