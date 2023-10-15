import java.util.*;

public class avrgTemp {
        
   
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner (System.in);
        System.out.println ("Enter number of stations...");
        int s = input.nextInt(); // s = stations
        float sum = 0;
        
        for (int i = 1; i <= s; i++) {
        	System.out.println ("Enter temperature for the station " +i);
        	float  d = input.nextFloat();
        	if (d > 25.0) {
        		System.out.println ("The temperature is quite high");
        		
        	}
        	sum +=d;  // sum = sum + d
        		System.out.println ("Sum of temperature equals " +sum );
        		System.out.println ("\n");
        	}
        float  avrg = sum / s;
        System.out.println("Mean temperature of " +s+ " stations is "  + avrg);
        System.out.println ("\n");
        
       
        
        
        
    }
}
