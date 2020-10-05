import java.util.*;
class Patterns
{
	public static void main(String[] args)
	 {
	for(int i='A'; i<='E';i++) // 5 rows
	{
		for(int j= 'E';j>=i; j--) // 5,4 cols
		{
			System.out.print((char)i+" "); // A A A A A 
		}
		System.out.println(); //nextline
	}
} 
/*A A A A A
B B B B
C C C 
D D
E */

}