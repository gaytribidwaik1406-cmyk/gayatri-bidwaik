package user001;

public class switchstatement {
	
	
public static void main(String[] args) {
	int a=8;
	switch(a) {
	case 1:
		System.out.println("even number 2");
		break;
	case 2:
		System.out.println("even number 4");
	break;
	case 3:
		System.out.println("even number 6");
	break;
	case 8:
		System.out.println("even number 80");
		break;
		default:
			System.out.println("invalid number ");
			break;
		
}
	//print month number on the basis of month name
	String s ="aug";
	switch(s) {
	case "jan" :
		System.out.println("month number is 1");
		break;
	case "feb":
		System.out.println("month number is 2");
		break;
	case "march":
		System.out.println("month number is 3");
		break;
	case "april":
		System.out.println("month number is 4");
		break;
	case "may":
		System.out.println("month number is 5");
		break;
	case "june":
		System.out.println("month number is 6");
		break;
	case "july":
		System.out.println("month number is 7");
		break;
	case "aug":
		System.out.println("month number is 8");
		break;
	case "sep":
		System.out.println("month number is 9");
		break;
	case "oct":
		System.out.println("month number is 10");
		break;
	case "nov":
		System.out.println("month number is 11");
		break;
	case "dec":
		System.out.println("month number is 12");
		break;
		default:
		System.out.println("invalid number");
		break;
		
	}
	
	//print week name on the basis of week number
	int d=7;
	switch(d) {
	case 1:
		System.out.println("week name is sunday");
		break;
	case 2:
		System.out.println("week name is monday");
		break;
	case 3:
		System.out.println("week name is tuesday");
		break;
	case 4:
		System.out.println("week name is wednesday");
		break;
	case 5:
		System.out.println("week name is thursday");
		break;
	case 6:
		System.out.println("week name is friday");
		break;
	case 7:
		System.out.println("week name is saturday");
		break;
		default:
			System.out.println("invalid week name");
			break;
	}
	
	
	//print month name on the basis of month number 
	int g=9;
	switch(g){
	case 1:
		System.out.println("month name is jan");
		break;
	case 2:
		System.out.println("month name is feb");
		break;
	case 3:
		System.out.println("month name is march");
		break;
	case 4:
		System.out.println("month name is april");
		break;
	case 5:
		System.out.println("month name is may");
		break;
	case 6:
		System.out.println("month name is june");
		break;
	case 7:
		System.out.println("month name is july");
		break;
	case 8:
		System.out.println("month name is aug");
		break;
	case 9:
		System.out.println("month name is sep");
		break;
	case 10:
		System.out.println("month name is oct");
		break;
	case 11:
		System.out.println("month name is nov");
		break;
	case 12:
		System.out.println("month name is dec");
		break;
		default:
			System.out.println("invalid month");
			break;
		
}
	
	//print employee id on the basis of employee name
	String employee_name = "gayatri";
			switch (employee_name) {
			case "rani":
				System.out.println("employee id is R001");
				break;
			case "gayatri":
				System.out.println("employee id is G002");
				break;
			case "raj":
				System.out.println("employee id is R003");
				break;
			case "anu":
				System.out.println("employee id is A004");
				break;
				default:
					System.out.println("invalid id");
					break;
			
			}
			
			
			
}
}