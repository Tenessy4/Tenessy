public class Client {
    public String login;
    public String password;
    public double balance;

    public Client(String login, String password, double initialBalance) {
        this.login = login;
        this.password = password;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Money added successfully.");
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        } else {
            System.out.println("Invalid withdraw amount.");
            return false;
        }
    }
}