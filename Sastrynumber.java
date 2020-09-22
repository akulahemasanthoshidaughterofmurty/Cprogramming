import java.util.*;
class Sastrynumber
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String str=Integer.toString(n)+Integer.toString(n+1);
		int num=Integer.valueOf(str);
		int sqr=(int)Math.sqrt(num);
		if(num%sqr==0)
			System.out.println("yes");
		else
			System.out.println("no");
	}
}