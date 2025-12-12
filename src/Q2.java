import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print(" Enter your marks:");
        int marks = scanner.nextInt();
        if(marks>=90&&marks<=100){
            System.out.println(  " you got O grade" );
        }
        else if(marks>=80&&marks<=90){
            System.out.println( "you got E grade" );
        }
        else if(marks>=70 &&marks<=80){
            System.out.println( "you got A grade" );
        }
        else if(marks>=60&&marks<=70){
            System.out.println( "you got B grade" );
        }
        else if(marks>=50&& marks<=60){
            System.out.println( "you got C grade" );
        }
        else if(marks>=40 && marks<=50){
            System.out.println( "you got D grade" );
        }
        else if(marks>=0&& marks<=40){
            System.out.println( "you got F grade" );
        }
        else{
            System.out.println( "invalid marks" );
        }
        scanner.close();



    }

}