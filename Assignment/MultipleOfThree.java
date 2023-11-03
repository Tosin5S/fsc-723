/* 
* Exercise 1: Given a series of data containing the ages or heights of students in class. 
* Write a program using a loop, break, or continue statement 
* to compute the average of all data that are multiples of 3 in the data series.
*/

import java.util.*;

public class MultipleOfThree {
    public static void main (String[] args) {
        // Input, Process and Output
        double sum = 0;
        double count = 0;
        
        System.out.println("Welcome !! This program can compute the average of all data that are multiples of 3.");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of data: ");
        int numOfData = input.nextInt();

        for (int i=1; i<=numOfData; i++) {
            System.out.println("Enter data " + i);
            double data = input.nextDouble();
            if((data % 3) == 0) {
               sum += data;
               count = count + 1;
               System.out.println("Multiple of 3"); 
               continue;
            }
            else {
                System.out.println("Not a multiple of 3"); 
            }
        } //next i

        if (count == 0)
           System.out.println("Error ...");
        else {
            double average = sum / count;
            System.out.println("The average of multiples of 3 is : " + average);
        }
    }
}