package collection;

import java.util.HashMap;

public class hashmap {

	public static void main(String[] args) {
		HashMap<Integer,String>id_name=new HashMap<Integer,String>();

		id_name.put(1, "anku");
		id_name.put(2, "anu");
		id_name.put(3, "raj");
		id_name.put(4, "deep");
		id_name.put(5, "null");
		id_name.put(5, "women");
		id_name.put(6, "ankita");
		id_name.put(null, "null");
		id_name.put(6,null);
		System.out.println(id_name);
		System.out.println(id_name.containsKey("renu"));
	}

}
