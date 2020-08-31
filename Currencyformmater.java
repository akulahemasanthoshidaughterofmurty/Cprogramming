import java.util.*;
import java.text.*;

 

public class Currencyformmater {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        Locale a=Locale.US;
        NumberFormat formater=NumberFormat.getCurrencyInstance(a);
        String us=formater.format(payment);
        NumberFormat format1=NumberFormat.getCurrencyInstance(new Locale("en", "in"));
        String india=format1.format(payment);
        Locale c=Locale.CHINA;
        NumberFormat format2=NumberFormat.getCurrencyInstance(c);
        String china=format2.format(payment);
        Locale d=Locale.FRANCE;
         NumberFormat format3=NumberFormat.getCurrencyInstance(d);
         String france=format3.format(payment);

        

        
        
        // Write your code here.
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
