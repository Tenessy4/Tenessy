import java.util.Scanner;

public class exceptions {
    public static void main (String[] args) {
        var sc =new Scanner(System.in);

        var number = 0;
        var exExist = false;
        try {
            number = sc.nextInt();
        }catch (Exception ex) {
                System.out.println("Invalid input");
                exExist = true;
        }
        if (!exExist) {
            System.out.println("Success " + number);
        }    }
}
