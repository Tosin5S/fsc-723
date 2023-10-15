import java.util.*;

public class table2f {
        
        
        static double sqroot (int i) {
        	return Math.sqrt(i);
        }
        static double cbroot (int i) {
        	return Math.cbrt(i);
        }
        static double thrdroot (int i) {
        	return Math.pow(i,0.75);
        }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner (System.in);
        System.out.println ("Enter last value of n");
        int n = input.nextInt();
        
        System.out.println ("i \t sqroot \t cbroot \t thrdroot");
        
        for (int i=1; i<=n; i++) {
        	System.out.printf ("%d %8.2f %8.2f %8.2f\n", i, sqroot(i),cbroot(i), thrdroot(i));
        }
           
        
        
    }
}
