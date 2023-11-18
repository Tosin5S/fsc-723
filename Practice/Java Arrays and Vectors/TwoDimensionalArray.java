import java.util.*;
public class TwoDimensionalArray {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        // Reading data on numbers of students and scores

        System.out.println("Enter the number of rows");
        int r = input.nextInt();
        System.out.println("Enter the number of columns");
        int c = input.nextInt();

        // Declaring the array CLASS
        int score[][] = new int[r][c];
        double A[] = new double[r]; // Array to capture the mean score per student
        float totalScore = 0;

        // Reading data into the array
        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                System.out.println("Enter data at row" +(i+1)+"column" +(j+1));
                score[i][j] = input.nextInt();
            }
        }

        // double A[] = new double[r];
        // float totalScore = 0;
        for (int i = 0; i < r; i++){
            float studentScore = 0;
            for (int j = 0; j < c; j++) {
                totalScore += score[i][j];
                studentScore += score[i][j];
            } // next course
        double studentMean = studentScore/c;
        System.out.println("Mean for student" +(i+1)+ "=" +studentMean);
        }

        // A[i] = studentMean;
        double totalMean = totalScore /(r * c);
        System.out.println("Overall Mean Score for all the students =" +totalMean);
        // To report students whoose mean score >= overall meanScore
        for (int i = 0; i < A.length; i++) {
            if (A[i] >= totalMean){
                switch(i){
                    case 1: System.out.println("Olu has mean score > = Overall Mean Score");
                    break;
                    case 2: System.out.println("Sayo has mean score > = Overall Mean Score");
                    break;
                    case 3: System.out.println("Janet has mean score > = Overall Mean Score");
                    break;
                    case 4: System.out.println("David has mean score > = Overall Mean Score");
                }
            }
        }
    }
}
