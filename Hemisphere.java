import java.util.*;
class Hemisphere
//formula 2/3*3.14*r*r*r
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter radius");
		int r=s.nextInt();
		double v=(2.0/3.0)*3.14*r*r*r;
		System.out.println(v);
	}
}