import java.util.*;
class Smithnumber  //it is a composite number whoose sum of digits is equal to sum of digits in its prime factorization
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();

		if(composite(n)==false)
			System.out.println("enter cmposite number");
		else
		{
		int a=sumdigits(n);
		int b=sumprimefactors(n);
		if(a==b)
			System.out.println("yes it is a smith number");
		else
			System.out.println("it is not a smith number");
		}
	}

	static int sumdigits(int n) //37
	{
		int sum=0;
		while(n!=0)
		{ 
			int rem=n%10; //7 ,3
			sum=sum+rem; //7+3
			n=n/10; //3
		}
		
		return sum; //10
	}
		
	static int sumprimefactors(int n)
	{
		int i=2,sum=0;
		while(n>1) //666>1,
		{
			if(n%i==0) //666%2==0 true,i=37
			{
				sum=sum+sumdigits(i); // digits(37);
				n=n/i; //n=333,111/3=37
			}
			else
				i++;
		}
	System.out.println(sum);
	return sum;
	}
	
	static boolean composite(int n)
	{
		int c=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			
				c++;
		}
		if(c>2)
			return true;
		else
			return false;
	}	
}
		
				
		