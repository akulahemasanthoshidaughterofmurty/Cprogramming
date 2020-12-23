import java.util.*;
class reversalalgorithm
{
	static void shiftleft(int arr[],int p)
	{
		int n=8;
		revarr(arr,0,p-1); //A=[1,2] -> [2,1]
		revarr(arr,p,n-1); //B=[3,4,5,6,7,8] -> [8,7,6,5,4,3]
		revarr(arr,0,n-1);

	}
	static void revarr(int arr[],int p,int n)
	{
		int temp;
		while(p<n) //0<1 ,1<0 comes out of loop
		{
			temp=arr[p]; //temp =1
			arr[p]=arr[n]; //arr[0]=2
			arr[n]=temp; // arr[1]=1
			p=p+1;  //p=1
   			n=n-1; //n=0
		}
	}
	static void show(int arr[])
	{
		for(int i=0;i<8;i++)
			System.out.print(arr[i]+" ");
	}		
	

	public static void main(String args[])
	{
		int arr[]=new int[8];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 8 values");
		for(int i=0;i<8;i++)
		{
			arr[i]=sc.nextInt();
		}
		int n=8;
		int p=2;
		 shiftleft(arr,p);
		show(arr);
	}
}	
