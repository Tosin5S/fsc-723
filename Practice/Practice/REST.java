import java.util.*;
public class REST {
    public static void main (String [] args) {
        double amount;
        double balance = 0.0;
         Scanner input = new Scanner (System.in);
         System.out.println("A Rest API For Deposit and Withdrawal. /n Enter any key to continue /n Enter 3 to exit");
         int selection = input.nextInt();
         while(selection != 3){
         
         System.out.println("Enter your choice: /n 1. Deposit /n 2. Withdrawal");
         int choice = input.nextInt();
         switch (choice) {
            case 1:
            // Deposit 
            System.out.println("Enter the amount that you would like to deposit: ");
            amount = input.nextDouble();   
            balance += amount;
            System.out.println("Your balance is :"+balance);
            break;
            case 2:
            // Withdrawal
            if (balance == 0.0 ){
            System.out.println("You cannot withdraw");
            System.out.println("Your balance is :"+balance);
            break;
 
            } 
            else{
                System.out.println("Enter the amount that you would like to withdraw: ");
                amount = input.nextDouble();       
                balance -= amount;
                System.out.println("Your balance is :"+balance);
                break;
            }

         } // end switch
         System.out.println("Enter Selection: ");
         selection = input.nextInt();

         } // end while
         
         System.out.println("Your balance is :"+balance);

     }
}
