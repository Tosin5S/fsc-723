import java.util.*;


public class question3 {
      
      
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        
        //creating 2-dim array
        System.out.println ("Enter number of students & courses taken");
        int stu = input.nextInt(); int cou = input.nextInt();
        float [][] stuCou = new float  [stu][cou];
        
        
        
        //populating stuCou array
        for (int r = 0; r < stu; r++ ) {
        	for (int c = 0; c < cou; c++) {
        		System.out.println ("Enter score of Student " + (r+1) + " in Course " + (c+1));
        		stuCou [r][c] = input.nextFloat();
        	}
        }
        
        //printing the array
        System.out.println ("Printing the original data...");
        for (int r = 0; r < stu; r++ ) {
        	for (int c = 0; c < cou; c++) {
        		System.out.print (stuCou [r][c] + "\t");
        	}
        	System.out.println ();
        }
        System.out.println ("\n");
        
        //total scores & mean scores for each student
        float totalScoreStu;
        float meanScoreStu = 0;
        int count = 0;
        for (int r = 0; r < stu; r++ ) {
        	totalScoreStu = 0;
        	for (int c = 0; c < cou; c++) {
        		totalScoreStu += stuCou [r][c];
        		}
        	meanScoreStu  = totalScoreStu/cou;
        	System.out.println("Total scores for student " + (r+1) + " is " + totalScoreStu);
        	System.out.println("Mean scores for student " + (r+1) + " is " + meanScoreStu);
        	
        	//computing number of students that passed the exam as average pass mark is 52.5
        	if (meanScoreStu > 52.5) {
        	count ++;
        }
        		
        }
        System.out.println ("\n");
        
        //maximum score and course having the maximum scores
        float maxi;
        int c;
        int cc = 0;
        for (int r = 0; r < stu; r++ ) {
        	maxi = 0;
        	for (c = 0; c < cou; c++) {
        		if (stuCou[r][c] > maxi) {
        			maxi = stuCou[r][c]; //computes maximum score for a student 
        				if (stuCou[r][c] == maxi) {
        					cc = c + 1;//notes index for course
        				}
        		}
        	}
        	System.out.println ("Maximum score for student " + (r+1) + " is " + maxi + " at course " + (cc));
        }
        System.out.println ("\n");
        
        //average scores for each course
        float totalScoreCou;
        float meanScoreCou = 0;
        int r;
        for (c = 0; c < cou; c++ ) {
        	totalScoreCou = 0;
        	for (r = 0; r < stu; r++) {
        		totalScoreCou += stuCou [r][c];
        		}
        	System.out.println("Average scores for course " + (c+1) + " is " + (totalScoreCou/stu));
        }
        System.out.println ("\n");
        
        //printing number of students that passed the exam as average pass mark is 52.5
       System.out.println(count + " student(s) passed the examination");
       }
}
