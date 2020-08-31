import java.util.*;
class Trapezium

//formula (a+b)*h/2
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter two sides");
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("enter height");
		int h=s.nextInt();
		double area=(a+b)*(h)/2.0;
	// to print value in float   --	float area1=(float)(a+b)*(h)/2.0;
		System.out.println(area);
	}
}