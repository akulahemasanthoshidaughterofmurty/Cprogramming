import java.util.*;
class Harshadnumber
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);//number should divisible by sum of its digits
		int n=s.nextInt();
		int temp=n;
		int sum=0;
		while(n!=0)
		{
			int rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		if(temp%sum==0)
			System.out.println("yes");
		else
			System.out.println("no");
	}
}