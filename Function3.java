
import java.util.Scanner;

public class Function3{
    public static int Ave(int a,int b,int c) {
        int sum=a+b+c;
        int ave=sum/3;
        return ave;
    }
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter First Numbers");
        int a=sc.nextInt();
        System.out.println("Enter Second Numbers");
        int b=sc.nextInt();
        System.out.println("Enter Third Numbers");
        int c=sc.nextInt();
        int k=Ave(a,b,c);
        System.out.println("Total Average is :"+k);
    }
}