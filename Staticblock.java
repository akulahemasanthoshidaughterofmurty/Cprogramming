import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Staticblock {
    static int B,H;
    static boolean flag;
    static {
        Scanner s=new Scanner(System.in);
        B=s.nextInt();
        H=s.nextInt();
        if(B<=0 || H<=0)
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            else
            flag=true;
    }
//static block run before main()method
//we cannot create object to this class
//Write your code here

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

