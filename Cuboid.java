import java.util.*;
class Cuboid
//cuboid is  3D shape of rectangle which have 6 faces
//formula l*b*h
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int l=s.nextInt();
		int b=s.nextInt();
		int h=s.nextInt();
		int a=(l*b*h);
		System.out.println(a);
	}
}