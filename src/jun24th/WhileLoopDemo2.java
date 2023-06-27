package jun24th;

import java.util.Scanner;

public class WhileLoopDemo2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		boolean status=true;
		
		while(status)
		{
			System.out.println("Enter some character ");

			String str = input.next();
			
			char ch=str.toCharArray()[0];
			
			if(ch == 'X' || ch == 'x')
			{
				System.out.println("Exit");
				break;
			}
			
		}

	}

}
