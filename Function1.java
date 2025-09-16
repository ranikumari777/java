
import java.util.*;
public class Function1{
    public static int caladd(int a,int b) {
        int sum = a+b;
        return sum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=caladd(a,b);
        System.out.println("Addition is :"+sum);
      
    }
}