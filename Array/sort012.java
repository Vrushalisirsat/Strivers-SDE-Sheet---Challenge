import java.util.* ;
import java.io.*; 
public class sort012 
{
    public static void sort012(int[] arr)
    {
        //Write your code here
        int low=0;
        int mid=0;
        int high=arr.length-1;

       while(mid <= high)
       {
        if(arr[mid] == 0)
        {
            int temp=arr[low];
            arr[low]=arr[mid];
            arr[mid]=temp;
            low++;
            mid++;
        }
        else if(arr[mid] == 1)
        {
            mid++;
        }
        else
        {
            int temp = arr[mid];
            arr[mid] = arr[high];
            arr[high] = temp;
            high--;
        }

       }
    }

    public static void main(String args[]) {
        int n = 6;
        int arr[] = {0, 2, 1, 2, 0, 1};
        sort012(arr);
        System.out.println("After sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
}