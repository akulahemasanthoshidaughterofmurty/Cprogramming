import java.util.*;
class Spynumber
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int sum=0,product=1;
		while(n!=0)
		{
			int rem=n%10;
			sum=sum+rem;
			product=product*rem;
			n=n/10;
		}
		System.out.println(sum +" and  "+product);
		if(sum==product)
			System.out.println("it is a spy number");
		else
			System.out.println("it is not a spy number");
	}
}
