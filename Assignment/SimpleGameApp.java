/* 
* Exercise 2: A Simple Game Application for Children
* The program is meant for ages 6 years and below. It will randomly generate any two numbers between 1 and 10 and sum them up. 
* It then asks the user to provide the sum of the two numbers generated.The sum from the user is compared with the real sum computed by the computer. 
* The score of the user is incremented if he/she gets the answer. This process is repeated for 10 rounds.
* The program finally prints the score of the user out of 10 marks. 
* If the user gets at least 7 marks, the program reports “Congrats, you are an excellent player”, if he/she gets between 4 to 6 marks inclusive, 
* the program reports “You have tried, please try harder next time”. If the user gets between 0 to 3 inclusive, the program reports “Sorry, you need to buck up next time”.
*/

import java.util.*;

public class SimpleGameApp {
    public static void main(String[] args) {
        // Input, Process and Output
        int score = 0;
        int rounds = 10;
        
        System.out.println("Welcome !! This Simple Game Application is meant for children age 6 and below. ");
        Scanner scanner = new Scanner(System.in);
        
        for (int round = 1; round <= rounds; round++) {
            int numOne = (int) (Math.random() * 10) + 1;
            int numTwo = (int) (Math.random() * 10) + 1;
            int correctAnswer = numOne + numTwo;

            System.out.print("Round " + round + ": What is the sum of " + numOne + " and " + numTwo + "? ");
            int userAnswer = scanner.nextInt();

            if (userAnswer == correctAnswer) {
                System.out.println("Correct Answer !");
                score++;
            } else {
                System.out.println("Incorrect Answer! The correct answer is " + correctAnswer + ".");
            }
        }
   
        System.out.println("You scored " + score + " out of " + rounds + ".");

        if (score >= 7) {
            System.out.println("Congrats, you are an excellent player!");
        } else if (score >= 4) {
            System.out.println("You have tried, please try harder next time.");
        } else {
            System.out.println("Sorry, you need to buck up next time.");
        }

        scanner.close();
    }
}
