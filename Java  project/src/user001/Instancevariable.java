package user001;

class Instancevariable {
	
	char b='S';
	String p="abc";
	
	

	//instance method 
	public void username () {
		System.out.println(b);
		System.out.println(p);
	}
	
	//static method 
	public static void manju() {
		Instancevariable k=new Instancevariable();
		
		System.out.println(k.b);
		System.out.println(k.p);
		
	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//instance method into main method 
		Instancevariable f=new Instancevariable();
		f.username();
	
		
		//static method into main method 
		Instancevariable.manju();
		
		
	}

}
