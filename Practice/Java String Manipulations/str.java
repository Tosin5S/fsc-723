import javax.swing.*;

class str {
    public static void main (String[] args) {
        // The program accepts a swing, converts the string into a string
        // Array using the split method 
        // Sorts the string in ascending order

        // Reading the string 
        String s = JOptionPane.showInputDialog("Enter a string of any length");
        System.out.println("\n The original string is \n \n" + s);

        // Splitting the string into a string array.
        // Space is used as the token-separator in the string 

        String[] sArray = s.split("");

        // Sorting with bubble sort technique, using the compareTo() method
        for (int i=0; i<sArray.length; i++) {
            for (int j = (i + 1); j < sArray.length; j++) {
                int k = sArray[i].compareTo(sArray[j]);

                /*
                 * compareTo() returns a negative, zero or positive integer, 
                 * if compareTo() returns a positive integer, swap the elements position
                 */

                 if (k > 0) {
                    String temp = sArray[i];
                    sArray[i] = sArray[j];
                    sArray[j] = temp;
                 } // end if 
            } // next j
        } // next i

        // Printing sorted string 
        System.out.println("\n The sorted words in the string are \n");

        for (int i = 0; i < sArray.length; i++)
            System.out.println(sArray[i]);

        System.exit(0);
    }
}