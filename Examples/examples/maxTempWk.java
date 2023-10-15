import java.util.*;

public class maxTempWk {
        
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner (System.in);
        
        System.out.println ("Enter number of weeks");
        int wks = input.nextInt();
        System.out.println ("Enter number of days");
        int days = input.nextInt();
        
        float [][] dataWks = new float [wks][days];
        
       
        
        //imputting values for each day and week
        for (int r = 0; r < wks; r++) {
        	for (int c = 0; c < days; c++) {
        		System.out.println ("Enter temperature for " + (weekdays[c]) + ", Week " + (r+1) );
        		dataWks[r][c] = input.nextFloat();
        	}	
        }
        
        //printing array of data inputted
        for (int r = 0; r < wks; r++) {
        	for (int c = 0; c < days; c++) {
        		System.out.print(dataWks[r][c] + "\t");
        	}
        	System.out.println ();
        }
        
        //determing maximum temperature
        float maxTemp = dataWks[0][0];
        for (int r = 0; r < wks; r++) {
        	for (int c = 0; c < days; c++) {
        		if (dataWks [r][c] > maxTemp ) {
        			maxTemp = dataWks[r][c];
        		}
        	}
         }
        //Determining when maximum temperature occurs
        String [] weekdays = {"Sunday", "Monday","Tuesday","Wednesday","Thursday","Friday", "Saturday"}; 
        for (int r = 0; r < wks; r++) {
        	for (int c = 0; c < days; c++) {
        		if (dataWks [r][c] == maxTemp) {
        			System.out.println ("The maximum temperature from the data was on " + (weekdays[c]) + ", Week " + (r+1) + " at " + maxTemp + " degrees celsius" );
        		}
        	}
        }
        
        
    }
}
