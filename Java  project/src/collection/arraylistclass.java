package collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class arraylistclass {

	public static void main(String[] args) {
//		ArrayList<Integer> a=new ArrayList<Integer>();
//		a.add(1, 45);
//		a.add(89);

		ArrayList<Float> salary = new ArrayList<Float>();
		salary.add(89.7f);
		salary.add(890.7f);
		salary.add(89.7f);
		salary.add(89.7f);
		salary.add(null);
		System.out.println(salary);

		System.out.println(salary.clone());
		System.out.println(salary.contains(89.7f));
		System.out.println(salary.isEmpty());
		System.out.println(salary.remove(89.7f));// output is in bolean

		salary.remove(null);
		System.out.println(salary);

		LinkedList<Character> name = new LinkedList<Character>();
		name.add('B');
		name.add('N');
		name.add('m');

		System.out.println(name);
		System.out.println(name.clone());
		System.out.println(name.remove(null));
		name.removeFirst();
		System.out.println(name.removeFirst());
		

	}

}
