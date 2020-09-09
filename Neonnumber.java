import java.util.*;
class Neonnumber
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int sq=n*n;
		int sum=0;
		while(sq>0)
		{
			int rem=sq%10;
			sum=sum+rem;
			sq=sq/10;
		}
		if(n==sum)
			System.out.println("yes it is neon number");
		else
			System.out.println("no it is not neon number");
	}
}