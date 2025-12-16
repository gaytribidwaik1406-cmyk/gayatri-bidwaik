package practice1;

public class stringmethods {

	

	public static void main(String[] args) {
		String A="automation";
		
		System.out.println(A.isEmpty());
		System.out.println(A.length());//starts from 1
		System.out.println(A.toLowerCase());
		System.out.println(A.toUpperCase());
		System.out.println(A.indexOf("y"));//starts from 0
		System.out.println(A.contains("G"));
		System.out.println(A.equals(0));
		System.out.println(A.equalsIgnoreCase("j"));
		System.out.println(A.charAt(2));
		System.out.println(A.replace("g", "y"));
		System.out.println(A.endsWith("i"));
		System.out.println(A.concat(" bidwaik"));
		System.out.println(A.trim());//space trim
		System.out.println(A.indexOf("i"));
		System.out.println(A.charAt(3));
		System.out.println(A.substring(2,4));
		System.out.println(A.substring(5));
		System.out.println(A.substring(4, 10));
		System.out.println(A.substring(2, 6));
		
		
		
 }
	}

