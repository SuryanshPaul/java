import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter your name:");
        String name = scanner.nextLine();
        System.out.println(name);
        System.out.println("enter your branch:");
        String branch = scanner.nextLine();
        System.out.println( branch );
        System.out.print("enter your section:");
        int sec = scanner.nextInt();
        System.out.println( "cse"+ sec);
        System.out.print("enter your roll no.:");
        int num= scanner.nextInt();
        System.out.println(num);
        scanner.close();



}

}
