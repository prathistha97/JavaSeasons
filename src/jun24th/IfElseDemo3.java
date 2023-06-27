package jun24th;

import java.util.Scanner;

public class IfElseDemo3 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter value for x ");
		
		int x=input.nextInt();
		
		System.out.println("Enter value for y ");
		
		int y=input.nextInt();
		
		if(x>y)
		{
			System.out.println(" x is greater than y");
		}
		else if(x<y)
		{
			System.out.println(" x is less than y");
		}
		else if(x==y)
		{
			System.out.println(" x is equals to y");
		}

	}

}
