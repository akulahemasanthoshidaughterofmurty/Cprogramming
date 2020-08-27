import java.util.*;
public  class Evenoddsum
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int n=s.nextInt();
	
		int even=0,odd=0;

		while(n!=0)
		{
			int rem=n%10;
			if(rem%2==0)
				even=even+rem;
			else
				odd=odd+rem;
			n=n/10;
		}
		System.out.println("sum of even numbers "+even);
		System.out.println("sum ofodd numbers "+odd);
	}
}
			