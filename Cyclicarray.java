import java.util.*;
class Cyclicarray
{
	static void shift(int arr[])
	{
		int n=arr[arr.length-1]; //n=5
		for(int i=arr.length-1;i>0;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[0]=n;



	} 
	/* store last element in variable
	   shift all elements to one step back
	   place variable value at 1st position
	*/ 

	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int arr[]=new int[5];
	System.out.println("enter 5values");
	for(int i=0;i<5;i++)
		arr[i]=sc.nextInt();
	shift(arr);
	System.out.println(Arrays.toString(arr));
	}
}