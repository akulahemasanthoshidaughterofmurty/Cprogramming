import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.math.BigInteger;
public class BigIntegerc {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        BigInteger a=s.nextBigInteger();
        BigInteger b=s.nextBigInteger();
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
        
    }
}