import java.util.*;

public class discounts {
        
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input =  new Scanner (System.in);
        System.out.println ("Kindly enter price of item bought...");
        float price = input.nextFloat();
        System.out.println ("Kindly enter quantity of item bought...");
        float qty = input.nextFloat();
        float grossPay = price * qty;
        System.out.println ("Grosspay =" + grossPay);
        double dscnt = 0;
        
        if (qty >= 21) {
        	dscnt = .15;
        	System.out.println ("your discount on the quantity bought is 15%");
        }
        else if (qty >= 11 && qty <= 20) {
        	dscnt = 0.10;
        	System.out.println ("your discount on the quantity bought is 10%");
        }
        else if (qty >= 6 && qty <= 10) {
        	dscnt = 0.05;
        	System.out.println ("your discount on the quantity bought is 5%");
        }
        else {
        	dscnt = 0.02;
        	System.out.println ("your discount on the quantity bought is 2%");
        }
        
        double netPay = grossPay - (grossPay * dscnt);
        System.out.println ("Discount applied = " + (grossPay * dscnt));
        System.out.println ("Netpay = " + netPay);
        
        
       
       
    }
}
