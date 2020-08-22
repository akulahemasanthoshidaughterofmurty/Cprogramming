import java.util.*;
class Nearestprime
{
	public boolean primeornot(int n)
	{
		int count=0;
		for(int i=2;i<n;i++) //n=20
		{
			if(n%i==0) 	
			count++;
		}
		if(count==0)
			return true; 
		else
			return false; //returns false
	}
	int beforeprime(int n)
	{
		int c=0;
		while(true)
		{
			if(primeornot(n))
				return c;
			else
			{
				n=n-1; // n=19
				c++;  //c=1
				
			}
		
		}
	}
	int afterprime(int n)//=20
	{
		int c=0;
		while(true)
		{
			if(primeornot(n)) //23
				return c;
			else
			{
				n=n+1;
				c++;  //c=3;
			}
		
		}

	}
	void nearest()
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("enter number");
		int n=obj.nextInt(); //n=20
		int m1=beforeprime(n);// m1=1
		int m2=afterprime(n);//m2=3
		if(m1>m2) //1>3 -f
		{
			System.out.println("nearest prime:");
			System.out.println(n+m2);
		}
		else if(m1<m2) //1<3 -t
		{
			System.out.println("nearest prime");
			System.out.println(n-m1); // 20-1=19
		}
		else
		{
			System.out.println("nearest prime");
			System.out.println((n-m1)+""+(n+m2));



		}
	}

	public static void main(String args[])
	{
		Nearestprime obj=new Nearestprime();
		obj.nearest();
		
	}

}
