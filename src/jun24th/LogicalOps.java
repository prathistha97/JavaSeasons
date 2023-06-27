package jun24th;

public class LogicalOps {

	public static void main(String[] args) {
		
		int x=10;
		int y=20;
		
		char c1='A'; // 97
		char c2='a'; //65
		 
		System.out.println( (x>y) && (c1>c2));
		
		System.out.println( (x>y) || (c1>c2));
		
		System.out.println(!(x>y));
		
	}
}
