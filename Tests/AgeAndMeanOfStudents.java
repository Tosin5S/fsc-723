// Age of students and their mean average

import java.util.*;

public class AgeAndMeanOfStudents {
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("How many student are in the class?");
        int numOfStd = input.nextInt();

        int sum = 0;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter the age of student number " +i);
            int age = input.nextInt();
            if (age <= 20) {
                sum += age;
                count++;
            }
        }
        double mean = sum/numOfStd;
        System.out.println("The mean age of the class is " +m);

        int countAboveMean = 0;
        for (int i =1; i <= numOfStd; i++) {
            System.out.println("Enter age "+i);
            int age = input.nextInt();
            if (age > mean) {
                countAboveMean = countAboveMean + 1;
                System.out.println("The number of students above mean age in class is " +countAboveMean );
            } // Next statement 
        }
    }
}
