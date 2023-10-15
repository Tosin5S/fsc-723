  import java.util.*;

public class stringLength {
        
  
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        String str = " Z!E is a man, and i'm making hi(s)tory ";
        System.out.println ("The length of the string is " + str.length());
        
        int [] array = {3,4,5,2,3,4,2,3,4,5};
        System.out.println ("The length of the array is " + array.length);
        
        System.out.println ("********************** ");
        System.out.println ("");
        
        System.out.println ("Enter index");
        int n = input.nextInt();
        
        System.out.println ("The character at index position " + n + " of the string is " + str.charAt(n));
        
        System.out.println ("The index of character '!' is " + str.indexOf("!"));// inedx + 1
        System.out.println ("The last index of character 'a' is " + str.lastIndexOf("a")); //index + 1
        
        System.out.println ("********************** ");
        System.out.println ("");
        
        
        for (int i=0; i< str.length(); i++) {
        	if (str.charAt(i) == 'a') {
        		System.out.println ("The character 'a' is found at position " + (i+1) + " but index " + i);
        	}
        	
        }
        System.out.println ("********************** ");
        System.out.println ("");
        
        System.out.println ("The hashcode of the string is " + str.hashCode());// hashcode gives the unique integer value of a string
        
        
    }
}
