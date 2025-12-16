package polymorphism;

public class overloading {

	public void age() {
		System.out.println("details from child class");
	}

	public void age(String s) {
		System.out.println("details from child class");
	}

	public void age(int a) {
		System.out.println("details from child class");
	}

	public void age(char c) {
		System.out.println("details from child class");
	}

	public void age(double d) {
		System.out.println("details from child class");
	}

	public static void main(String[] args) {

		overloading i=new overloading();
		i.age();
		i.age(5);
		i.age(9);
		i.age("stp");
		i.age('G');
	}

}
