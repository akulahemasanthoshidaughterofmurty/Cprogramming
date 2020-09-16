import java.util.*;
class Triperfect
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int sum=0;
		int tri=3*n;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				sum=sum+i;
		
		}
		if(tri==sum)
			System.out.println(n+"  is a triperfect number");
		else
			System.out.println(n+"  is not a triperfect number");
	}
}
	