import java.util.Scanner;
class Palindrome
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		
		StringBuilder input1=new StringBuilder();
        	
  		input1.append(str);
		input1 = input1.reverse();
		System.out.println(input1);
		System.out.println(str.contentEquals(input1));
	}
}
		
			
	