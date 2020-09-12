import java.util.*;
class Disariumnumber
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int temp=n;
		int temp1=n;
		int count=0,sum=0;
		while(n!=0) //to caluculate the no.of digits
		{
			n=n/10;
			count++;
		
		}
	
		while(temp!=0) //we stored value n to temp
		{
			int rem=temp%10;
			sum=sum+(int)Math.pow(rem,count); //we are squaring each digit with respect to their positions

			temp=temp/10;
			
			count--; 
		}
		if(temp1==sum)
			System.out.println("yes");
		else
			System.out.println("no");
	}
}
		
		