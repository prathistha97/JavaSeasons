package jun23rd;

public class Bank {
	
	private double balance=10000;
	
	//getters
	
	public double getBalance(int pin)
	{
		
		//validation
		
		if(pin == 6543)
		{
			return balance;
		}
		else
		{
			System.out.println("Incorrect Pin entered ...");
		    return 0.0;
		}
		
	}
	
	//setters 
	
	
	public void setBalance(double depositAmount)
	{
		
		balance=balance+depositAmount;
		
	}

}
