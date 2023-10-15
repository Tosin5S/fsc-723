import java.util.*;
// program to compute the average test reading for each student and to compute the average of all readings taken using nested for loop

public class nestedforloop {
        
   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println ("Enter the number of students running the test");
        int numstu = input.nextInt();
        System.out.println ("Enter the number of repeats on the test");
        int numrep = input.nextInt();
        double  sum = 0;
        
        //iteration for the number of students
        for (int i=1; i<=numstu; i++)  {
        	 double sumtests = 0;
        		
        	//iteration for number of readings for each student
        	for (int j=1; j<=numrep; j++) {
        		System.out.println ("enter reading for test " +j+ " by student " +i);
        		
        		//takes the readings into the variable name "tests" and adds the readings to the variable name "sumtests"
        		double  tests = input.nextDouble();
           		sumtests += tests;
            	        		
        	}
        	System.out.println ("\n sum of readings by student " + i +" = " + sumtests +"\n");
        	System.out.println ("\n the average of readings taken by student " + i +" = " + (sumtests/numrep) +"\n"); //(sumtests/numrep) calculates the average of readings by the student
        	sum += sumtests; //adds up each total reading by each students to the variable name "sum"
        }
        
        System.out.println ("sum of all readings = " + sum);
        System.out.println ("\n the average of readings taken by all student = " + (sum/(numrep*numstu) ) ); //(numrep*sumstu) to calculate total readings
    }
}
