import java.util.*;
public class Canadanumber
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int sum=0,sqr=0,rem=0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		while(n!=0)
		{
			 rem=n%10;
			sqr=sqr+(int)Math.pow(rem,2);
			n=n/10;
		}
		if(sum==sqr)
			System.out.println("yes it is a canada number");
		else
			System.out.println("no it is not a canada number");
	}
}