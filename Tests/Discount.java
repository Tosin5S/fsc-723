import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the number of goods bought: ");
        int goodsNumber = input.nextInt();
        
        // Validating Code 
        if (goodsNumber <= 0) {
            System.out.println("Your goods bought should be greater than 0!");
        } else {
            System.out.println("Enter the price of each good: ");
            float price = input.nextFloat();
            
            float grossPay = goodsNumber * price;
            float discount = 0;
            
            // Taking the lower limit in descending order
            if (goodsNumber >= 21) {
                discount = 0.08f * grossPay;
            } else if (goodsNumber >= 11) {
                discount = 0.06f * grossPay;
            } else if (goodsNumber >= 6) {
                discount = 0.04f * grossPay;
            } else {
                discount = 0.02f * grossPay;
            }
            
            float payableAmount = grossPay - discount;
            
            System.out.println("The amount payable for "+goodsNumber+ " goods bought before discount is: " + grossPay);
            System.out.println("The discount given is: "+ discount);
            System.out.println("The price to be paid after discount given is: " + payableAmount);
        }
        
        System.exit(0);
    }
}
