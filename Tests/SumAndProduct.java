/*
 * Read 2 numbers, if the Ist is greater than the second,
 * compute their sum, otherwise, compute their products.
 */

import java.util.*;

public class SumAndProduct {
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the first number: ");
        int firstNum = input.nextInt();
        System.out.println("Enter the second number");
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