package jun27th;

public class ClockDemo {

	public static void main(String[] args) {
		
		//user 1
		
		Clock c1=new Clock();
		c1.getClock();
		
		//user 2
		
		Clock c2=new Clock(8,29);
		c2.getClock();

	}

}
