import java.util.*;
class Rhombus
{
	// a rhombus is a polygon with 4 equalsides and opp sides are parallel and angles are equal
	//fromula 1/2*d1*d2
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter 2 diagonlas");
		int d1=s.nextInt();
		int d2=s.nextInt();
		double a=(1.0/2.0)*d1*d2; //by using 1.0 and 2.0 it will consider as double
		System.out.println(a);

	}
}
		