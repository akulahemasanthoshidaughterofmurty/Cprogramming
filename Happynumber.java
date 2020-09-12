import java.util.*;
class Happynumber  //it should return 1 if square of digits of a number repetedly
{
	public static void main(String args[]) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();//32
		int temp=n; //32
		while(n!=1 && n!=4)  //n=32,13

 /* it should come out of loop if n!=1 and n!=4 becuase n never n=be 1
	in unhappy to not go to infintiy loop we also given condition like n!=4
	
		{
			n=print(n); //n=32,n=13
		}
		if(n==1)
			System.out.println("it is a happy number");
		else
			System.out.println("it is not a happy number");
	}
		
			
	
	static int print(int n)
	{
		int sum=0;
		while(n!=0) //32,3
		{
			int rem=n%10;//2,3
			 sum=sum+rem^2; //4+9=13
			n=n/10;//3
		}
		return sum; //sum=13
	}
}