import java.io.*;

class Forloop2{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int sum=0;
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
        for(int j=0;j<n;j++)
        {
            sum=sum+((int)(Math.pow(2,j))*b); //here we are converting double to int
            System.out.print(sum+a+" ");	//we added a at the time of printing because we need to add a only one time
        }					
        System.out.println("  ");
        sum=0;
        }
        in.close();
}
}