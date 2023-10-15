import java.util.*;

public class Vehicle {
	
	// maxSpeed, wheels, color, and fuelCapacity are the attributes/characteristics of our Vehicle class, and horn() is the only methods/behavior.
	int wheels;
	String color;
	int maxSpeed;
	double fuelCapcity;
        
   
    void honk() {
    	System.out.println("Beep!");
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        Vehicle vh1 = new Vehicle ();
        Vehicle vh2 = new Vehicle ();
        
        System.out.println("Enter number of wheels on Vehicle");
        vh1.wheels = input.nextInt(); //accepts input using object "input" belonging to Scanner class and store in vh1.wheels -- an object vh1 + attribute wheels created under Vehicle class and 
        
        if (vh1.wheels <= 5 ) {
        	vh1.honk();
        }
        
        
        
        
        
    }
}
