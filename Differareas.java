import java.util.Scanner;
class Qareas
{
	int b,h,s,l,h1,h2;
	Qareas(int b,int h)
	{
		this.b=b;
		this.h=h;
	}
	Qareas(int s)
	{
		this.s=s;
	}
	Qareas(int h,int l,int h2)//i used h2 only to show difference in no.of parameters
	{
		this.h=h;
		this.l=l;
	}
	public void show()
	{
		System.out.println("area of trianle is"+(b*h)/2);
	}
	public void show1()
	{
		System.out.println("area of square is"+s*s);
	}
	public void show2()
	{
		System.out.println("area of rectangle is"+l*h);
	}
}
public class Differareas
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter breadth and height");
		int height=s.nextInt();	
		int breadth=s.nextInt();
		Qareas b1=new Qareas(height,breadth);
		b1.show();
		System.out.println("enter side of square");
		int side=s.nextInt();
		Qareas b2=new Qareas(side);
		b2.show1();
		System.out.println("enter length and height");
		int length=s.nextInt();
		int height1=s.nextInt();
		int h2=0;
		Qareas b3=new Qareas(length,height1,h2);
		b3.show2();
	}
}