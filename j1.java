import java.util.*;

public class First{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();
            System.out.print("Enter second number: ");
            int b = sc.nextInt();
            System.out.println("You entered: " + a + " and " + b);
        } catch (InputMismatchException e) {
            System.out.println("Please enter valid integers.");
        }
    }
}
