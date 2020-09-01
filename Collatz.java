import java.util.*;
class Collatz
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		while(n!=1)
		{
			if(n%2!=0)
			{
			
				System.out.print(n+"  ");
				n=3*n+1;
			}
			else if(n%2==0)
			{

				System.out.print(n+"  ");
				n=n/2;
			}
		}
		System.out.print(n+" ");
	}
}
		