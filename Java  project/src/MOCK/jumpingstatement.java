package MOCK;

public class jumpingstatement {

	public static void main(String[] args) {
		// break
		// it is used to break the execution

		for (int a = 2; a <= 10; a++) {
			System.out.print(a + " ");
			if (a == 4) {
				break;
			}
		}

		System.out.println();
		// break statement in while loop
		int b = 1;
		while (b <= 10) {
			System.out.print(b + " ");
			if (b == 6) {
				break;
			}
			b++;
		}
		System.out.println();
		// break statement in do while loop
		int c = 1;
		do {
			System.out.print(c + " ");
			if (c == 5)
				break;
			c++;
		} while (c <= 10);

		System.out.println();

		int d = 10;
		do {
			System.out.print(d + " ");
			if (d == 15)
				break;
			d++;
		} while (d <= 20);

		System.out.println();
		int g = 50;
		while (g <= 70) {
			System.out.print(g + " ");
			if (g == 65) {
				break;
			}
			g++;
		}
		System.out.println();
		int u = 1;
		do {
			System.out.print(u + " ");
			if (u == 57)
			break;
			u++;
		} while (u <= 80);
		System.out.println();
		
		//continue keyword
		for(int s=1;s<=20;s++) {
			if(s==10) {
				continue;
			}
			System.out.print(s+" ");
		}
		
		System.out.println();
		//continue keyword in while loop
		int r=0;
		while(r<=10) {
			r++;
			if(r==5) {
				continue;
			}
			System.out.print(r+" ");
		}
		
		int i=9;
		while(i<=50) {
			i++;
			if(i==45) {
				continue;
			}
			System.out.print(i+" ");
		}
		
		System.out.println();
		int p=0;
		while(p<=11) {
			p++;
			if(p==4) {
				continue;
			}
			System.out.print(p+" ");
		}
		
		System.out.println();
		int o=1;
		do {
			o++;
			if(o==10) {
				continue;
			}
			System.out.print(o+" ");
		}while(o<=20);
	}
}
