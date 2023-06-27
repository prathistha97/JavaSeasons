package jun24th;

import java.util.Scanner;

public class SwitchDemo1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter some month number ");

		String str = input.next();
		
		char x=str.toCharArray()[0];
		
		//byte x=input.nextByte();
		
		//boolean x=input.nextBoolean();
		
		

		switch (x) {

		case 1:
			System.out.println("Jan");
			break;

		case 2:
			System.out.println("Feb");
			break;

		case 3:
			System.out.println("Mar");
			break;

		case 4:
			System.out.println("Apr");
			break;

		case 5:
			System.out.println("May");
			break;

		case 6:
			System.out.println("Jun");
			break;

		case 7:
			System.out.println("Jul");
			break;

		case 8:
			System.out.println("Aug");
			break;

		case 9:
			System.out.println("Sep");
			break;

		case 10:
			System.out.println("Oct");
			break;

		case 11:
			System.out.println("Nov");
			break;

		case 12:
			System.out.println("Dec");
			break;
			
		case 'A':
			System.out.println("Hello");
			break;
		
		case 97:
			System.out.println("Bye ");
			break;

		default:
			System.out.println("wrong month number entered");

		}

	}

}
