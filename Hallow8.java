import java.util.*;
public class Hallow8 {
/*
    5
   4 6
  3   7
 2     8
1       9
 2     8
  3   7
   4 6
    5
*/



	public static void main(String[] args) {
	int n = 9;
	int x = n/2+1;  // x = 5
	int p=1;
	for(int i =1; i<= n; i++) // i=1,2,3,4,5..9 rows
	{
		for(int j=1; j<=n;j++) // j=1..9 cols
		{
			if( j == x || j == n-x+1) // j = 2	|| j = 9-2+1 = 8		
			 System.out.print(j); // *
			else
			 System.out.print(" ");
		}		
		System.out.println();
		
		if( i <= n/2)  // 1 <= 9/2 = 4 -> t
		{
			p=p+1;
			x=x-1; // x = 5-1 = 4,3,2,1
		}
		else
		{
			p=p-1;
			x=x+1; // x= 2,3,4,5
		}
	}
    
} }