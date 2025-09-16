
import java.util.Scanner;

public class LastOccurrence {

    // Function to find the last occurrence of x in arr[]
    public static int printLastOccurrence(int arr[], int x) {
        int last = -1;  // Initialize last occurrence index as -1 (indicating not found)

        // Traverse the array from start to end
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                last = i;  // Update last index if x is found
            }
        }
        return last;  // Return the last occurrence index of x
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the size of the array
        int n = sc.nextInt();
        int arr[] = new int[n];

        // Read elements of the array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Read the number x to find the last occurrence
        int x = sc.nextInt();

        // Call the function and print the result
        int result = printLastOccurrence(arr, x);
        if (result == -1) {
            System.out.println("Element " + x + " not found in the array.");
        } else {
            System.out.println("Last occurrence of " + x + " is at index: " + result);
        }

        sc.close();
    }
}
