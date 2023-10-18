import java.util.*;
public class NumAdd {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int numAdd = 0;
        int count = 1;
        System.out.println("Enter the first number ");
        int num = in.nextInt();

        while (num >= 0) {
           numAdd += num;
           count++;
           System.out.println("Next Number? ");
           num = in.nextInt();   
        }
        
        System.out.println("Count is " + count);
        System.out.println("Sum is " + numAdd);
    }
}