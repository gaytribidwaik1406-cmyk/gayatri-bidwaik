package user001;

public class Stringmethod {

	public static void main(String[] args) {
		//LENGTH
		String s="stp";
		System.out.println(s.length());
		//space will be count 
		String i=" ";
		System.out.println("The  o/p of i will be :"+i.length());
		
		//TOUPPERCASE 
		String g="stp infotech";
		System.out.println("Convert the string g into upper case : "+g.toUpperCase());
		
		//TOLOWERCASE
		String h="AUTOMATION";
		System.out.println(h.toLowerCase());
		
		//LENGTH (starts from 1)
		String a="username"; 
		System.out.println(a.length());
		String b=" ";
		System.out.println(b.length());
		String c="";
		System.out.println(c.length());
		
		//ISEMPTY
		String n="";
		System.out.println(n.isEmpty());
		System.out.println("The output of n will be :"+ n.isEmpty());
	
		//In ISEMPTY method the space will be count 
		String p=" ";
		System.out.println("The output of p will be :"+p.isEmpty());
		
		String m="abc";
		System.out.println(m.isEmpty());
		System.out.println("The output of m will be :"+m.isEmpty());
		
		//INDEXOF(STARTS FROM 0)
		String a1="school";
		System.out.println("The o/p of a1 string will be :"+ (a1.indexOf("c")));
		
		//REPLACE
		String g2="BIT";
		System.out.println("The o/p will be :"+(g2.replace("B","V")));
		String g1="false";
		System.out.println("The o/p will be :"+(g1.replace("l", "g")));
		
		//CHARAT
		String t1="water";
		System.out.println((t1.charAt(3)));
		
		String q="manual testing";
		System.out.println("The output will be :"+(q.charAt(8)));
		
		//SUBSTRING
		String e="programming";
		System.out.println(e.substring(0, 6));
		System.out.println(e.substring(1, 10));
		System.out.println("The output of substring a1 will be:"+ (a1.substring(0, 4)));
		System.out.println(e.substring(2));
		System.out.println(e.substring(3));
		System.out.println(e.toUpperCase());
		System.out.println(e.length());
		System.out.println(e.indexOf("g"));
		System.out.println(e.isEmpty());
		System.out.println(e.subSequence(2, 8));
		System.out.println(e.replace("m", "h"));
		
		
		// TODO Auto-generated method stub

		
	}

}
