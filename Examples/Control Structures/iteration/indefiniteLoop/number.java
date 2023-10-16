import java.util.*;
public class number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float sum = 0, num = 0;
        int i = 0, count = 0;

        for ( ; ; ) {
            // indicating infinite loop
            System.out.println("Enter data" + (i + 1));
            num = input.nextFloat();
            if (num < 0)
               break;
            sum += num;
            count++;
            i++;
        } // next indefinite loop

        System.out.println("Total data added so far is " + sum + "\n Total number of data added is" + count); 
    }
}