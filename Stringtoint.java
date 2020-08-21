import java.util.*;
import java.security.*;
public class Stringtoint {
 public static void main(String[] args) {

  DoNotTerminate.forbidExit();

  try {
   Scanner in = new Scanner(System.in);
   int n = in .nextInt();
   in.close();
   
    String s=Integer.toString(n);//it is used to convert integer to string
   //Write your code here

   
   if (n == Integer.parseInt(s)) //it is used to convert string to integer
	{
    System.out.println("Good job");
   } else {
    System.out.println("Wrong answer.");
   }
  } catch (DoNotTerminate.ExitTrappedException e) {
   System.out.println("Unsuccessful Termination!!");
  }
 }
}

