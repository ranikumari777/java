
import java.util.Scanner;


public class TwoDArray{
public static void main(String args[])
{
    Scanner sc =new Scanner(System.in);
    int row=sc.nextInt();
    int col=sc.nextInt();
    int[][] arr=new int[row][col];
    System.out.println("Inputs all matrix:");
    for(int i=0; i<row; i++)
    {
        for(int j=0; j<col; j++)
        {
            arr[i][j]=sc.nextInt();
        }
    }
    System.out.println("Print all martix :");
    for(int i=0; i<row; i++)
    {
        for(int j=0; j<col; j++)
        {
            System.out.print(arr[i][j]);
        }
        System.out.println();
    }
}
}