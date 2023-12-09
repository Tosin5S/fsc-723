import javax.swing.JOptionPane;
class WordSearch {
    public static void main(String args[]) {
        String str = JOptionPane.showInputDialog("Enter a string of your choice");
        System.out.println("The original string entered is \n" + str + "\n");
        int i=str.indexOf("is");
        if (i > 0) {
            System.out.println("the word 'is' appears standing alone in the string");
            System.out.println("the appearance 1 of 'is' starts at index" +i);
            int k = 2;
            for (int j = 0; j >= 0;) {
                j = str.indexOf("is", i+1);
                if (j > 0) {
                    System.out.println("the appearance "+k+" of 'is' starts at index" +j);
                    k++;
                    i = j;
                } // end inner if
                else 
                   System.out.println("No more 'is' is found. Therefore, it appears " + (k-1) + "times");
            } // next j
        } // end outer if
        else
           System.out.println("the word 'is' doesn't stand alone in the string");
    }
}