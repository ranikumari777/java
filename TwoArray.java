
import java.util.Scanner;

public class TwoArray{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int arr[][]=new int[row][col];//declear a two dimensional array
        System.out.println("Enter all user inputs");
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                arr[i][j]=sc.nextInt();//user inputs
            }
        }
  
    System.out.println("Display all user inputs");
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                System.out.print((arr[i][j])+" ");
            }
            System.out.println("");
        }
    }
}