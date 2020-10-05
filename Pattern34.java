import java.util.*;
public class Pattern34 {
	public static void main(String[] args) {
	for(int i= 1; i<=5;i++) // 5 rows
	{
		for(int j = 5  ; j >= i; j--)  // j=5,4,3,2,1
		{
			System.out.print(j+" "); // 5 
		}
		System.out.println();
	}
 } /*5 4 3 2 1
5 4 3 2
5 4 3
5 4
5
*/



}
