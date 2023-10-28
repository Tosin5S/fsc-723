import javax.swing.*;
class Summation {
    public static void main (String[] args) {
        int count = 0;
        float sum = 0;
        float data = Float.parseFloat(JOptionPane.showInputDialog("Enter first data"));
        while (data >= 0) {
            count++;
            sum += data;
            data = Float.parseFloat(JOptionPane.showInputDialog("Enter next data"));
        } // end while
        JOptionPane.showMessageDialog(null, "Sum of " + count + " data added is " + sum, " Results", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}