
import java.util.Scanner;



public class Recusrion2{
    public static void printfun2(int n,int sum) {
        if(n==0)
       {
        System.out.println("Final Sum: " + sum);
        return;
       }
       sum +=n;
       System.out.println(sum);
    
       printfun2(n-1,0);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in) ;
            int n=sc.nextInt();
          
            printfun2(n,0);
        
    }
}
