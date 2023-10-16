// Swich-Case Control Statements can be use for menu-driven applications
// Question: Assist a primary school children, any two numbers 

import java.util.*;
class Arithmetic {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Welcome the program arithmetic of 2 numbers \n Enter 1 for addition \n 2 for multiplication \n 3 for Division \n 4 for subtraction \n 5 to exit");
        int choice = input.nextInt();
        System.out.println("Enter the two numbers, one by one");
        float n1 = input.nextFloat(); float n2 = input.nextFloat();
        

        switch (choice) {
            case 1: System.out.println("You have chosen addition");
            float add = n1 + n2;
            System.out.println("sum = " + add);
            break;

            case 2: System.out.println("You have chosen multiplication");
            float mul = n1 * n2;
            System.out.println("The product = " +mul);
            break;

            case 3: System.out.println("You have chosen division");
            double div = n1 / n2; 
            System.out.println("Division =" +div);
            break;

            case 4: System.out.println("You have chosen subtraction");
            float sub = n1 - n2;
            System.out.println("Subtraction = " + sub);
            break;

            case 5: System.out.println("You have chosen to exit");
            System.out.println("Bye");
            break;

            default: System.out.println("Wrong choice please \n program terminates");
        } // end switch
        System.out.println("Thanks for using this program");
    } //end main
} //end class 