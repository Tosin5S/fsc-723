import java.util.*;
//searching an element in a linear array
public class searchan_array {
  
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        //to search for an element
        Scanner input = new Scanner (System.in);
        
        
        float [] arr = new float [10]; //declaring an array with data type float - arr
        
        for (int i = 0; i < arr.length; i++) {
        	System.out.println ("Enter value for location " + (i+1)+ " in the array; the array will take 10 values, click enter after each value has been inputted");
        	arr [i] = input.nextFloat(); //assigns the inputted value to the array location i
        }
              
        
        System.out.println ("Enter data to search");
        float x = input.nextFloat ();
        boolean found = false;
        
        for (int i = 0; i < arr.length; i++) {
        	if (arr [i] == x) {
        		found = true;
        		System.out.println (x + " is found at the location "  + (i+1));
        	}
        	else {
        		System.out.println (x + " is not in the list");
        		break;
        	}
        	
        }
       
        
    }
}
