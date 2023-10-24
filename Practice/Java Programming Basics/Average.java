// Using the Standard Input / Output (Keyboard and Monitor) on Command Line
// Program to compute average of any three numbers

import java.util.Scanner;
class Average {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        // Reading in the input data a, b and c
        System.out.println("Enter the value of a");
        float a = input.nextFloat(); //nextInt for int data
        System.out.println("Enter the value of b");
        float b = input.nextFloat();
        System.out.println("Enter the value of c");
        double c = input.nextDouble(); // for double data
        System.out.println("What is your name");
        String name = input.next(); // Reading a string data

        // Computations ...
        double sum = a + b + c;
        double avg = sum / 3.0;
        System.out.print("Hello! " +name + "\n The Average of your data is: " +avg + "\nBye ...");
        System.exit(0);
    }
}