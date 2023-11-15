import java.util.Scanner;

public class PrimeAverageFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting number (m): ");
        int m = scanner.nextInt();

        System.out.print("Enter the ending number (n): ");
        int n = scanner.nextInt();

        double average = calculatePrimeAverage(m, n);

        System.out.println("Average of prime numbers between " + m + " and " + n + ": " + average);
    }

    private static double calculatePrimeAverage(int m, int n) {
        int sum = 0;
        int count = 0;

        for (int i = m; i <= n; i++) {
            if (isPrime(i)) {
                sum += i;
                count++;
            }
        }

        return count > 0 ? (double) sum / count : 0;
    }

    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
