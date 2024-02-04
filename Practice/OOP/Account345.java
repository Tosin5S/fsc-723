class Account345 {
    // Instance variables or class fields 
    String custName;
    double balance;

    // constructor
    public Account345(String name, double bal) {
        custName = name;
        balance = bal;
    }

    // method to compute new balance after deposit 
    public void deposit(double dep) {
        balance += dep;
    }

    // method to get balance
    public double getBalance() {
        return balance;
    }

    // method to get the customer's name 
    public String getName(){
        return custName;
    }

    // method to compute new balance after withdrawal
    public void withdrawal(double out) {
        balance -= out;
    }
} // end class Account