import javax.swing.*;
class fibonacci {
    // the void method
    static void fibn(int a) {
        int [] fib = new int[a];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < a; i++)
            fib[i] = fib[i-1] + fib[i-2];
            
        for (int i = 0; i<fib.length; i++)
            System.out.println("Fib["+i+"] =" + fib[i]);
    } // end method fibn

    // the main method ...
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Enter the terminating point for n: "));
        fibn(n); // calling the void method fibn
    }
}