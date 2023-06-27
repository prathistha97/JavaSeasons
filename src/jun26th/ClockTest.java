package jun26th;

public class ClockTest {

	public static void main(String[] args) {
		
		//user 1
		
		Clock c1=new Clock();
		c1.setClock(8);
		c1.getClock();
		
		//user 2
		Clock c2=new Clock();
		c2.setClock(8,59,55);
		c2.getClock();

	}

}
