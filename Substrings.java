import java.util.*;
class Substrings

{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String[] s1=new String[n];
		String[] s2=new String[n];
		
		for(int i=0;i<n;i++)
		{
			s1[i]=s.next();
			s2[i]=s.next();
		
	        System.out.println(print(s1[i],s2[i]));
	
		}
	}


	static String print(String s1,String s2)
	{
			int count=0,count1=0;
			String rv="null";
			for(int i=0;i<s1.length();i++)
			{
	
				for(int j=0;j<s2.length();j++)
				{
					if(s1.length()>=s2.length() || s1.length()<=s2.length())
					{
						if(s1.charAt(i)==s2.charAt(j))
						    count++;
						else
							count1--;
					}
			
				}
			}
			if(count>=1 )
			{
				 rv="yes";
			}
			else if(count1<=0)
			{
				 rv="no";
			}
		return rv;
	}
}