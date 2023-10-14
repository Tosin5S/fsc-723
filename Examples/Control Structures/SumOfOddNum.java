import java.util.Scanner;
public class SumOfOddNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the maximum number to compute");
        int n = in.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i+=2) {
            System.out.println(i);
            sum += i;
        } //next i
        System.out.println();
        System.out.println("Sum of odd from 1 to " + n + " = " + sum);
        System.out.println();
    }
}