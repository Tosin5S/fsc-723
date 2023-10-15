import java.util.*;

public class switchcase {
        
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println ("Perimeter and Area of shapes: \n Enter 1 for Recetangle \n Enter 2 for Circle \n Enter 3 for Triangle");
        
        int n = input.nextInt ();
        
        switch (n) {
        	case 1 : System.out.println ("Enter the length and breadth of the Rectangle");
        		int l = input.nextInt();
        		int b = input.nextInt();
        		System.out.println ("The area of the Rectangle is " + (l*b)+ "\n The perimeter of the Rectangle is " + (2 * ( l + b )) );
        		break;
        		
        	case 2 : System.out.println ("Enter the radius of the circle");
        		double r = input.nextDouble();
        		System.out.println ("The area of the circle is " + (Math.PI * Math.pow(r,2)) + "\n The perimeter of the Circle is " + (2 * Math.PI * r) );
        		break;
        		
        	case 3 : System.out.println ("Enter the base and height to calculate the area of the Triangle");
        		double base = input.nextDouble();
        		double h = input.nextDouble();
        		System.out.println ("The area of the Triangle is " + (0.5 * base * h));
        		System.out.println ("Enter the three sides of the Triangle to calculate its perimeter");
        		double aa = input.nextDouble();
        		double bb = input.nextDouble();
        		double cc = input.nextDouble();
        		System.out.println ("The perimeter of the Triangle is " + (aa + bb + cc));
        		break;
        		
        	default: System.out.println ("The number you entered is not assigned to a shape \n goodbye for now");
        		
        
        	
        }
       
        
        
        
    }
}
