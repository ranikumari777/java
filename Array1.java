import java.util.*;
public class Array1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int arr[]=new int[n];
        System.out.println("All inputs of Array:");
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("All Array of outputs:");
        for(int i=0; i<n; i++)
        {
            System.out.println(arr[i]);
        }
    }
}