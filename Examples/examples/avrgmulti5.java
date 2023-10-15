import java.util.*;

public class avrgmulti5 {
        
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner multi = new Scanner (System.in);
    	int count  = 0;
    	int sum = 0;
    	int  i=  1;
    	
    	System.out.println("Enter number of data to be entered ");
    	int n = multi.nextInt();
    	
    	for (i=1; i <= n; i++) {
    		System.out.println("Enter data " + i);
    		int m = multi.nextInt();
    		
    		if (m % 5 == 0) {
    			sum += m;
    			count++;
    		}
    	}
    	
    	System.out.println (count + " multiples of 5 were entered");
    		double avrg = sum / count;
    		System.out.println ("the mean of the " + count + " multiples of 5 entered is " + avrg);
        
    }
}
