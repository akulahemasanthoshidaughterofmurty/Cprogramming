import java.util.Scanner;
class Circumference
{
	int r;
	Circumference(int r)
	{
		this.r=r;
	}
	public void show()
	{
		System.out.println(2*3.14*r);
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int r=s.nextInt();
	
	 Circumference obj=new Circumference(r);
	 obj.show();
	}
}