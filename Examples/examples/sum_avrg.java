import java.util.*;

public class sum_avrg {
        
   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println ("input two numbers");
        int num_a = input.nextInt();
        int num_b = input.nextInt();
        double  mean = (num_a + num_b) / 2;
        double diff_a = num_a - mean;
        double diff_b = num_b - mean;
        double mean_sqrdiff =  (Math.pow(diff_a, 2) + Math.pow(diff_b, 2))/2;
        double sdev = Math.sqrt (mean_sqrdiff);
        
        System.out.println ("the mean =" + mean);
        System.out.println ("the mean of the squared differences =" + mean_sqrdiff);
        System.out.println ("the standard deviation =" + sdev);
        
        
        
        
    }
}
