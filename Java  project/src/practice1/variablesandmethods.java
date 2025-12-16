package practice1;

public class variablesandmethods {

	int a = 90;
	static int i = 12;

	public void women() {
		System.out.println(a);
		variablesandmethods p = new variablesandmethods();
		System.out.println(p.i);

	}

	public static void men() {
		variablesandmethods g = new variablesandmethods();
		System.out.println(g.a);
		System.out.println(i);
	}

	public static void main(String[] args) {

		variablesandmethods h = new variablesandmethods();
		h.women();
		men();
		variablesandmethods.men();
	}
}
