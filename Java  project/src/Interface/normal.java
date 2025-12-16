package Interface;

public class normal implements intercafeA ,interfaceB{
	

	public static void main(String[] args) {
		normal p=new normal();
		p.main2();
		p.mani1();
		System.out.println(p.c);
		System.out.println(p.a);
		System.out.println(p.c);
		//alternate method to access static method
		//class name.method name
		intercafeA.main();
		System.out.println(p.i);
		System.out.println(p.u);
		interfaceB.main5();
	}

	
	public void mani1() {
		
	}

	
	public void main2() {
		
	}


	@Override
	public void main4() {
		// TODO Auto-generated method stub
		
	}

}
