import java.util.Scanner;
class Findproduct
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] arr=new int[n];
		
		long x=1;
		long mod=1000000007;
		
		for(int i=1;i<=n;i++)
		{
			x=((x*i)%(mod));
			
			
			
		}
		System.out.println("  ");
		System.out.print(x);
	}
}