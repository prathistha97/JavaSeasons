package jun21st;

public class Methods2 {

	public static void main(String[] args) {
		
		Methods2 obj=new Methods2();
		
		obj.natSum(5);
		obj.natSum(10);
		obj.natSum(100);
		obj.natSum(1000);
	}
	
	public void natSum(int n)
	{
		int res=n*(n+1)/2;
		System.out.println(res);
		
	}
	

}
