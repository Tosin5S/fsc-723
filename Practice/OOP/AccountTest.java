// Program to test the class 
public class AccountTest {
    public static void main(String[] args) {
        // Instantiating the Account class
        Account345 acc = new Account345 ("Akinola S.O.", 500);
        String  name;
        double bal;
        name = acc.getName();
        bal = acc.getBalance();
        System.out.println("Account for " + name + "has balance =N=" +bal);
        acc.deposit(800);
        bal = acc.getBalance();
        System.out.println("New Account balance after deposit for " + name + "is  =N=" +bal);
        acc.withdrawal(1000);
        bal = acc.getBalance();
        System.out.println("New Account Balance after withdraw for " + name + "is =N=" + bal);
    }
}