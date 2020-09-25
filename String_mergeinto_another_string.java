import java.util.*;
class String_mergeinto_another_string
{
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	String str=s.next();
	int n=s.nextInt();
	String c=s.next();

	String news=new String();
	String repeat=c.repeat(n);
	System.out.println(repeat);
	int len=str.length();
	
	for(int i=0;i<len;i++)
	{
		
		if(i==len/2)
		{
			news +=repeat;
		}
		
		news +=str.charAt(i);
	}
	System.out.println(news); 
}
}