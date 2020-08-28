import java.util.*;
class Nearestfibo
{
	boolean isfibo(int n) //n=6
	{
		int a=0,b=1,c=0;
		while(c<n)
		{
			c=a+b; //c=1
			a=b; //a=1
			b=c; //b=1
		}
		if(c==n)
			return true;
		else
			return false;
	}
	int beforefib(int n)
	{
		int c=0;
		while(true)
		{
			if(isfibo(n))
			   return c;
			else
			{
				n=n-1;
				c++;
			}
		}
	}
	int afterfib(int n)
	{
		int c=0;
		while(true)
		{
			if(isfibo(n))
				return c;
			else
			{
				n=n+1;
				c++;
			}
		}
	}
	void nearestfib()
	{
		Scanner s=new Scanner(System.in);
		int f=s.nextInt();
		int b=beforefib(f);
		int a=afterfib(f);
		if(b>a)
		{
			System.out.println("nearest fibonacci number"+(f-b));
		}
		else if(b<a)
		{
			System.out.println("nearest fiboonacii number"+(f+a));
		}
		else if((f-b)==(f+a))
			System.out.println("Nearest fibbonaci number"+f);
		else if(a==b)
			System.out.println("nearest numbers are"+(f-b)+" "+(f+a));

	}

	public static void main(String args[])
	{
		 Nearestfibo ob=new  Nearestfibo();

		ob.nearestfib();
	}
}		
		
				
