import java.util.*;

public class AgeBonusAndPenalty {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = input.nextInt();
        int bonus = 0;
        int penalty = 5;
        
        if ((age >= 5) && (age <= 10)) {
            bonus += 5;
            penalty -= 5;
        }
        System.out.println("Bonus = " +bonus+ "\nPenalty = " +penalty);
    }
}
