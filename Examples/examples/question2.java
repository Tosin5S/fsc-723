import java.util.*;


public class question2 {
        
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner (System.in);
        System.out.println ("Enter number of item bought");
        int item = input.nextInt();
        
        double  totalDis = 0;
       	double  totalNet = 0;
        long 	totalPrice = 0;
        
        //calcluating pricing of iteams bought & noting what item was bought
        String itemName;
        String [] items = {"Milo", "Sugar", "Lipton Tea", "Bournvita", "Milk"};
        int x = 0;
        double price = 0;
        int qty = 0;
        double priceQty = 0;
        
        for (x = 1; x <= item; x++ ) {
        	System.out.println ("Enter \n 0 for Milo \n 1 for Sugar \n 2 for Lipton Tea \n 3 for Bournvita \n 4 for Milk");
        	int xx = input.nextInt();
        	itemName = items [xx];
        	System.out.println ("Enter price of item bought");
        	price = input.nextDouble();
        	System.out.println ("Enter quantity of item bought");
        	qty = input.nextInt();
        	priceQty = price * qty; //price of total quantity
        	System.out.println("The total price of " + qty +" " + itemName + " bought is " + priceQty);
        	System.out.println ("\n");
        	
        	//calculating discounts with set conditions
        	double netpay = 0;
        	double  discount = 0;
        	
        	//buys up to 5 quantities, 3% discount given
        	if (qty == 5) {
        	discount = priceQty * 0.03;
        	
        	}
        	
        	//buys up to between 6 & 10 quantities, 5% discount given
        	if (qty >= 6 & qty <= 10) {
        	discount = priceQty * 0.05;
        	
        	}
        	
        	//buys more than 10 quantities, 10% discount given
        	if (qty > 10) {
        	discount = priceQty * 0.10;
        	
        	}
        	//buys less than 5, then no discount
        	else {
        		netpay = priceQty;
        	}//conditions set ends here
        	
        	netpay = priceQty - discount;
        	
        	totalPrice += priceQty; //total price of  all items bought
        	totalDis += discount; //total discounts given
        	totalNet += netpay - totalDis; //total net payable
        	
        	
        	System.out.format ("%-15s %-15s %-15s %-15s %-15s \n", "X", "Item Name", "Item Quantity", "Item Discount", "Netpay");
        	//%d%s%f in line with printf as java rules suggests
        	//%d formats decimal integer; %s formats strings & %f formats floating point (decimal number) with %8.2f meaning eight digits and two decimal points
        	//System.out.printf ("%d %s %d %2.2f %8.2f \n", x, itemName, qty, discount, netpay);
        	
        	System.out.format ("%-15s %-15s %-15s %-15s %-15s \n", x, itemName, qty, discount, netpay);
        	System.out.println ("\n");
        	
        }
        
        System.out.println ("Total Gross Pay:\t\t" + totalPrice);
        System.out.println ("Total Discount Given:\t\t" + totalDis);
        System.out.println ("Net Payable:\t\t" + totalNet);
        
    }
}
