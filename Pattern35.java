import java.util.*;
public class Pattern35 {
	public static void main(String[] args) {
	for(int i='E'; i>='A';i--) // 5 rows
	{
		for(int j= 'A';j<=i; j++) // 5,4 cols
		{
			System.out.print((char)i+" "); 
		}
		System.out.println(); //nextline
	}
}
/*E E E E E
D D D D
C C C 
B B 
A
*/

 }