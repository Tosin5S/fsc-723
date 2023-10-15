import java.util.*;

public class stringSubStrings {
      
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner (System.in);
        String str = " Z!E is a man, and i'm making hi(s)tory ";
        
        System.out.println (str.substring(0,8));
        
        System.out.println ("");
        System.out.println ("**************************");
        System.out.println ("");
        
        String A = "You were not so good at 18";
        
        char [] ANew = A.toCharArray();
        System.out.println (ANew.length);
        
        System.out.println ("");
        System.out.println ("**************************");
        System.out.println ("");
        
        //printing char array in reverse order
        for (int i = ANew.length - 1; i >= 0; i--) {
        	System.out.println (ANew [i]);
        }
        
        System.out.println ("");
        System.out.println ("**************************");
        System.out.println ("");
        
        //splitting strings into array and tokenizening the string (printing out)
        String [] AString = A.split(" ");
        for (int i = 0; i < AString.length; i++) {
        	System.out.println (AString [i]);
        }
        
        
        
    }
}
