
import java.util.Scanner;



public class Selection{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<n-1; i++)
        {
            int minidex=i;

            for(int j=i+1; j<n; j++)
            {
                if(arr[j]>arr[minidex])
                {
                    minidex=j;
                }
            }
            int temp=arr[minidex];
            arr[minidex]=arr[i];
            arr[i]=temp;

        }
        for(int i=0; i<n; i++)
        {
            System.err.println(arr[i]);
        }
    }
}