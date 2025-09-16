//Take an array as input from the user. Serach for a given numbers x and print the index at which it occurs.
import java.util.Scanner;

public class Array3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]=sc.nextInt();//user inputs
        }
        System.out.println(".(Search a numbers:)");
        int x=sc.nextInt();
        for (int i = 0; i < size; i++) {
            if(x==arr[i]){
                System.out.println("Index is "+i);
            }
        }
    }
}