import java.util.Scanner;
class Profile
{
	public static void main(String args[])
	{
		int n,w,h,l;
		Scanner s=new Scanner(System.in);
	
		l=s.nextInt();
		n=s.nextInt();
		
		for(int i=0;i<n;i++)
		{
		w=s.nextInt();
		h=s.nextInt();
		if(w<l && h<l)
			System.out.println("update another");
		else if(w>l && h>l)
			System.out.println("crop it");
		else if(w==l && h==l)
			System.out.println("Accepted");
		}
	}
}
					
		