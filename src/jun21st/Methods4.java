package jun21st;

public class Methods4 {

	public static void main(String[] args) {
		
		System.out.println(Methods4.natSum(5));
		System.out.println(Methods4.natSum(50));
		System.out.println(Methods4.natSum(1000));
		
	}
	
	public static int natSum(int n)
	{
		int res=n*(n+1)/2;
		
		
		return res;
		
	}

}
