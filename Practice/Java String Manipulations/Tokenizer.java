import java.util.*;
import javax.swing.*;

class Tokenizer {
    public static void main (String[] args) {
        String str = JOptionPane.showInputDialog("Enter the string");
        StringTokenizer tokens = new StringTokenizer(str);
        System.out.println(tokens.countTokens() + "Tokens");
        String [] words = new String[tokens.countTokens()];
        while (tokens.hasMoreTokens()) {
            // Print the tokens 
            System.out.println(tokens.nextToken());
        } // end while
    }
}