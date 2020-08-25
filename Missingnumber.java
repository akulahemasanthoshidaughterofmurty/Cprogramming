import java.util.*;
class Missingnumber
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		int n=s.nextInt();
		int [] arr=new int[n];
		int sumtotal=(n*(n+1))/2;
		int sum=0;
		System.out.println("enter up to "+n+"number by missing  one of the digit");
		for(int i=0;i<n-1;i++)
		{
			arr[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			sum=sum+arr[i];
		}
		int missing=sumtotal-sum;
		System.out.println("the missing number in the range of 1 to "+n+" is "+missing);

	}



}