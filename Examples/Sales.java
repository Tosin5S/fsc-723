import java.util.*;

class Sales {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        String output = "S/N itemName Qty UnitPrice GrossPay Discount Netpay \n";
        // Initialize the totals
        double Tgp = 0, Td = 0, Tnp = 0;

        System.out.println("Number of items bought?");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Item Name?");
            String itemName = input.nextString();
            System.out.println("Unit price?");
            float p = input.nextFloat();
            System.out.println("Quantity bought?");
            int q = input.nextInt();
            float gp = p * q; //Gross pay
            Tgp += gp; //increment Total grosspay
            double d = 0;
            if (q >= 11)
               d = 0.1 * gp;
            else if (q >= 6)
               d = 0.06 * gp;
            else if (q >= 1)
               d = 0.03 * gp;
            else
               d = 0;
            Td += d; //Increment total discount 
            double np = gp -d; //Net pay
            Tnp += np; //Increment net pay
            output += i +  "\t \t" + itemName + "\t \t" + q + "\t \t" +p + "\t \t" +gp + "\t \t \t " +d + "\t \t \t" +np + "\n";
        } // Nextitem on the for - loop
        //printing the outputs
        System.out.println(output);
        System.out.println("Total Grosspay = " + Tgp);
        System.out.println("Total Discount given = " + Td);
        System.out.println("Total NetPay = " + Tnp);
        System.out.println("Thanks for your patronage = ");
    } // end main
} // end class 