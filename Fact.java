
import java.util.Scanner;

public class Fact{
    public static int facto(int n) {
        if(n<0)
        {
            System.out.println("Invalid numbers");
        }
        int f=1;
        for(int i=1; i<=n; i++)
        {
            f=f*i;
        }
        
        return f;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter a Factorial numbers:");
        int n=sc.nextInt();
        int totalf=facto(n);
        System.out.println("Total Factoral numbers is :"+totalf);
    }
}