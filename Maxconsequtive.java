import java.util.*;
public class Maxconsequtive
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
	


	 int max = 0;
        int current = 0;
        for (int i : arr)
	 {
            if (i == 1) {
                current++;
            } else {
                if (current > max) {
                    max = current;
                }
                if (max >= arr.length / 2) {
                    max=max;
                }
                current = 0;
            }
        }
	System.out.println(Math.max(max,current));

	}
}