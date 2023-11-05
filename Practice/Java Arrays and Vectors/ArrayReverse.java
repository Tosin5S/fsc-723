import javax.swing.*;
class ArrayReverse {
    public static void main (String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Enter the length of the array"));
        int[] A = new int[n];

        // Reading Data into the Array A
        for (int m=0; m<n; m++)
            A[m] = Integer.parseInt(JOptionPane.showInputDialog("Enter data" + (m+1)));

        // Printing the original array A
        System.out.println("Original array ..... /n");
        for (int i = 0; i<n; i++)
            System.out.print(A[i] + "\t");

        System.out.println("\n");

        // reversing the array A, the algorithm... .
        int i = 0, j = n - 1;
        while ((i != j)) {
            int temp = A[i]; // swapping 
            A[i] = A[j];
            A[j] = temp;
            i++;
            j--;
            if (j < i)
               break;
        } // end while
        
        // Printing the reversed array 
        System.out.println("Reversed array .... \n");
        for (int k = 0; k < n; k++)
            System.out.print(A[k] + "\t");
        
        // Closing the program 
        System.out.println("\n");
        System.exit(0);
    }
}