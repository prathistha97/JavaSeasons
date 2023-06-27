package jun21st;

public class Methods3 {

	public static void main(String[] args) {
		
		Methods3 obj=new Methods3();
		
		//int res1=obj.natSum(5);
		//System.out.println(res1);
		
		System.out.println(obj.natSum(5));
		
		System.out.println(obj.natSum(10));
		
		System.out.println(obj.natSum(100));

	}
	
	public int natSum(int n)
	{
		int res=n*(n+1)/2;
		return res;
		
	}

}
