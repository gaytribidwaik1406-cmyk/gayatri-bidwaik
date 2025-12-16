package overiding;

public class loginh extends username {

	public void age() {
		System.out.println("enter deatils from child class");
	}
	public void personal() {
		System.out.println("enter details from child class");
	}
	public void person() {
		System.out.println("enter details from child class");
	}
	
	public static void main(String[] args) {
	
		loginh g=new loginh();
		g.age();
		g.person();
		g.personal();
		
		//only child class access method

		//3rd property - 
		username i=new loginh();
		i.age();
		i.person();
		i.personal();
		
		//compile time pe child class ka and after run time pe parent class
		
		//has a relationship
		username a=new username();
		a.age();
		a.person();
		a.personal();
	}

}
