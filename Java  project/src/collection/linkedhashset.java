package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class linkedhashset {

	public static void main(String[] args) {
		LinkedHashSet<Character> alphabet = new LinkedHashSet<Character>();

	
		
		alphabet.add('p');
		alphabet.add('k');
		alphabet.add('k');
		alphabet.add('n');
		alphabet.add('N');
		
		System.out.println(alphabet.reversed());
		for (int i = 1; i <= 2; i++) {
		alphabet.add('i');
		}
		Iterator<Character> i=alphabet.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
			System.out.println(i.equals('K'));
			
			
			
		}
		

	}

}
