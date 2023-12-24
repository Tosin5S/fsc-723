import javax.swing.*;
class SumMeanMax {
    // method to sum the two numbers
    static int sum(int a, int b) {
        return a + b;
    }

    // method to find the average of the two numbers

    static double mean(int a, int b) {
        // add, declared below is a local variable, local to this method
        int add = sum(a,b); // calling the sum method
        double avg = add/2.0;
        return avg;
    }

    // method that returns the maximum of the two numbers
    static int maxim(int a, int b) {
        if (a > b)
            return a;
        else  
            return b;
    } // end method maxim

    // The main method 
    public static void main(String[] args) {
        int x = Integer.parseInt(JOptionPane.showInputDialog("Enter the first number", "x= "));
        int y = Integer.parseInt(JOptionPane.showInputDialog("Enter the second number", "y= "));

        String output = "Summation = " + sum(x,y) + "\n" + "Average = " + mean(x,y) + "\n" + "Maximum =" +maxim(x, y);
        JOptionPane.showMessageDialog(null, output, "Methods Demo...", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    } // End main
} // End class