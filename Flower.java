import java.util.*;
public class Flower
{

	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
	
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		
		int target=s.nextInt();
	
    int count = 0;
    for (int i = 0; i<n; i++)
    {
      if (arr[i] == 1)
        continue;
      if (i > 0 && arr[i-1] == 1)
        continue;
      if (i< n-1 && arr[i+1] == 1)
        continue;
      count++;
      arr[i] = 1;
    }
    if( count >= target)
	System.out.println("True");
	else
		System.out.println("False");
}
}
