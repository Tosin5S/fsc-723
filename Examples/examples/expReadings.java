import java.util.*;

public class expReadings {
        
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println ("Enter number of students");
        int n = input.nextInt();
        System.out.println ("Enter number of repeats");
        int m = input.nextInt();
        
        float total = 0;
        for (int i = 1; i <= n; i++) {
        	
        	float sum = 0;
        	for (int j = 1; j <= m; j++) {
        		System.out.println ("enter data for student " + i + " repeat " + j );
        		float d = input.nextFloat();
        		sum += d;
        		total += d;
        		
        	}
        		
        		double sm = sum/m;
        		System.out.println ("mean for student " + i+" = " + sm);
        	
        }
        double om = total / (n * m);
        System.out.println ("Overall mean of all readings = " + om);
        
        
        
    }
}
