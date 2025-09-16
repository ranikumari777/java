
public class ExcetionsHandling {

    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 20;
            int c = a + b;
            System.out.println("Result is :" + c);

        } catch (ArithmeticException e) {
            System.out.println("Error:Division by zero is not allowed");
        } finally {
            System.out.println("Program is completed");
        }
    }
}
