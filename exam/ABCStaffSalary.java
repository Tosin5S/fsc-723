import java.util.*;

public class ABCStaffSalary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ages are stored in an array of size n
        System.out.print("Enter the number of staff: ");
        int n = input.nextInt();
        int[] ages = new int[n];

        System.out.println("Enter the ages of staff:");
        for (int i = 0; i < n; i++) {
            ages[i] = input.nextInt();
        }

        // Salary
        int[] salaryByCategory = {35000, 50000, 75000, 100000};

        // Deductions
        double taxRate = 0.05;
        double pensionRate = 0.02;

        // Contribution
        double bonusRate = 0.1;

        // storing results
        int[] staffCountByCategory = new int[4];
        double[] totalTakeHomeByCategory = new double[4];
        double[] totalDecemberSalaryByCategory = new double[4];

        // Calculation and display results
        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            int category;
            if (age >= 18 && age <= 25) {
                category = 0;
            } else if (age >= 26 && age <= 40) {
                category = 1;
            } else if (age >= 41 && age <= 60) {
                category = 2;
            } else if (age >= 61 && age <= 65) {
                category = 3;
            } else { // Validation
                System.out.println("Invalid age for a staff member: " + age);
                continue;
            }

            staffCountByCategory[category]++;
            double salary = salaryByCategory[category];
            double tax = salary * taxRate;
            double pensionContribution = salary * pensionRate;
            double bonus = salary * bonusRate;

            totalTakeHomeByCategory[category] += (salary - tax - pensionContribution + bonus);
            totalDecemberSalaryByCategory[category] += (salary - tax - pensionContribution);
        }

        // Display results
        for (int i = 0; i < 4; i++) {
            System.out.println("Category " + (i + 1) + ":");
            System.out.println("Total number of staff: " + staffCountByCategory[i]);
            System.out.println("Total take-home by December: " + totalTakeHomeByCategory[i]);
            System.out.println("Total December salary: " + totalDecemberSalaryByCategory[i]);
            System.out.println();
        } // End for loop
        System.exit(0);
    } // End method
} // End class
