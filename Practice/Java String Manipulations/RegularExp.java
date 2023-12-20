import java.util.*;
public class RegularExp {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program demonstrates regular expressions in Java");

        // Data Entry
        System.out.println("Enter your name, surname, first and then others");
        String name = input.nextLine();
        System.out.println("Enter your phone number");
        String phone = input.nextLine();
        System.out.println("Enter your office address in the form: No. 4, Adeyi Street, Agbowo Ibadan.");
        String officeAdd = input.nextLine();

        // Regular Expression Testing 
        if (!name.matches("[A-Z][a-zA-Z]*\\s[a-zA-Z]*")) {
            System.out.println("This is not a valid name");
        }
        else {
            System.out.println("This is a valid name");
            if (!phone.matches("[0]\\d{10}")) {
                System.out.println("This is not a valid phone number");
            }
            else {
                System.out.println("This is a valid phone number");
            }

            if (!officeAdd.matches ("[N][o].\\s\\d{1,},\\s\\w{2,}\\s\\w{2,},\\s\\w{2,}\\s\\w{2,}."))
                System.out.println("This is not a valid Office Address");
            else 
                System.out.println("This is a valid office Address");
        }

    }
}