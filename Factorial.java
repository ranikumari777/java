
import java.util.Scanner;
public class Factorial{
    public static int factt(int n)
{
    int f=1;
    for (int i = 1; i <=n; i++) {
       f= f*i;
    }
    return f;
}
    public static void main(String args[])
    {
        System.out.println("Calculate a Factorial:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int total=factt(n);
        System.out.println("Calculates is :"+total);
    }
}