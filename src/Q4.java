import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int original = num;
        int reverse = 0;

        while (num > 0) {
            int digit = num % 10;        // Get last digit
            reverse = reverse * 10 + digit;
            num = num / 10;              // Remove last digit
        }

        if (original == reverse) {
            System.out.println(original + " is a Palindrome number");
        } else {
            System.out.println(original + " is NOT a Palindrome number");
        }

        scanner.close();
    }
}