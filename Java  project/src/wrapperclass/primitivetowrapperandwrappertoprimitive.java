package wrapperclass;

public class primitivetowrapperandwrappertoprimitive {

	public static void main(String[] args) {
		
		//primitve to wrapper
		int a=90;
		Integer i=Integer.valueOf(a);
		System.out.println(i);

		char p='u';
		Character g=Character.valueOf(p);
		System.out.println(g);
		
		//wrapper to primitive
		Long h=new Long(677);
		long d=h.longValue();
		System.out.println(d);
		
		Integer b=new Integer(89);
		int r=b.intValue();
		System.out.println(r);
	}

}
