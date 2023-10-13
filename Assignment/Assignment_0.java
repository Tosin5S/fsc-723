import java.io.*;

public class Assignment {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter the number of goods bought: ");
        String goodsInput = br.readLine();
        int goods_number = Integer.parseInt(goodsInput);
        
        if (goods_number <= 0) {
            System.out.println("Your goods bought should be greater than 0!");
        } else {
            System.out.println("Enter the price of each goods: ");
            String priceInput = br.readLine();
            float price = Float.parseFloat(priceInput);
            
            float gross_pay = goods_number * price;
            float discount = 0;
            
            if (goods_number <= 5) {
                discount = 0.02f * gross_pay;
            } else if (goods_number <= 10) {
                discount = 0.05f * gross_pay;
            } else {
                discount = 0.1f * gross_pay;
            }
            
            float payable_amount = gross_pay - discount;
            
            System.out.println("The amount payable for " + goods_number + " goods bought before discount is: " + gross_pay);
            System.out.println("The discount given is: " + discount);
            System.out.println("The price to be paid after discount given is: " + payable_amount);
        }
    }
}
