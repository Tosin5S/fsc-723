import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter A: ");
        int A = scanner.nextInt();
        
        System.out.print("Enter B: ");
        int B = scanner.nextInt();
        
        int result;
        
        for (int i = 1; i <= 5; i++) {
            if (A > B) {
                result = A + B;
                System.out.println("Sum: " + result);
            } else {
                result = A * B;
                System.out.println("Product: " + result);
            }
        }
    }
}
