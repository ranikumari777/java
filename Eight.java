
import java.util.Scanner;

public class Eight{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Circule of Radius ");
        int r= sc.nextInt();
         float a;
        a=3.14f*r*r;
        System.out.println("Area of Circles = "+a);
    }
}