import java.util.*;
class Adamnumber // if we give 12 ,reverse 21,square of 12 144,square of 21 441,reverse of square of 21 should be equal to square of 12

{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(n);
		int rev=reverse(n);
		System.out.println(rev);
		int r=square(n);
		System.out.println(r);
		int t=square(rev);
		System.out.println(t);
		System.out.println(reverse(t));
		if(r==reverse(t))
			System.out.println("yes");
		else
			System.out.println("no");
	}
	static int reverse(int n)
	{
		int reversed=0;
		while(n!=0)
		{
			int rem=n%10;
			reversed=reversed*10+rem;
			n=n/10;
		}
		return reversed;
	}
	static int square(int n)
	{
		int square=n*n;
		return square;
	}
}