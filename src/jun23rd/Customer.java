package jun23rd;

public class Customer {

	public static void main(String[] args) {
		
		Bank c1=new Bank();
		
		//System.out.println(c1.balance);
		
		System.out.print(c1.getBalance(6543));
		
		c1.setBalance(2000);
		
		System.out.print(c1.getBalance(6543));

	}

}
