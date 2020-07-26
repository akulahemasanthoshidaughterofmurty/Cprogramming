import java.util.Scanner;
class Change
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		StringBuffer st=new StringBuffer(str);
		for(int i=0;i<str.length();i++)
		{
			if(Character.isLowerCase(str.charAt(i)))
				st.setCharAt(i,Character.toUpperCase(str.charAt(i)));
			else
				st.setCharAt(i,Character.toLowerCase(str.charAt(i)));
		}
		System.out.println(st);
	}
}