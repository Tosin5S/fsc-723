import java.util.*;
public class demo {
        
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input =  new Scanner (System.in);
        System.out.println ("what's your name?");
        String name = input.nextLine();
        System.out.println ("what's your age?");
        int age = input.nextInt();
        System.out.println ("input the current year");
        int currYear = input.nextInt();
        int birthYr = currYear - age;
        System.out.println ("your birth year is" + " " + birthYr);
        
        
    }
}
