package jun24th;

import java.util.Scanner;

public class IfElseDemo4 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter some month number ");
		
		int x=input.nextInt();
		
		
		
		if( x==1)
		{
			System.out.println("Jan");
		}
		else if (x==2)
		{
			System.out.println("Feb");
		}
		else if (x==3)
		{
			System.out.println("Mar");
		}
		else if (x==4)
		{
			System.out.println("Apr");
		}
		else if (x==5)
		{
			System.out.println("May");
		}
		else if (x==6)
		{
			System.out.println("Jun");
		}
		else if (x==7)
		{
			System.out.println("Jul");
		}
		else if (x==2)
		{
			System.out.println("Feb");
		}else if (x==8)
		{
			System.out.println("Aug");
		}
		else if (x==9)
		{
			System.out.println("Sep");
		}
		else if (x==10)
		{
			System.out.println("Oct");
		}
		else if (x==11)
		{
			System.out.println("Nov");
		}
		else if (x==12)
		{
			System.out.println("Dec");
		}
		else 
		{
			System.out.println("wrong month number");
		}
		
	}

}
