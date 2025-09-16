
import java.util.Scanner;

public class TowerOfHonoi{
    public static void Tower(int n,String s, String h,String d) {
        if(n==1)
        {
            System.err.println("Transfer disk"+ n +"from"+ s +
        "to"+ d);
        return;
        }
        Tower(n-1,s,h,d);
        System.err.println("Transfer disk"+ n +"from"+ s +"to"+ d);
        Tower(n-1,h,s,d);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Tower(n, "s", "h", "d");
    }
}