import java.util.*;
class Dupli
{
	public static void main(String args[])
	{
		int[] a={1,2,5,3,4,4};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{	
				if(a[i]==a[j])
					System.out.println(a[i]);
					Array.remove(a[i]);
				
			}
		}
	}
}