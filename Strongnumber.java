import java.util.*;
class Strongnumber
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(); //145
		int fact,rem,sum=0,temp;
		temp=n;
		while(n!=0) //this is to check each and every digit 5!=0,4!=0,1!=0
		{
			 fact=1;
			int i=1;
	                rem=n%10;  //5 ,4 ,1
			while(i<=rem) //this loop exit up to digit like 5 means it starts from 1 and iterates up to 5

			{
				fact=fact*i;  //120 24 1
				i++;
			}
			sum=sum+fact; // sum=120 +24 +1
			n=n/10;    //14 ,1
		}
		if(temp==sum)
			System.out.println("it is a Strong number");
		else
			System.out.println("it is not a strong number");	
	}
}