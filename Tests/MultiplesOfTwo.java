import java.util.*;
class MultiplesOfTwo {
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);
        double sum = 0;
        System.out.println("Enter the number of times : ");
        int numOfTimes = input.nextInt();
        int count = 0;

        for (int i = 1; i <= numOfTimes; i++) {
            System.out.println("Enter data " +i);
            float data = input.nextFloat();
            if ((data % 2) == 0) {
                break;
            }
            else {
                sum += data;
                count = count + 1;
            }
        } // next i

        double mean = sum / count;
        System.out.println("Sum =" +sum);
        System.out.println("Mean =" +mean);
    }
}