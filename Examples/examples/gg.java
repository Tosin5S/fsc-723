import java.util.*;

public class gg {
        
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner (System.in);
        
               
        
        System.out.println ("Enter number of courses");
        int numCou = Integer.parseInt(input.nextLine());
        String courses [] = new String [numCou];
        
        for (int i = 0; i < numCou;i++) {
        	System.out.println ("Enter course code for course code for course " + (i+1));
        	courses [i] = input.nextLine();
         }
    }
}
