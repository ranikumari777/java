import java.util.*;

public class  First{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int age = sc.nextInt();
        if(age>=18)
        {
            System.out.println("It is adult");
        }
        else
        {
            System.out.println("it is not Adults");
        }
    }
}