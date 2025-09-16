import java.util.*;
public class Four{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        if(a==b){
            System.out.println("Equal numbers");
        }
        else{
            if (a>b) {
                System.out.println("A is largest");
            }
            else{
                System.out.println("B is smallest");
            }
        }
    }
}