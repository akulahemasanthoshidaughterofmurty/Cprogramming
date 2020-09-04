import java.util.*;
class Spynumber
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int sum=0,pro=1;
		while(n!=0)
		{
			int rem=n%10;
			sum=sum+rem;
			pro=pro*rem;
			n=n/10;
		}
		System.out.println(sum +" and  "+pro);
		if(sum==pro)
			System.out.println("it is a spy number");
		else
			System.out.println("it is not a spy number");
	}
}