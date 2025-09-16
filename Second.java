
import java.util.Scanner;

public class Second{
    public static void main(String args[])
    {
        // int a=10;
        // int b=20;
        // System.out.println(a+b);
        Scanner sc = new Scanner(System.in);
        // float num1=sc.nextFloat();
        // float num2=sc.nextFloat();
        // float sum=num1+num2;
        // System.out.println("Result is = "+sum);
        int n =sc.nextInt();
        int i;
        for(i=0; i<n; i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}