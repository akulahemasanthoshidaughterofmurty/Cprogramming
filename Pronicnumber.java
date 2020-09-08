import java.util.*;
class Pronicnumber
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int x=0;
		for(int i=0;i<n;i++)
		{
			if(i*(i+1)==n)
			{
				x=1;
				break;
			}
		}
		if(x==1)
			System.out.println("pronic number");
		else
			System.out.println("not pronic number");		
	}
}