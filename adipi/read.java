import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int x = scanner.nextInt();
        System.out.println("You entered: " + x);
        scanner.close();
    }
}
