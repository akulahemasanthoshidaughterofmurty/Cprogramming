import java.util.Scanner;
class Zoo
{
 public static void main(String args[])
 {
	int r=0,x=0,y=0,j=0;
	Scanner s=new Scanner(System.in);
	String str=s.nextLine();
	
        
	
	
	for(j=0;j<str.length();j++)
	{
		 if(str.charAt(j)=='z')
		{
			x++;
			System.out.println(x);
			
		}
		else if(str.charAt(j)=='o')
		{

			y++;
			
		}
		else
			break;
	}
	r=2*x;
	System.out.println(r);
	if(r==y)
		System.out.println("YES");
	else
		System.out.println("NO");
	
  }
}