//import java.util.Scanner;

public class l {
    private final Client client;

    public l(Client client) {
        this.client = client;
    }

    /*public void start() {
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
            int choice = 0;
            boolean validInput = false;
            while (!validInput) {
                try {
                    choice = scanner.nextInt();
                    validInput = true;
                } catch (Exception ex) {
                    System.out.println("Invalid input. Please enter a number.");
                    scanner.next(); // Clear the invalid input
                }
            }

            switch (choice) {
                case 1:
                    System.out.println("Enter amount to add:");
                    try {
                        double depositAmount = scanner.nextDouble();
                        client.deposit(depositAmount);
                    } catch (Exception ex) {
                        System.out.println("Invalid input. Please enter a valid amount.");
                        scanner.next(); // Clear the invalid input
                    }
                    break;
                case 2:
                    System.out.println("Enter amount to take:");
                    try {
                        double withdrawAmount = scanner.nextDouble();
                        if (client.withdraw(withdrawAmount)) {
                            System.out.println("Money taken successfully.");
                        }
                    } catch (Exception ex) {
                        System.out.println("Invalid input. Please enter a valid amount.");
                        scanner.next(); // Clear the invalid input
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
    }*/

    public static void main(String[] args) {
        Client client = new Client("eriks", "123", 100.0);
        l atm = new l(client);
    //    atm.start();
    }
}