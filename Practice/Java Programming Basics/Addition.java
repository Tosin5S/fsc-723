import javax.swing.*;
// program to add two numbers together
public class Addition {
    public static void main (String args[]) {
        // Declaring your variables ...
        String firstNumber, secondNumber;
        int number1, number2, sum;

        // Reading the data ...
        firstNumber = JOptionPane.showInputDialog("Enter first Number");
        secondNumber = JOptionPane.showInputDialog("Enter second Number");

        // Converting the data into int types
        number1 = Integer.parseInt(firstNumber);
        number2 = Integer.parseInt(secondNumber);

        sum = number1 + number2; // Computing the sum

        JOptionPane.showMessageDialog(null, "The sum is " +sum, "Result", JOptionPane.PLAIN_MESSAGE);
        System.exit(0);
    } // end main method
} // end class Addition 