class times {
    public static void main(String [] args) {
        for (int i=1; i<=10; i++) {
            // outermost loop
            for (int j=1; j<=10; j++) {
                // innermost loop
                int Times = i*j;
                System.out.print("|" + Times + "\t");
            } // Ending Innermost loop
        System.out.println ("............................. .");
        } // Ending outermost loop
    } // End main
} // End class 