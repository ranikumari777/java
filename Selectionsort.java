
public class Selectionsort{
    public static void printarray(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"");
        }
        System.out.println();
        
    }
    public static void main(String[] args)
    {
        int arr[]={7, 8, 1, 3, 2};

        //Seclection
        for(int i=0; i<arr.length-1; i++)
        {
            int sml=i;
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[j]<arr[sml])
                {
                    sml=j;
                }
            }
            int temp=arr[sml];
            arr[sml]=arr[i];
            arr[i]=temp;
        }
        printarray(arr);
    } 
}