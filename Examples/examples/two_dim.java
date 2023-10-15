import java.util.*;
// program to collect temperature data for a number of days, on a number of weeks; calculating the weekly average temperature and the average temperature on the data inputted

public class two_dim {
        
  
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        
        //declaring the variables r,c and array A
        System.out.println ("enter number of weeks (row) and days (column)");
        int r = input.nextInt(); //number of week
        int c = input.nextInt(); //number of days
        float  A [][] = new float [r][c]; //declaring the 2-dim array
        float dataSum = 0;
        float wkMean;
        
        //insert data
        for (int i = 0; i < r; i++) {
        	float  wkSum = 0;
        	for (int j = 0; j < c; j++) {
        		System.out.println ("Enter data at week " + (i+1) + " for day " + (j+1));
        		A [i][j] = input.nextFloat();
        		wkSum += A [i][j];   		
        	}//nextweek
        	dataSum += wkSum;
        	System.out.println ("Mean for the week " + (i+1) + " = " + (wkMean = (wkSum/c)) );
        } 
        //compute overall mean
    	System.out.println ("Total mean of temperature from the data inputted = " + (dataSum / (r * c)) + "\n");
    	
    	//printing the array
		for (int i = 0; i < r; i++) {
			System.out.print ("Week" + (i+1) + " " );
			for (int j = 0; j < c; j++) {6
				System.out.print (A[i][j] + "\t");
			}
			System.out.println ();
		}
			 

   
		
        
             
    }
    
}


	
	
