package collection;

import java.util.HashSet;
import java.util.Iterator;

public class hashset {

	public static void main(String[] args) {

		HashSet<Integer> emp_id = new HashSet<Integer>();

		for (int i = 1; i <= 100; i++) {
			emp_id.add(i);
		}
//	System.out.println(emp_id);
//		System.out.println(emp_id.contains(78));
//		System.out.println(emp_id.remove(90));
//		emp_id.remove(90);
//		System.out.println(emp_id);
//
//		emp_id.add(700);
//		emp_id.add(900);
//		emp_id.add(600);
//		emp_id.add(300);
//		emp_id.add(300);
//		emp_id.add(null);
		
		Iterator<Integer> i = emp_id.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
			System.out.println(emp_id.contains(400));
			System.out.println(emp_id.isEmpty());
			System.out.println(emp_id.size());
			
		}
		
		HashSet<String> city = new HashSet<String>();
		city.add("wardha");
		city.add("yavatmal");
		city.add("chandrapur");
		city.add("nagpur");
		
		System.out.println(city.remove("wardha"));
		System.out.println(city.contains("latur"));
		//System.out.println(city.ad);
		
		
		
	}

}
