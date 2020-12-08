import java.util.Scanner;

public class scanerTest {
    public static void main(String[] args) {
/*
        Scanner scanner = new Scanner(System.in);
        String myString = scanner.next();
        int myInt = scanner.nextInt();

        System.out.println("myString is: " + myString);
        System.out.println("myInt is: " + myInt);
        scanner.close();
*/
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a :");
        int a = scan.nextInt();
        System.out.println("enter b :");
        int b = scan.nextInt();
        System.out.println("enter c :");
        int c = scan.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
