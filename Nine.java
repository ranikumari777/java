//calculators in java
import java.util.Scanner;

public class Nine{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the calcultors:");
        System.out.println("Enter a First Input :");
        int a=sc.nextInt();
        System.out.println("Enter a opreator Input(+,-,*,/,%) :");
        char op = sc.next().charAt(0);
        System.out.println("Enter a Second Input :");
        int b=sc.nextInt();
        switch(op)
        {
            case '+': System.out.println("Additions = "+(a+b));
            break;
            case '-': System.out.println("Substraction = "+(a-b));
            break;
            case '*': System.out.println("Multipications = "+(a*b));
            break;
            case '/':
            if(a!=0)
            {
                System.out.println("Divide = "+(a/b));
            }
            else{
                System.out.println("Eorro: Division by zero is not allowed");
            }
            break;
            case '%': System.out.println("Module = "+(a%b));
            break;
            default: System.out.println("Invalid Opertors please Choses(+,-,*,/,%)  ");
        }
    }
}