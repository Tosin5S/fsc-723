import javax.swing.JOptionPane;
class palind {
    public static void main (String[] args) {
        String a = JOptionPane.showInputDialog("This program checks if a string is a palindrome, \n Enter any string of your choice: ");
        boolean stop = false;
        int i = 0, j = a.length() - 1;
        while (i < a.length()) {
            if ( a.charAt(i) == a.charAt(j)) {
                i++;
                j--;
                stop = true;
                continue;
            } // end if
            else {
                System.out.println(a + " is not palindrome");
                break;
            } // end else
        } // end while
        if (stop == true ) {
            System.out.println(a + " is a palindrome");
        } // end if 
        System.out.println("Good bye to palindrome user");
    } // end main
} // end class