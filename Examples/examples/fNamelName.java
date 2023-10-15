import java.util.*;

public class fNamelName {
        
        static void sayHello (String fname, String lname) {
        	System.out.println("Hello " + fname + " "+ lname +","+ " I like to think you are hugely fucked!!\n");
        	
        }
        
        static int max2Int (int a, int b) {
        	if (a > b) {
        		return a;
        	
        	}
        	else {
        		return b;
        		
        	}
        	// shorter version -- return(a>b)?a:b; -- (a>b)? short version of "if (a>b)"; a:b -- "else is :"
        }
        
    public static void main(String[] args) {
        // TODO code application logic here
        	Scanner input = new Scanner (System.in); //input is the object/instance of the Scanner method
        	System.out.println("Enter your first name");
        	String fname = input.nextLine(); //passed in as string as sayHello class accepts only strings
        	System.out.println("Enter your last name");
        	String lname = input.nextLine(); //passed in as string as sayHello class accepts only strings
        	
        	sayHello(fname,lname); //fucntion sayHello called out
        	
        	System.out.println("Enter first number to be compared");
        	int a = input.nextInt(); //passed in as int as max2Int class accepts only int
        	System.out.println("Enter second number to be compared");
        	int b = input.nextInt(); //passed in as int as max2Int class accepts only int
        	
        	System.out.println("The larger number is " + 
        		max2Int(a,b));
        	
        	
        	
    }
}
