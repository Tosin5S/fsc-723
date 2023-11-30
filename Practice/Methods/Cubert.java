public class Cubert {
    public static void main(String[] args) {
        System.out.println("No. Cube Cube Root"); // The headings 
        for (int i = 0; i < 6; i++)
            // The functions are called (invoked) inside the printf function
            System.out.printf("%d \t\t %d       \t\t %.2f \n", i, Cube(i), cubeRoot(i));
    } // End method main

    // Method to compute the cube
    static int Cube(int n) { // The first line of a method is the method header
        return n * n * n;

    } // End method cube

    // Method to compute the cube root
    static double cubeRoot(int n) {
        return Math.cbrt(n);
    } // End method cubeRoot
} // End class cubert



