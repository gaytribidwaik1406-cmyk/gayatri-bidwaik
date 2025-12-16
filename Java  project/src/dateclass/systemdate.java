package dateclass;

import java.text.SimpleDateFormat;
import java.util.Date;

public class systemdate {

	public static void main(String[] args) {
		Date d=new Date();
		System.out.println(d.toString());
		
		System.out.println("print date in format");
//dd-mm-yy
		//dd:mm:yy
		
	SimpleDateFormat s=new SimpleDateFormat("dd-MM-yy");
	System.out.println(s.format(d));
	
	SimpleDateFormat b=new SimpleDateFormat("MM-dd-yy");
	System.out.println(b.format(d));
	}

}
