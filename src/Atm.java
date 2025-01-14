import java.util.Scanner;

public class Atm {
    private Client client;

    public Atm(Client client) {
        this.client = client;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter login:");
        String login = scanner.nextLine();
        System.out.println("Enter password:");
        String password = scanner.nextLine();

        if (!client.login.equals(login) || !client.password.equals(password)) {
            System.out.println("Invalid login or password.");
            return;
        }

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Add money");
            System.out.println("2. Take money");
            System.out.println("3. Check balance");
            System.out.println("4. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter amount to add:");
                    double depositAmount = scanner.nextDouble();
                    client.deposit(depositAmount);
                    break;
                case 2:
                    System.out.println("Enter amount to take:");
                    double withdrawAmount = scanner.nextDouble();
                    if (client.withdraw(withdrawAmount)) {
                        System.out.println("Money taken successfully.");
                    }
                    break;
                case 3:
                    System.out.println("Current balance: " + client.balance);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    public static void main(String[] args) {
        Client client = new Client("eriks", "123", 100.0);
        Atm atm = new Atm(client);
        atm.start();
    }
}