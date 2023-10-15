import java.util.*;

public class factorial {
        
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println ("kindly enter a number to find the factorial... ");
        int n = input.nextInt();
        long f = 1;
        
        if ((n==0) || (n==1)) {
        	f = 1;
        }
        else {
             	for (int i = n; i >= 2; i--) {
             		System.out.println ("n is currently  " + i ); //showing current value of n
        		f = f * i; // f *=i
        	}
        }
        System.out.println ("the factorial of " + n + " is " + f);
    }
}
