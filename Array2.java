
import java.util.Scanner;

public class Array2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter of Array sizes");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Input All Array:");
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Display of all Array:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        int sum=0;
        for (int i = 0; i < n; i++) {
            sum=sum+arr[i];
        }
        System.err.println("Total Array Sum is : "+sum);
    }
}