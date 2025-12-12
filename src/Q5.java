import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter second name: ");
        String lastName = scanner.nextLine();

        System.out.println(lastName + " " + firstName);

        scanner.close();
    }
}