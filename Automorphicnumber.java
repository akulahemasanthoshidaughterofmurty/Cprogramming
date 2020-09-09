import java.util.*;
class Automorphicnumber
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(); //76
		int temp=n;
		int x=0;
		int sq=n*n; //5776
		System.out.println("square of a number is"+sq);
		while(n>0) //76!=0,7!=0
		{
			//if last digit not matching
			if(n%10 !=sq%10) //76%10= 6 !=5776%10 ---false
			{
				x=1;
				break;
			}
			//to check other last numbers
			 n=n/10; //76/10=7
			sq=sq/10; //5776/10=577
			
		}

		if(x==0)
			System.out.println("yes it is a automorphic number");
		else
			System.out.println("no it is not a automorphic number");
	}
}