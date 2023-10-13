import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the number of goods bought: ");
        int goods_number = input.nextInt();
        
        // Validating Code 
        if (goods_number <= 0) {
            System.out.println("Your goods bought should be greater than 0!");
        } else {
            System.out.println("Enter the price of each good: ");
            float price = input.nextFloat();
            
            float gross_pay = goods_number * price;
            float discount = 0;
            
            // Taking the lower limit in descending order
            if (goods_number >= 21) {
                discount = 0.08f * gross_pay;
            } else if (goods_number >= 11) {
                discount = 0.06f * gross_pay;
            } else if (goods_number >= 6) {
                discount = 0.04f * gross_pay;
            } else {
                discount = 0.02f * gross_pay;
            }
            
            float payable_amount = gross_pay - discount;
            
            System.out.printf("The amount payable for %d goods bought before discount is: %.2f%n", goods_number, gross_pay);
            System.out.printf("The discount given is: %.2f%n", discount);
            System.out.printf("The price to be paid after discount given is: %.2f%n", payable_amount);
        }
        
        input.close();
    }
}
