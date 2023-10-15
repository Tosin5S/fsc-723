import java.util.*;

//bubble sorting data in a linear array
//bubble sorting is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements
        
public class srtingarray {
        
   
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner input = new Scanner (System.in);
        System.out.println ("Enter the number of elements the array will contain" );
        int n = input.nextInt();
        
        //int [] A  = {34,45,23,10,5};
        int [] A = new int[n];
        
        for (int i = 0; i < n; i++) {
        	System.out.println ("Enter the element of the array at location " + (i+1) );
        	A [i] = input.nextInt(); //assigns the inputted value to the array location i
        }
        
        for (int i=0; i<A.length; i++) {
        	System.out.print (A[i] + "\t");
        }
        System.out.println ("\n");
        
        
        for (int i = 0; i < A.length; i++) {
        	for (int j=i+1; j <A.length; j++) {
        		if (A[i] > A [j]) {//swap
        			int temp = A [i];
        			A [i] = A[j];
        			A [j] = temp;
        		}// end if
        	}// next j
        }//next i
        // printing the new sorted array
        for (int i=0; i<A.length; i++) {
        	System.out.print (A[i] + "\t");
        }
        System.out.println ("\n The array has been sorted in ascending order using bubble sort. Good bye");
    }
}
