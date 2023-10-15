import java.util.*;
//program to compute the mean, standard variation of a list in an array and to sum the multiples of 5 in that list

public class linearArray {
 
    public static void main(String[] args) {
    	Scanner input = new Scanner (System.in);  	
    
        // TODO code application logic here
        
        // linear array
        System.out.println ("Enter the lenght of the array...");
        int n = input.nextInt();
        
        // declare array
        int [] score = new int[n];
        
        int sum = 0; //initializing the variable - sum
        double mean = 0; //initializing the variable - mean
        double v = 0; //initializing the variable - v
        double stdev = 0; //initializing the variable - stdev
        int sum5 = 0; //initializing the variable - sum5
        
        //insert elements into the array
        for (int i = 0; i < n; i++) {
        	System.out.println ("Enter data at location " + (i+1));
        	score [i] = input.nextInt();
        	
        	// summing elements in array
        	sum += score [i];
        	
        	// mean of elements
        	mean = sum/n ;
        	
        	// variance
        	v += Math.pow((score [i] - mean),2);
       	    double var = v/n;
       	    
       	    // standard dev
       	    
       		stdev = Math.sqrt(var);

       		// summing elements in the array that are multiples of 5
       		if (score [i] % 5 == 0){
       			sum5 += score [i];
       		}
       		
       }
       System.out.println ("Sum of multiples of 5 in the array = " + sum5);
       System.out.println ("\n Sum of the elements of the array = " + sum + "\n Mean of the elements of the array " + mean +"\n Standard Deviation of the elements of the array = " + stdev);
       
       
       
       
       	
       
       
       }  
       	
       
}
