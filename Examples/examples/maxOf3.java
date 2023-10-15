import java.util.*;

public class maxOf3 {
        
    static int max3 (int a,int b,int c) {
    	//int maxi3 = Math.max((Math.max(a,b)),c);
    		return Math.max((Math.max(a,b)),c);
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner (System.in);
        System.out.println ("Enter first number...");
        int num1 = input.nextInt();
        System.out.println ("Enter second number...");
        int num2 = input.nextInt();
        System.out.println ("Enter third number...");
        int num3 = input.nextInt();
        
        System.out.println ("The maximum of the 3 numbers entered is " + max3(num1,num2,num3));
    }
}
