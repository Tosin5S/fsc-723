import java.util.*;

public class ChemistryStudentTitration {
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);
        int numOfStd = input.nextInt();
        int repetition = input.nextInt();
        float total = 0;

        for (int i=1; i<n; i++) {
        float sTotal = 0; // Student Total
            for (int i = 1; i <= numOfStd; i++) {
                System.out.println("Enter data for student Number " +i+ "Repetition");
                float d = input.nextFloat();
                total += d;
                sTotal += d;
            } // Next Repeat
            double meanStud = sTotal / repetition;
            System.out.println("Mean titre volume for student number " +i+ "is"+ "meanStud");
        } //next student
        double overAllMean = total/(numOfStd * repetition);
        System.out.println("Overall mean titre value of the school is " + overAllMean);
    }   
}
