import java.util.*;
class Semiprime //product of prime numbers 2*3=6

{

	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n1=s.nextInt();//n=10
		int x=n1;// we are copying the value
		int c=0;
		for(int i=2;c<2 && i*i<=n1;i++)
		{
			while(n1%i==0)  // 10%2==0 5%2==0-false
			{
				n1=n1/i; // 10/2=5
				c++;	 //c=1

			}
		}
		if(n1>1) //5>1
		{
			c++; //c=2
		}	
	
	if(c==2) //c==2
		System.out.println("semi prime number"+x); //it gets print
	else
		System.out.println("it is not semiprime"+x);
	
	}


}