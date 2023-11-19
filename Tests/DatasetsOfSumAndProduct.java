/*
 * Assuming we have numbers of such datasets
 * for loop is a counter control loop.
 */

import java.util.*;

public class DatasetsOfSumAndProduct {
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);
        for ( int i = 1; i <= 5; i++ ) {
            System.out.println("Enter the first number: ");
            int firstNum = input.nextInt();
            System.out.println("Enter the second number: ");
            int secondNum = input.nextInt();
            
            if (firstNum > secondNum) {
                int sum = firstNum + secondNum;
                System.out.println("Sum = " + sum);
            }
            else {
                int product = firstNum * secondNum;
                System.out.println("Product = " + product);
            }    
        }   
    }
}