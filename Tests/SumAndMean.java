// Read 2 numbers, compute their sum and mean.
import java.util.*;

public class SumAndMean {
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter first number");
        float firstNum = input.nextInt();
        System.out.println("Enter second number");
        float secondNum = input.nextInt();
        float sum = firstNum + secondNum;
        float mean = sum / 2.0f;
        System.out.println("The sum = " +sum+ "\nThe mean = " + mean); 
    }    
}
