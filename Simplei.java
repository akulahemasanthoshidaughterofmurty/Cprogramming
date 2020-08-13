import java.util.*;
class Simple_Interest
{
	static double p,n,r,interest;
	
	static void show(double p,double n,double r)
	{
		interest=(p*n*r)/100;
		System.out.println("simple interest ="+interest);
		
		
	}
}
public class Simplei
{
	public static void main(String args[])
	{
		
		Scanner s=new Scanner(System.in);
		System.out.println("eneter principle");
		double p=s.nextDouble();
		System.out.println("eneter rate");
		double r=s.nextDouble();
		System.out.println("eneter time");
		double n=s.nextDouble();

		Simple_Interest.show(p,n,r);
		
	}
}
		
	