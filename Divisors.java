import java.util.Scanner;
class Divisors
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int i=s.nextInt();
		int r=s.nextInt();
		int k=s.nextInt();
		int j,count=0;
		for(j=i;j<=r;j++)
		{
			if(i%k==0)
			   count++;
		}
		System.out.println(count);
	}
}