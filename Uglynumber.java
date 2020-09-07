import java.util.*;
class Uglynumber
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n%2==0 || n%3==0 || n%5==0)
			System.out.println("it is ugly number");
		else
			System.out.println("it is not ugly number");
	}
}