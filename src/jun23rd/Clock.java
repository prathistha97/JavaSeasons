package jun23rd;

public class Clock {
	
	public int hr,min,sec;
	
	//setter
	
	public void setClock(int a,int b,int c)
	{
		hr=a;
		min=b;
		sec=c;
	}
	
	
	//getter 
	
	public void getClock()
	{
		//System.out.println(hr+":"+min+":"+sec);
		
		System.out.printf("%02d:%02d:%02d",hr,min,sec);
	}

}
