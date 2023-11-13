import javax.swing.*;
import java.text.DecimalFormat; // to format our output 

class array2D {
    public static void main(String[] args) {
        float[][] score; //declaring a 2-dimensional array

        // Getting the number of rows and columns for the array 
        int r = Integer.parseInt(JOptionPane.showInputDialog("Enter number of rows for the 2-dimensional array"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Enter number of columns for the 2-dimensional array"));

        // Giving the array the number of rows r and columns c 
        score = new float[r][c]; // The array is finally declared

        float sum = 0; // Accumulator to sum all data in the array
        
        // Data capturing into the array
        for (int i = 0; i < r; i++) {
            // Outer loop for rows
            for (int j = 0; j < c; j++) {
                // Inner loop for columns 
                score[i][j] = Float.parseFloat(JOptionPane.showInputDialog("Enter data for row" + (i + 1) + "and column" + (j + 1)));
                sum += score[i][j]; // Accumulating data into sum
            } // Ending innermost for loop
        } // Ending outermost for loop

        // Computing the average score of the whole data 
        double mean = sum / (r*c);
        String output = "Average for all students = " + mean + "\n";

        // Output is a variable to accumulate all outputs in this program
        // Computing the average score for each student
        // Note the position of the initialized accumulator sum
        
        for (int i = 0; i < r; i++) {
            sum = 0;
            for (int j = 0; j < c; j++) {
                sum += score[i][j];
            } // Ending innermost for loop for a row or a student 

        double avg = sum/c;

        // rounding up avg to 2 places of decimals 
        DecimalFormat twoDigits = new DecimalFormat("0.00");
            String avgRnd = twoDigits.format(avg);
            output += "Average for student" +(i + 1) + " = " + avgRnd + "n";
        } // Ending outermost loop to process another row of data
        // Printing the final result
        JOptionPane.showMessageDialog(null, output, "Results...", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);       
    } // Ending the main method 
} // Ending the class array