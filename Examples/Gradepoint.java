import java.util.*;
public class Gradepoint { //Scope for class
   public static void main (String [] args) { //Scope for method
        System.out.println ("Enter the score ");
        Scanner input = new Scanner (System.in);
        int score = input.nextInt();
        int gp;
            if (score >= 70){
                gp = 5; //statement
            }
            else if (score >= 60){
                gp = 4;
            }
            else if (score >= 50){
                gp = 3;
            }
            else if (score >= 45){
                gp = 2;
            }
            else if (score >= 40){
                gp = 1;
            }
            else{
                gp = 0;
            }
       System.out.println ("Grade point =" + gp); 
    
       //validation code
       if ((score > 100) || (score < 0)) {
           System.out.println ("Invalid Score \n    program stops...");
        }
    }
}