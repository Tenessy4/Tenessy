import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n > 10)
            System.out.println("Max 10");
        else {
            if (n < 0)
                System.out.println("Min 0");
            else {
                var result = 1;
                for (var i = 1; i < n; i++) {
                    result *= i;
                }
                System.out.println(result);
            }
        }

    }
}
