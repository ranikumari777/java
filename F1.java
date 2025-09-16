
import java.util.Scanner;
public class F1{
    public static int calsub(int a,int b) {
        int sum = a-b;
        return sum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=calsub(a,b);
        System.out.println("Addition is the numbers :"+sum);
    }
}