import java.util.Scanner;
class Num
{
	public static void main(String args[])	
	{
		int n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int[] k=new int[n];
		for (int i=0;i<n;i++)
		{
			k[i]=s.nextInt();
			
		}
		for(int j:k)
			System.out.print("  "+j);
	}
}
