package Array;


public class arrayofarray {
	//we want to print the o/p as row and column 
	
 public static void main(String[] args) {
	
	 int [][]i=new int[3][4];
	 //row 0 to 2
	 //column 0 to 3
	  
	 //nested for loop
	i[0][0]=89;
	i[0][1]=80;
	i[0][2]=78;
	i[0][3]=89;
	
	i[1][0]=90;
	i[1][1]=70;
	i[1][2]=20;
	i[1][3]=89;
	
	i[2][0]=90;
	i[2][1]=70;
	i[2][2]=20;
	i[2][3]=89;
	
	
	 for(int a=0;a<3;a++) {
		 for(int b=0;b<4;b++) {
			 System.out.print(i[a][b] +" ");
		 }
		 System.out.println();
	 }
	 
	 System.out.println();
	 char[][]r=new char[3][2];
	  
	 r[0][0]='A';
	 r[0][1]='B';
	 
	 r[1][0]='A';
	 r[1][1]='B';
	 
	 r[2][0]='A';
	 r[2][1]='B';
	 
	 for(char p=0;p<3;p++) {
		 for(char q=0;q<2;q++) {
			 System.out.print(r[p][q]+" ");
		 }
		 System.out.println();
	 }
	 
	 System.out.println();
	 
	 String[][]t=new String[4][5];
	 
	 t[0][0]="manual";
	 t[0][1]="automation";
	 t[0][2]="manual";
	 t[0][3]="automation";
	 t[0][4]="testing";
	 
	 t[1][0]="manual";
	 t[1][1]="automation";
	 t[1][2]="manual";
	 t[1][3]="automation";
	 t[1][4]="testing";
	 
	 t[2][0]="manual";
	 t[2][1]="automation";
	 t[2][2]="manual";
	 t[2][3]="automation";
	 t[2][4]="testing";
	 
	 t[3][0]="manual";
	 t[3][1]="automation";
	 t[3][2]="manual";
	 t[3][3]="automation";
	 t[3][4]="testing";
	 
	 
	 for(int a1=0;a1<4;a1++) {
		 for(int b1=0;b1<5;b1++) {
			 System.out.print(t[a1][b1]+" ");
		 }
		 System.out.println();
	 }
}
}
