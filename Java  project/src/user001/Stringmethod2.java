package user001;

public class Stringmethod2 {
	
	public static void main(String[] args) {
		
		//concate
		String a= "electrical ";
		System.out.println(a.concat("engineering"));
		String b=(a.concat("engineering"));
		System.out.println(b.toUpperCase());
		
		//contains
		String g="testing scope";
		System.out.println(g.contains("scope"));
		System.out.println(g.contains("Testing"));
		
		//equals
		String h="today";
		System.out.println(h.equals(a));
		String j="today";
		System.out.println(j.equals(h));
		
		//equals ignorecase 
		String t="automation";
		String k="automation";
		System.out.println(t.equalsIgnoreCase(k));
		
		//endswith
		System.out.println(k.endsWith("n"));
		System.out.println(g.endsWith("e"));
		System.out.println(g.endsWith("ope"));
		
		//trim
		String p= "      manual testing      ";
		
		System.out.println(p.length());
		System.out.println(p.trim());
		String d=(p.trim());
		System.out.println(d.length());
		//hence space are removed 
		
		//append ( string buffer is a mutable class i.e it change the value ) to join the requirement
		StringBuffer f=new StringBuffer ("automation");
		System.out.println(f+" testing");
		System.out.println(f);
		System.out.println(f.append(" testing "));
		System.out.println(f);
		
		String i="Automation Testing";
		System.out.println(i.indexOf("t"));
		System.out.println(i.substring(3));
		String q=(i.substring(3));
		System.out.println(q.indexOf("t"));
		System.out.println(i.substring(7));
		String e=(i.substring(7));
		System.out.println(e.indexOf("t"));
	  
	   
	//	String y=(i.substring(3, 11));
	//	System.out.println(y.indexOf("t"));
		
		
		
		
	 
		
		
		
	}

}
